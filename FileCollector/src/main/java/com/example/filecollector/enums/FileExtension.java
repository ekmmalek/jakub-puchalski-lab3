package com.example.filecollector.enums;

public enum FileExtension {
    CSV("csv"),
    TXT("txt");

    private String extension;

    FileExtension(String extension) {
        this.extension = extension;
    }

    public String getExtension() {
        return extension;
    }
}
