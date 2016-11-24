package eu.openminted.content.connector;


import eu.openminted.registry.domain.DocumentMetadataRecord;
import eu.openminted.registry.domain.Facet;

import java.util.List;
import java.util.Map;

/**
 * Created by antleb on 11/7/16.
 */
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
    }

    public SearchResult(List<String> publications, int totalHits, int from, int to, List<Facet> facets) {
        this.publications = publications;
        this.totalHits = totalHits;
        this.from = from;
        this.to = to;
        this.facets = facets;
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