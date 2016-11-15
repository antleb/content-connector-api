package eu.openminted.content.connector;


import eu.openminted.registry.domain.DocumentMetadataRecord;
import eu.openminted.registry.domain.Facet;

import java.util.List;

/**
 * Created by antleb on 11/7/16.
 */
public class SearchResult {

    private List<DocumentMetadataRecord> publications;
    private int totalHits;
    private int from;
    private int to;
    private List<Facet> facets;

    public SearchResult() {
    }

    public SearchResult(List<DocumentMetadataRecord> publications, int totalHits, int from, int to, List<Facet> facets) {
        this.publications = publications;
        this.totalHits = totalHits;
        this.from = from;
        this.to = to;
        this.facets = facets;
    }

    public List<DocumentMetadataRecord> getPublications() {
        return publications;
    }

    public void setPublications(List<DocumentMetadataRecord> publications) {
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
