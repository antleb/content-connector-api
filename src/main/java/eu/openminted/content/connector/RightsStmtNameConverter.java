package eu.openminted.content.connector;

import eu.openminted.registry.domain.RightsStatementEnum;

public class RightsStmtNameConverter {
    public static RightsStatementEnum convert(String bestLicence) {

        switch (bestLicence) {
            case "Open Access":
                return RightsStatementEnum.OPEN_ACCESS;
            case "12 Months Embargo":
            case "6 Months Embargo":
            case "Embargo":
                return RightsStatementEnum.EMBARGOED_ACCESS;
            case "Restricted":
            case "Closed Access":
                return RightsStatementEnum.RESTRICTED_ACCESS;
        }
        return null;
    }
}
