int getGroupingType(String grouping) {
    return switch (grouping) {
        case NO_GROUPING, "orgGroupByCountry", "orgGroupByTypeOfOrgName" -> ORG_CATALOG;
        case "part" -> PART_CATALOG;
        default -> throw new IllegalArgumentException("Invalid grouping!");
    };
}