package eu.openminted.content.connector.faceting;

import eu.openminted.registry.domain.PublicationTypeEnum;
import eu.openminted.registry.domain.RightsStatementEnum;

import java.util.HashMap;
import java.util.Map;

public class OMTDFacetInitializer {
    private Map<OMTDFacetEnum, String> omtdFacetLabels = new HashMap<>();
    private Map<RightsStatementEnum, String> omtdRightsStmtLabels = new HashMap<>();
    private Map<PublicationTypeEnum, String> omtdPublicationTypeLabels = new HashMap<>();


    public OMTDFacetInitializer() {
        omtdFacetLabels.put(OMTDFacetEnum.PUBLICATION_TYPE, "Publication Type");
        omtdFacetLabels.put(OMTDFacetEnum.PUBLICATION_YEAR, "Publication Year");
        omtdFacetLabels.put(OMTDFacetEnum.RIGHTS_STMT_NAME, "Rights Statement");
        omtdFacetLabels.put(OMTDFacetEnum.RIGHTS, "Rights");
        omtdFacetLabels.put(OMTDFacetEnum.DOCUMENT_LANG, "Language");
        omtdFacetLabels.put(OMTDFacetEnum.DOCUMENT_TYPE, "Document Type");
        omtdFacetLabels.put(OMTDFacetEnum.SOURCE, "Content Source");

        omtdRightsStmtLabels.put(RightsStatementEnum.OPEN_ACCESS, "Open Access");
        omtdRightsStmtLabels.put(RightsStatementEnum.RESTRICTED_ACCESS, "Restricted Access");

        omtdPublicationTypeLabels.put(PublicationTypeEnum.ANNOTATION, "Annotation");
        omtdPublicationTypeLabels.put(PublicationTypeEnum.RESEARCH_ARTICLE, "Research Article");
        omtdPublicationTypeLabels.put(PublicationTypeEnum.DOCTORAL_THESIS, "Doctoral Thesis");
        omtdPublicationTypeLabels.put(PublicationTypeEnum.CONFERENCE_OBJECT, "Conference Object");
        omtdPublicationTypeLabels.put(PublicationTypeEnum.PRE_PRINT, "Pre Print");
        omtdPublicationTypeLabels.put(PublicationTypeEnum.RESEARCH_REPORT, "Research Report");
        omtdPublicationTypeLabels.put(PublicationTypeEnum.BOOK, "Book");
        omtdPublicationTypeLabels.put(PublicationTypeEnum.MASTER_THESIS, "Master Thesis");
        omtdPublicationTypeLabels.put(PublicationTypeEnum.BOOK_PART, "Book Part");
        omtdPublicationTypeLabels.put(PublicationTypeEnum.REPORT, "Report");
        omtdPublicationTypeLabels.put(PublicationTypeEnum.REVIEW, "Review");
        omtdPublicationTypeLabels.put(PublicationTypeEnum.BACHELOR_THESIS, "Bachelor Thesis");
        omtdPublicationTypeLabels.put(PublicationTypeEnum.LECTURE, "Lecture");
        omtdPublicationTypeLabels.put(PublicationTypeEnum.PATENT, "Patent");
        omtdPublicationTypeLabels.put(PublicationTypeEnum.CONTRIBUTION_TO_JOURNAL, "Contribution to Journal");
        omtdPublicationTypeLabels.put(PublicationTypeEnum.DATA_PAPER, "Data Paper");
        omtdPublicationTypeLabels.put(PublicationTypeEnum.OTHER, "Other");
    }

    public Map<OMTDFacetEnum, String> getOmtdFacetLabels() {
        return omtdFacetLabels;
    }

    public Map<RightsStatementEnum, String> getOmtdRightsStmtLabels() {
        return omtdRightsStmtLabels;
    }

    public Map<PublicationTypeEnum, String> getOmtdPublicationTypeLabels() {
        return omtdPublicationTypeLabels;
    }
}
