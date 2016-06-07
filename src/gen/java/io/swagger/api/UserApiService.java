package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.User;
import java.util.List;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-06T11:12:38.238Z")
public abstract class UserApiService {
  
      public abstract Response createUser(User body,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response createUsersWithArrayInput(List<User> body,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response createUsersWithListInput(List<User> body,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response deleteUser(String userlogin,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response getUser(SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response getUserByName(String userlogin,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response updateUser(String userlogin,User body,SecurityContext securityContext)
      throws NotFoundException;
  
}
