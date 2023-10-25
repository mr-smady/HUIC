package com.huic.graphqlservice;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class GraphqlResolver {
    @QueryMapping
    public String sayHi(){
        return "Hi There";
    }

}
