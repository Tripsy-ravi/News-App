package com.example.android.newsapp;

public class Articles {

    private String title;
    private String description;
    private String urlToImage;
    private String url;
    private String content;

    public Articles(String title, String description, String uriToImage, String url, String content) {
        this.title = title;
        this.description = description;
        this.urlToImage = uriToImage;
        this.url = url;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    public void setUriToImage(String uriToImage) {
        this.urlToImage = uriToImage;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
