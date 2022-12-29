package com.clone.urlShortener.service;

import com.clone.urlShortener.model.Url;
import com.clone.urlShortener.model.UrlDto;
import org.springframework.stereotype.Service;

@Service

public interface iUrlService {

    public Url generateShortLink(UrlDto urlDto);
    public Url persistShortLink(Url url);
    public Url getEncodedUrl(String url);
    public  void  deleteShortLink(Url url);
}

