# content-connector-api

Interested content providers must implement a Java interface, called ContentConnector. The implementation is then included in the code of the ContentService of the OpenMinTeD platform. 

The interface implies that the following methods should be provided:

* search, which accepts a Query object describing a query and returns a page of metadata. \\
This method is used for browsing the metadata of the provider and supports keyword search, advanced search in a number of fields and also faceted search. The result of the method is \\
(a) a page (of user specified size) of metadata, \\
(b) the statistics of the results (total number of hits, etc), and \\
(c) the facets (if requested).\\

* fetchMetadata, which accepts a Query, but, unlike the previous method, returns all the metadata of the result, without any statistics or facets. \\
The result is a stream containing a single xml element (called “publications”), which in turn contains all the metadata of the content. This method is called when a corpus is being built.
* downloadFullText, which given a publication identifier (as contained in the metadata) returns a stream containing the actual content.\\
This method is again used when the platform is building a corpus.
