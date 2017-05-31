package com.example.rest2;

import com.example.service.ExampleService;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/city")
@RequestScoped
public class CityServ {

    @EJB
    ExampleService exampleService;

    @GET
    public String listAllCities() {
        return "all cities call: " + exampleService.whoAmI();
    }
}
