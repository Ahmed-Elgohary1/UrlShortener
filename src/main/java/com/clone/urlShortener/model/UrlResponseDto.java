package com.clone.urlShortener.model;

import java.time.LocalDateTime;

// that class works as Adepter between "Url" and restful requirements "UrlResponseDto"


public class UrlResponseDto
{
    private String originalUrl;
    private String shortLink;
    private LocalDateTime expirationDate;

    public UrlResponseDto() {
    }
    public UrlResponseDto(Url url) {

        this.originalUrl = url.getOriginalUrl();
        this.shortLink = url.getShortLink();
        this.expirationDate = url.getExpirationDate();
    }


    public String getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public String getShortLink() {
        return shortLink;
    }

    public void setShortLink(String shortLink) {
        this.shortLink = shortLink;
    }

    public LocalDateTime getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDateTime expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "UrlResponseDto{" +
                "originalUrl='" + originalUrl + '\'' +
                ", shortLink='" + shortLink + '\'' +
                ", expirationDate=" + expirationDate +
                '}';
    }
}