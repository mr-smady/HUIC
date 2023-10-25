package com.huic.graphqlservice;


import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "huic.graphql")
public class GraphqlServiceProperties {
    //book-service-endpoint
    private String bookServiceEndpoint;
    private String authorServiceEndpoint;

    public String getBookServiceEndpoint() {
        return bookServiceEndpoint;
    }

    public void setBookServiceEndpoint(String bookServiceEndpoint) {
        this.bookServiceEndpoint = bookServiceEndpoint;
    }

    public String getAuthorServiceEndpoint() {
        return authorServiceEndpoint;
    }

    public void setAuthorServiceEndpoint(String authorServiceEndpoint) {
        this.authorServiceEndpoint = authorServiceEndpoint;
    }
}
