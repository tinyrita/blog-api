package io.swagger.api.factories;

import io.swagger.api.BlogApiService;
import io.swagger.api.impl.BlogApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-06T11:12:38.238Z")
public class BlogApiServiceFactory {

   private final static BlogApiService service = new BlogApiServiceImpl();

   public static BlogApiService getBlogApi()
   {
      return service;
   }
}
