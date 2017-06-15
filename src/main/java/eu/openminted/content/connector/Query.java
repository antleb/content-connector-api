package eu.openminted.content.connector;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by antleb on 11/7/16.
 *
 * Describes a query to a content provider
 */
public class Query {

    /** a generic keyword for a google like search **/
    private String keyword;
    /** extra constraints of the query */
    private Map<String, List<String>> params;
    /** the list of fields that browse information will be returned for. Empty list for no browse results.  */
    private List<String> facets;
    /** used for paging only, inclusive */
    private int from;
    /** used for paging only, non inclusive */
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
        if (facets == null) {
            facets = new ArrayList<>();
        }
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
