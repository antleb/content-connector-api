package eu.openminted.content.connector;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by antleb on 11/7/16.
 */
public interface ContentConnector {

    /**
     *  Standard method to search for publications.
     *
     * @param query
     *
     * @return a page of search results
     */
    SearchResult search(Query query) throws IOException;

    /**
     * Returns the contents of the fulltext of a document. Metadata about filename, mime type, etc should
     * be in the respective metadata, so they are not needed here.
     *
     * @param documentId The publication identifier.
     *
     * @return an input stream with the contents of a publication.
     */
    InputStream downloadFullText(String documentId);

    /**
     * Performs a query and returns all metadata (ignoring from and to parameters of the query). It is used for bulk
     * downloading the metadata. The format of the response is:
     *
     * <publications>
     *     <ms:documentMetadataRecord>...</ms:documentMetadataRecord>
     *     <ms:documentMetadataRecord>...</ms:documentMetadataRecord>
     *     <ms:documentMetadataRecord>...</ms:documentMetadataRecord>
     *     <ms:documentMetadataRecord>...</ms:documentMetadataRecord>
     *     ...
     * </publications>
     *
     * @param query
     *
     * @return all the metadata of publications matching this query.
     */
    InputStream fetchMetadata(Query query);

    /**
     * Returns an identifier for this connector ("omtd", "CORE", "Crossref",...).
     *
     * @return
     */
    String getSourceName();
}