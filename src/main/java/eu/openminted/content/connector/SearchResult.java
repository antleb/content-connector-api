package eu.openminted.content.connector;

import eu.openminted.registry.domain.Facet;
import eu.openminted.registry.domain.Value;

import java.util.*;
import java.util.stream.Collectors;

public class SearchResult {

    /** the page of metadata records in the omtd schema */
    private List<String> publications;
    /** the total number of results */
    private int totalHits;
    private int from;
    private int to;
    /** facets */
    private List<Facet> facets;

    public SearchResult() {
        this.publications = new ArrayList<>();
        this.totalHits = 0;
        this.from = 0;
        this.to = 1;
        this.facets = new ArrayList<>();
    }

    public SearchResult(List<String> publications, int totalHits, int from, int to, List<Facet> facets) {
        this.publications = publications;
        this.totalHits = totalHits;
        this.from = from;
        this.to = to;
        this.facets = facets;
    }


    public SearchResult merge(SearchResult result) {
        this.setTotalHits(this.getTotalHits() + result.getTotalHits());

        this.setFacets(mergeFacets(this.getFacets(), result.getFacets()));

        //TODO: how to merge results? do we need to?

        return this;
    }

    private List<Facet> mergeFacets(List<Facet> f1, List<Facet> f2) {
//        Map<String, Facet> mf1 = new HashMap<>();
        if (f1 != null && f2 != null)
            return mergeFacets(
                    f1.stream().collect(Collectors.toMap(Facet::getField, f -> f)),
                    f2.stream().collect(Collectors.toMap(Facet::getField, f -> f))).
                    values().stream().collect(Collectors.toList());

        if (f1 == null && f2 == null) return new ArrayList<>();

        if (f1 == null) return f2;
        else return f1;
    }

    private Map<String, Facet> mergeFacets(Map<String, Facet> f1, Map<String, Facet> f2) {
        Map<String, Facet> temp = new HashMap<>();

        for (Map.Entry<String, Facet> e : f1.entrySet()) {
            if (e.getKey().equalsIgnoreCase("publicationyear")) {
                temp.put(e.getKey(), getPublicationYearFacet(e.getValue()));
            } else
                temp.put(e.getKey(), e.getValue());
        }

        for (Map.Entry<String, Facet> e : f2.entrySet()) {
            Facet facet;

            if (e.getKey().equalsIgnoreCase("publicationyear")) {
                facet = getPublicationYearFacet(e.getValue());
            } else {
                facet = e.getValue();
            }

            if (temp.containsKey(e.getKey())) {
                temp.put(e.getKey(), mergeFacet(temp.get(e.getKey()), facet));
            } else {
                temp.put(e.getKey(), facet);
            }
        }

        return temp;
    }

    private Facet mergeFacet(Facet f1, Facet f2) {
        Facet f = new Facet();
        Map<String, Integer> temp = new HashMap<>();

        f.setField(f1.getField());
        f.setLabel(f1.getLabel());
        f.setValues(new ArrayList<>());

        for (Value v : f1.getValues())
            temp.put(v.getValue(), v.getCount());

        for (Value v : f2.getValues())
            if (temp.containsKey(v.getValue()))
                temp.put(v.getValue(), v.getCount() + temp.get(v.getValue()));
            else
                temp.put(v.getValue(), v.getCount());

        for (Map.Entry<String, Integer> e : temp.entrySet()) {
            Value v = new Value();

            v.setValue(e.getKey());
            v.setCount(e.getValue());

            f.getValues().add(v);
        }

        Collections.sort(f.getValues());

        return f;
    }

    private Facet getPublicationYearFacet(Facet publicationYearFacet) {
        Facet facet = new Facet();
        facet.setField(publicationYearFacet.getField());
        facet.setLabel(publicationYearFacet.getLabel());
        facet.setValues(mergeValues(publicationYearFacet));
        return facet;
    }

    private List<Value> mergeValues(Facet facet) {
        Map<String, Value> tmpValues = new HashMap<>();

        for (Value value : facet.getValues()) {
            Value tmpValue = new Value();
            tmpValue.setCount(value.getCount());
            tmpValue.setValue(value.getValue().substring(0, 4));

            if (tmpValues.containsKey(tmpValue.getValue())) {
                int currentCount = tmpValues.get(tmpValue.getValue()).getCount();
                tmpValues.get(tmpValue.getValue()).setCount(currentCount + tmpValue.getCount());
            } else {
                tmpValues.put(tmpValue.getValue(), tmpValue);
            }
        }

        List<Value> values = new ArrayList<>(tmpValues.values());
        Collections.sort(values);
        Collections.reverse(values);
        return values;
    }

    public void printFacet(Facet facet) {
        System.out.println("field:" + facet.getField());
        System.out.println("values:[");
        for (Value value : facet.getValues()) {
            System.out.println(value.getValue());
            System.out.println(value.getCount());
        }
        System.out.println("]");
    }





    public List<String> getPublications() {
        return publications;
    }

    public void setPublications(List<String> publications) {
        this.publications = publications;
    }

    public int getTotalHits() {
        return totalHits;
    }

    public void setTotalHits(int totalHits) {
        this.totalHits = totalHits;
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }

    public List<Facet> getFacets() {
        return facets;
    }

    public void setFacets(List<Facet> facets) {
        this.facets = facets;
    }
}