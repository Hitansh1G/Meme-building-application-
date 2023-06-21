package com.crio.starter.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import com.fasterxml.jackson.annotation.JsonProperty;



// @JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Memes {

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Integer id;

    @NonNull
    private String name;

    @NonNull
    private String url;

    @NonNull
    private String caption;

    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setUrl(String url){
        this.url = url;
    }
    public void setCaption(String caption){
        this.caption = caption;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getUrl(){
        return this.url;
    }
    public String getCaption(){
        return this.caption;
    }


}