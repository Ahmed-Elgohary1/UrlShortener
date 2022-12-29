package com.clone.urlShortener.model;

public class UrlErrorResponseDto {
    private String status;
    private String error;


    public UrlErrorResponseDto(String status, String error) {
        this.status = status;
        this.error = error;
    }

    public UrlErrorResponseDto() {
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "UrlErrorResponseDto{" +
                "status='" + status + '\'' +
                ", error='" + error + '\'' +
                '}';
    }

}
