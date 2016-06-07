package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.BlogApiService;
import io.swagger.api.factories.BlogApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Blog;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/blog")


@io.swagger.annotations.Api(description = "the blog API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-06T11:12:38.238Z")
public class BlogApi  {
   private final BlogApiService delegate = BlogApiServiceFactory.getBlogApi();

    @POST
    
    @Consumes({ "application/json" })
    
    @io.swagger.annotations.ApiOperation(value = "Add a new blog to the store", notes = "", response = void.class, tags={ "Blog",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = void.class),
        @io.swagger.annotations.ApiResponse(code = 405, message = "Error 405", response = void.class) })
    public Response addBlog(
        @ApiParam(value = "" ) Blog body,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addBlog(body,securityContext);
    }
    @DELETE
    @Path("/{blogid}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Deletes a blog", notes = "", response = void.class, tags={ "Blog",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = void.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Error 400", response = void.class) })
    public Response deleteBlog(
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteBlog(securityContext);
    }
    @GET
    @Path("/findByStatus")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Finds Blogs by status", notes = "Multiple status values can be provided with comma separated strings", response = Blog.class, responseContainer = "List", tags={ "Blog",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Blog.class, responseContainer = "List"),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Error 400", response = Blog.class, responseContainer = "List") })
    public Response findBlogsByStatus(
        @ApiParam(value = "Status values that need to be considered for filter",required=true) @QueryParam("status") List<String> status,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.findBlogsByStatus(status,securityContext);
    }
    @GET
    @Path("/findByTags")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Finds Blogs by tags", notes = "Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.", response = Blog.class, responseContainer = "List", tags={ "Blog",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Blog.class, responseContainer = "List"),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Error 400", response = Blog.class, responseContainer = "List") })
    public Response findBlogsByTags(
        @ApiParam(value = "Tags to filter by",required=true) @QueryParam("tags") List<String> tags,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.findBlogsByTags(tags,securityContext);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "get blog list", notes = "", response = Blog.class, responseContainer = "List", tags={ "Blog",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "\u5DF2\u8FD4\u56DE\u6240\u6709\u535A\u5BA2\u5217\u8868", response = Blog.class, responseContainer = "List") })
    public Response getBlog(
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getBlog(securityContext);
    }
    @GET
    @Path("/{blogid}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Find blog by ID", notes = "Returns a single blog", response = Blog.class, tags={ "Blog",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Blog.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Error 400", response = Blog.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "Error 404", response = Blog.class) })
    public Response getBlogById(
        @Context SecurityContext securityContext,
        @PathParam("blogid") String id
    )
    throws NotFoundException {
        return delegate.getBlogById(securityContext,id);
    }
    @PUT
    
    @Consumes({ "application/json" })
    
    @io.swagger.annotations.ApiOperation(value = "Update an existing blog", notes = "", response = void.class, tags={ "Blog",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = void.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Error 400", response = void.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "Error 404", response = void.class),
        @io.swagger.annotations.ApiResponse(code = 405, message = "Error 405", response = void.class) })
    public Response updateBlog(
        @ApiParam(value = "" ) Blog body,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateBlog(body,securityContext);
    }
    @POST
    @Path("/{blogid}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Updates a blog in the store with form data", notes = "", response = void.class, tags={ "Blog" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = void.class),
        @io.swagger.annotations.ApiResponse(code = 405, message = "Error 405", response = void.class) })
    public Response updateBlogWithForm(
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateBlogWithForm(securityContext);
    }

}
