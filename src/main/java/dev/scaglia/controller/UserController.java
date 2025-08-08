package dev.scaglia.controller;

import dev.scaglia.entity.UserEntity;
import dev.scaglia.service.UserService;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.UUID;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GET
    public Response findAll(@QueryParam("page") @DefaultValue("0") Integer page,
                            @QueryParam("pageSize") @DefaultValue("10") Integer pageSize){

        var users = userService.findAll(page, pageSize);
        return Response.ok(users).build();
    }


    @POST
    @Transactional
    public Response createUser(UserEntity userEntity){
        return Response.ok(userService.createUser(userEntity)).build();
    }


    @GET
    @Path("/{id}")
    public Response getById(@PathParam("id") UUID userId){
        return Response.ok(userService.findById(userId)).build();
    }

    @PUT
    @Path("/{id}")
    @Transactional
    public Response updateUser( @PathParam("id") UUID userId, UserEntity userEntity){
        return Response.ok(userService.updateUser(userId, userEntity)).build();
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public Response deleteById(@PathParam("id") UUID userId){
        userService.deleteById(userId);
        return Response.noContent().build();
    }
}
