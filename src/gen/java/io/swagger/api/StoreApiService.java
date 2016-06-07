package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Order;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-06T11:12:38.238Z")
public abstract class StoreApiService {
  
      public abstract Response deleteOrder(String orderId,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response getOrderById(String orderId,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response placeOrder(Order body,SecurityContext securityContext)
      throws NotFoundException;
  
}
