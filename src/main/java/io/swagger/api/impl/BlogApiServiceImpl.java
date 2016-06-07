package io.swagger.api.impl;
import io.swagger.api.dao.BlogDao;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Blog;

import java.util.ArrayList;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;
import java.util.concurrent.Callable;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import com.google.gson.Gson;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-06T11:12:38.238Z")
public class BlogApiServiceImpl extends BlogApiService {

    Gson gson = new Gson();

    @Override
    public Response addBlog(Blog body, SecurityContext securityContext)
    throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    
    @Override
    public Response deleteBlog(SecurityContext securityContext)
    throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    
    @Override
    public Response findBlogsByStatus(List<String> status, SecurityContext securityContext)
    throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    
    @Override
    public Response findBlogsByTags(List<String> tags, SecurityContext securityContext)
    throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    
    @Override
    public Response getBlog(SecurityContext securityContext)
    throws NotFoundException {
        // do some magic!
        BlogDao bd = new BlogDao();
        List<Blog> blogs = bd.query();
        return Response.ok().entity(gson.toJson(blogs)).header(HttpHeaders.CONTENT_TYPE,
                MediaType.APPLICATION_JSON + ";charset=UTF-8").build();
    }


    @Override
    public Response getBlogById(SecurityContext securityContext, String id)
    throws NotFoundException {
        // do some magic!
        BlogDao bd = new BlogDao();
        Blog blog = bd.get(id);
        return Response.ok().entity(gson.toJson(blog)).header(HttpHeaders.CONTENT_TYPE,
                MediaType.APPLICATION_JSON + ";charset=UTF-8").build();
    }
    
    @Override
    public Response updateBlog(Blog body, SecurityContext securityContext)
    throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    
    @Override
    public Response updateBlogWithForm(SecurityContext securityContext)
    throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    
}
