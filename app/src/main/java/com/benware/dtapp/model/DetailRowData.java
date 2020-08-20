package com.benware.dtapp.model;

public class DetailRowData {
    private String label;
    private String field;

    public DetailRowData(String label, String field) {
        this.label = label;
        this.field = field;
    }

    public String getLabel() {
        return label;
    }
    public String getField() {
        return field;
    }
}
