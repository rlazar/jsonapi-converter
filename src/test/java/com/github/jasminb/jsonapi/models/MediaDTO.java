package com.github.jasminb.jsonapi.models;


import com.github.jasminb.jsonapi.annotations.Id;
import com.github.jasminb.jsonapi.annotations.Type;


@Type("media")
public class MediaDTO {
    @Id
    private String      id;

    public MediaDTO() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
