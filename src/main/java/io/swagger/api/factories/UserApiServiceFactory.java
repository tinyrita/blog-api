package io.swagger.api.factories;

import io.swagger.api.UserApiService;
import io.swagger.api.impl.UserApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-06T11:12:38.238Z")
public class UserApiServiceFactory {

   private final static UserApiService service = new UserApiServiceImpl();

   public static UserApiService getUserApi()
   {
      return service;
   }
}
