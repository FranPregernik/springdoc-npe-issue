package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;

public interface EntityDefinition {

    @JsonIgnore
    String getKey();

    @JsonIgnore
    String getDescription();
}
