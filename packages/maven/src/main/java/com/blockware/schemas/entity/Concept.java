package com.blockware.schemas.entity;

@lombok.Data
public class Concept {
    private String kind;
    private Metadata metadata;
    private ConceptSpec spec;
}
