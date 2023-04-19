# Spring RESTful API for URL Shortener using Google Guava and H2 Database

This repository contains a Spring RESTful API for a URL shortener tool that converts long URLs to tiny strings using Google Guava and stores them in an H2 database.

## Features

- Converts long URLs to tiny strings
- Uses Google Guava to generate unique and random strings
- Stores the tiny strings and their corresponding long URLs in an H2 database
- Provides RESTful API endpoints for creating and retrieving tiny URLs
- Easy to use and integrate into existing applications
- Regularly updated to ensure it remains secure and up-to-date with the latest best practices

## Getting Started

To use the URL shortener tool, simply clone the repository and run the tool using your preferred programming language or framework. The tool is designed to be easy to use and integrate into existing applications.
```
$ git clone https://github.com/Ahmed-Elgohary1/UrlShortener.git
```

## Usage

The API provides two endpoints:

### Create Tiny URL

To create a tiny URL, send a POST request to the /generate endpoint with the long URL in the request body. The API will generate a unique and random tiny string using Google Guava, store the tiny string and its corresponding long URL in the H2 database, and return the tiny string in the response body.

Example request:
```
POST /generate HTTP/1.1
Host: localhost:8080
Content-Type: application/json

{
    "longUrl": "https://www.example.com/this/is/a/long/url"
}
```

Example response:
```
HTTP/1.1 200 OK
Content-Type: application/json

{
    "tinyUrl": "abc123"
}
```

### Retrieve Long URL

To retrieve the long URL corresponding to a tiny URL, send a GET request to the /tinyurl/{tinyUrl} endpoint with the tiny URL as a path variable. The API will retrieve the long URL from the H2 database and redirect the user to the long URL.

Example request:
```
GET /UrlShortener/abc123 HTTP/1.1
Host: localhost:8080
```

Example response:
```
HTTP/1.1 302 Found
Location: https://www.example.com/this/is/a/long/url
```

## Contributing

Contributions to the URL shortener tool are welcome and encouraged. To contribute, simply fork the repository, make your changes, and submit a pull request. All contributions must adhere to the repository's code of conduct and contribution guidelines.

## License

This repository is licensed under the MIT License. See the LICENSE file for more information.
