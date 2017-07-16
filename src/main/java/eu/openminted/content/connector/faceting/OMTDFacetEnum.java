package eu.openminted.content.connector.faceting;

public enum OMTDFacetEnum {
    PUBLICATION_TYPE("publicationtype"),
    PUBLICATION_YEAR("publicationyear"),
    PUBLISHER("publisher"),
    RIGHTS_STMT_NAME("rightsstmtname"),
    RIGHTS("rights"),
    DOCUMENT_LANG("documentlanguage"),
    DOCUMENT_TYPE("documenttype"),
    KEYWORD("keyword"),
    SOURCE("source");

    private final String value;

    OMTDFacetEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OMTDFacetEnum fromValue(String v) {
        for (OMTDFacetEnum c: OMTDFacetEnum.values()) {
            if (c.value.equalsIgnoreCase(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
