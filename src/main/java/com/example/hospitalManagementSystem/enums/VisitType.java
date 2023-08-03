package com.example.hospitalManagementSystem.enums;

public enum VisitType {
    IPD("In-Patient Department"),
    OPD("Out-Patient Department");

    private final String displayName;

    VisitType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
