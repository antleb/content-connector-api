package eu.openminted.content.connector;

import java.util.List;
import java.util.Map;

/**
 * Created by antleb on 11/7/16.
 */
public class Query {

    private String keyword;
    private Map<String, List<String>> params;
    private List<String> facets;
    private int from;
    private int to;

    public Query() {
    }

    public Query(String keyword, Map<String, List<String>> params, List<String> facets, int from, int to) {
        this.keyword = keyword;
        this.params = params;
        this.facets = facets;
        this.from = from;
        this.to = to;
    }

    public List<String> getFacets() {
        return facets;
    }

    public void setFacets(List<String> facets) {
        this.facets = facets;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Map<String, List<String>> getParams() {
        return params;
    }

    public void setParams(Map<String, List<String>> params) {
        this.params = params;
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
}
