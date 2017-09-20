# content-connector-api

## Java API

The content-connector-api defines the Java API that a content provider must implement in 
order to be included in OpenMinTeD. This API allows the OpenMinTeD platform to search for 
scientific publications, refine the results (based on a number of predefined facets) and 
then download the fulltext of the publications and also download the metadata of the publications
in bulk mode.

The main class of the API is [ContentConnector](src/main/java/eu/openminted/content/connector/ContentConnector.java), which
defined four methods (see the javadoc for more information):

- **search**(), which allows the users to perform queries on the metadata and get paged search 
results containing both a page of the metadata and the facets.
- **fetchMetadata**(), which returns an InputStream containing an xml file with the metadata of 
all the results of the query. The root element of the xml file is <publications> and its 
children are the metadata of the publications in the [OMTD-SHARE](https://github.com/openminted/omtd-share-schema) schema.
- **downloadFullText**(), which returns the fulltext of a publication in an InputStream.


The two auxiliary classes that are used by the interaface are [Query](src/main/java/eu/openminted/content/connector/Query.java) 
and [SearchResult](src/main/java/eu/openminted/content/connector/SearchResult.java). The former
describes a query in the metadata and contains the following information:
- **keyword**: the term for a generic, google like search.
- **params**: a list of extra constraints (e.g. _`publicationYear=2016`_, _`licence=CC-BY`_). 
- **facets**: the list of metadata fields for which statistics will be returned. 
- **from** and **to**: used for the paging of the results. 

The latter class contains the results of a query:
- **publications**: a page of publications metadata.
- **totalHits**: the total number of results for the query
- **from** and **to**: the position of the page of results in the total results
- **facets**: statistics about the query results

## Search options and facets
In the [Query](src/main/java/eu/openminted/content/connector/Query.java) class the search parameters do not belong in a
well defined enumeration (coming in a next release) and the same applies for the possible facets that the user can ask for.
The currently supported list of query parameters is the following:
- **publicationtype** the type of the publication (e.g. 'article', 'thesis'; see PublicationTypeEnum in OMTD-SHARE schema)
- **publicationyear** the year of the publication
- **publisher**: the publisher of the publication
- **rights**: the licence of the publication (see RightsStatementEnum in OMTD-SHARE schema)
- **documentlanguage**: the language of the publication (iso639-1 or iso639-3)
- **documenttype**: The type of fulltext of the publication (fulltext, abstract)
- **keyword**: one or more keyword characterising the publication.

## Future steps
In the next major version of the API we plan to include a REST API, so that content providers need not provide a Java 
implementation but they can provide a REST endpoint. Also, we'll define vocabularies and enumerations that will prevent
the users for making illegal queries.