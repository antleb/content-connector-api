package eu.openminted.content.connector;

import eu.openminted.registry.core.domain.Facet;

import java.util.ArrayList;
import java.util.List;

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

    public void setTotalHits(int totalHits) {
        this.totalHits = totalHits;
    }

    public void setPublications(List<String> publications) {
        this.publications = publications;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public void setTo(int to) {
        this.to = to;
    }

    public void setFacets(List<Facet> facets) {
        this.facets = facets;
    }

    public List<String> getPublications() {
        return publications;
    }

    public int getTotalHits() {
        return totalHits;
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }

    public List<Facet> getFacets() {
        return facets;
    }
}