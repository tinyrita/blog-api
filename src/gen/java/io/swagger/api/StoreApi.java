package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.StoreApiService;
import io.swagger.api.factories.StoreApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Order;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/store")


@io.swagger.annotations.Api(description = "the store API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-06T11:12:38.238Z")
public class StoreApi  {
   private final StoreApiService delegate = StoreApiServiceFactory.getStoreApi();

    @DELETE
    @Path("/order/{orderId}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete purchase order by ID", notes = "For valid response try integer IDs with positive integer value. Negative or non-integer values will generate API errors", response = void.class, tags={ "Store",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = void.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Error 400", response = void.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "Error 404", response = void.class) })
    public Response deleteOrder(
        @ApiParam(value = "ID of the order that needs to be deleted",required=true) @PathParam("orderId") String orderId,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteOrder(orderId,securityContext);
    }
    @GET
    @Path("/order/{orderId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Find purchase order by ID", notes = "For valid response try integer IDs with value >= 1 and <= 10. Other values will generated exceptions", response = Order.class, tags={ "Store",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Order.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Error 400", response = Order.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "Error 404", response = Order.class) })
    public Response getOrderById(
        @ApiParam(value = "ID of the order that needs to be deleted",required=true) @PathParam("orderId") String orderId,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getOrderById(orderId,securityContext);
    }
    @POST
    @Path("/order")
    @Consumes({ "application/json" })
    
    @io.swagger.annotations.ApiOperation(value = "Place an order for a blog", notes = "", response = void.class, tags={ "Store" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = void.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Error 400", response = void.class) })
    public Response placeOrder(
        @ApiParam(value = "" ) Order body,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.placeOrder(body,securityContext);
    }
}
