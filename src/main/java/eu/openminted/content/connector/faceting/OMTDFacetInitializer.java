package eu.openminted.content.connector.faceting;

import eu.openminted.registry.domain.PublicationTypeEnum;
import eu.openminted.registry.domain.RightsStatementEnum;

import java.util.HashMap;
import java.util.Map;

public class OMTDFacetInitializer {
    private Map<OMTDFacetEnum, String> omtdFacetLabels = new HashMap<>();
    private Map<RightsStatementEnum, String> omtdRightsStmtLabels = new HashMap<>();
    private Map<PublicationTypeEnum, String> omtdPublicationTypeLabels = new HashMap<>();
    private Map<String, PublicationTypeEnum> omtdGetPublicationTypeEnumFromLabel = new HashMap<>();
    private Map<String, RightsStatementEnum> omtdGetRightsStmtEnumFromLabel = new HashMap<>();


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

        omtdGetPublicationTypeEnumFromLabel.put("Annotation", PublicationTypeEnum.ANNOTATION);
        omtdGetPublicationTypeEnumFromLabel.put("Research Article", PublicationTypeEnum.RESEARCH_ARTICLE);
        omtdGetPublicationTypeEnumFromLabel.put("Doctoral Thesis", PublicationTypeEnum.DOCTORAL_THESIS);
        omtdGetPublicationTypeEnumFromLabel.put("Conference Object", PublicationTypeEnum.CONFERENCE_OBJECT);
        omtdGetPublicationTypeEnumFromLabel.put("Pre Print", PublicationTypeEnum.PRE_PRINT);
        omtdGetPublicationTypeEnumFromLabel.put("Research Report", PublicationTypeEnum.RESEARCH_REPORT);
        omtdGetPublicationTypeEnumFromLabel.put("Book", PublicationTypeEnum.BOOK);
        omtdGetPublicationTypeEnumFromLabel.put("Master Thesis", PublicationTypeEnum.MASTER_THESIS);
        omtdGetPublicationTypeEnumFromLabel.put("Book Part", PublicationTypeEnum.BOOK_PART);
        omtdGetPublicationTypeEnumFromLabel.put("Report", PublicationTypeEnum.REPORT);
        omtdGetPublicationTypeEnumFromLabel.put("Review", PublicationTypeEnum.REVIEW);
        omtdGetPublicationTypeEnumFromLabel.put("Bachelor Thesis", PublicationTypeEnum.BACHELOR_THESIS);
        omtdGetPublicationTypeEnumFromLabel.put("Lecture", PublicationTypeEnum.LECTURE);
        omtdGetPublicationTypeEnumFromLabel.put("Patent", PublicationTypeEnum.PATENT);
        omtdGetPublicationTypeEnumFromLabel.put("Contribution to Journal", PublicationTypeEnum.CONTRIBUTION_TO_JOURNAL);
        omtdGetPublicationTypeEnumFromLabel.put("Data Paper", PublicationTypeEnum.DATA_PAPER);
        omtdGetPublicationTypeEnumFromLabel.put("Other", PublicationTypeEnum.OTHER);

        omtdGetRightsStmtEnumFromLabel.put("Open Access", RightsStatementEnum.OPEN_ACCESS);
        omtdGetRightsStmtEnumFromLabel.put("Restricted Access", RightsStatementEnum.RESTRICTED_ACCESS);

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

    public Map<String, PublicationTypeEnum> getOmtdGetPublicationTypeEnumFromLabel() {
        return omtdGetPublicationTypeEnumFromLabel;
    }

    public Map<String, RightsStatementEnum> getOmtdGetRightsStmtEnumFromLabel() {
        return omtdGetRightsStmtEnumFromLabel;
    }
}
