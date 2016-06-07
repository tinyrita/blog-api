package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Blog;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-06T11:12:38.238Z")
public abstract class BlogApiService {
  
      public abstract Response addBlog(Blog body,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response deleteBlog(SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response findBlogsByStatus(List<String> status,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response findBlogsByTags(List<String> tags,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response getBlog(SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response getBlogById(SecurityContext securityContext, String id)
      throws NotFoundException;
  
      public abstract Response updateBlog(Blog body,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response updateBlogWithForm(SecurityContext securityContext)
      throws NotFoundException;
  
}
