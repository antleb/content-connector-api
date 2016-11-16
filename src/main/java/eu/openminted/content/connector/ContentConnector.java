package eu.openminted.content.connector;

import java.io.InputStream;
import java.util.List;

/**
 * Created by antleb on 11/7/16.
 */
public interface ContentConnector {

    public SearchResult search(Query query);

    public InputStream downloadFullText(String documentId);

    public String getSourceName();
}
