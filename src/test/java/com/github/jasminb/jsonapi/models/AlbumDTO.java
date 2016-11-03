package com.github.jasminb.jsonapi.models;


import com.github.jasminb.jsonapi.annotations.Id;
import com.github.jasminb.jsonapi.annotations.MapFromRelationshipMeta;
import com.github.jasminb.jsonapi.annotations.Relationship;
import com.github.jasminb.jsonapi.annotations.Type;


@Type("albums")
public class AlbumDTO {
    private String      title;
    private String      shortID;

    @Relationship(value = "cover", resolve = true)
    private MediaDTO      cover;

    @MapFromRelationshipMeta(value = "cover", attribute = "uri")
    private String        coverMediaUri;

    @Id
    private String      id;

    public AlbumDTO() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShortID() {
        return shortID;
    }

    public void setShortID(String shortID) {
        this.shortID = shortID;
    }

    public MediaDTO getCover() {
        return cover;
    }

    public void setCover(MediaDTO cover) {
        this.cover = cover;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCoverMediaUri() {
        return coverMediaUri;
    }

}
