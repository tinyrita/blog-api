package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.UserApiService;
import io.swagger.api.factories.UserApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.User;
import java.util.List;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/user")


@io.swagger.annotations.Api(description = "the user API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-06T11:12:38.238Z")
public class UserApi  {
   private final UserApiService delegate = UserApiServiceFactory.getUserApi();

    @POST
    
    @Consumes({ "application/json" })
    
    @io.swagger.annotations.ApiOperation(value = "Create user", notes = "This can only be done by the logged in user.", response = void.class, tags={ "User",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = void.class) })
    public Response createUser(
        @ApiParam(value = "" ) User body,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createUser(body,securityContext);
    }
    @POST
    @Path("/createWithArray")
    @Consumes({ "application/json" })
    
    @io.swagger.annotations.ApiOperation(value = "Creates list of users with given input array", notes = "", response = void.class, tags={ "User",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = void.class) })
    public Response createUsersWithArrayInput(
        @ApiParam(value = "" ) List<User> body,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createUsersWithArrayInput(body,securityContext);
    }
    @POST
    @Path("/createWithList")
    @Consumes({ "application/json" })
    
    @io.swagger.annotations.ApiOperation(value = "Creates list of users with given list input", notes = "", response = void.class, tags={ "User",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = void.class) })
    public Response createUsersWithListInput(
        @ApiParam(value = "" ) List<User> body,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createUsersWithListInput(body,securityContext);
    }
    @DELETE
    @Path("/{userlogin}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete user", notes = "This can only be done by the logged in user.", response = void.class, tags={ "User",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = void.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Error 400", response = void.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "Error 404", response = void.class) })
    public Response deleteUser(
        @ApiParam(value = "name that need to be deleted",required=true) @PathParam("userlogin") String userlogin,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteUser(userlogin,securityContext);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get user list", notes = "\u83B7\u53D6\u535A\u4E3B\u5217\u8868", response = User.class, responseContainer = "List", tags={ "User",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "\u83B7\u53D6\u535A\u4E3B\u5217\u8868", response = User.class, responseContainer = "List") })
    public Response getUser(
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getUser(securityContext);
    }
    @GET
    @Path("/{userlogin}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get user by user name", notes = "", response = User.class, tags={ "User",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = User.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Error 400", response = User.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "Error 404", response = User.class) })
    public Response getUserByName(
        @ApiParam(value = "name that need to be deleted",required=true) @PathParam("userlogin") String userlogin,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getUserByName(userlogin,securityContext);
    }
    @PUT
    @Path("/{userlogin}")
    @Consumes({ "application/json" })
    
    @io.swagger.annotations.ApiOperation(value = "Updated user", notes = "This can only be done by the logged in user.", response = void.class, tags={ "User" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = void.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Error 400", response = void.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "Error 404", response = void.class) })
    public Response updateUser(
        @ApiParam(value = "name that need to be deleted",required=true) @PathParam("userlogin") String userlogin,
        @ApiParam(value = "" ) User body,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateUser(userlogin,body,securityContext);
    }
}
