package org.example.demo7;


import Models.Adresse;
import Models.Carnet;

import Models.Personne;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;


import java.util.HashMap;
import java.util.List;


@Path("/hello-world")
public class HelloResource {

    // Adding people and their addresses to the notebooks
    // Creation of addresses
    Adresse adresse1 = new Adresse("Rue de la Paix", 10, "Paris", 750);
    Adresse adresse2 = new Adresse("Rue du Commerce", 20, "Lyon", 690);
    Adresse adresse3 = new Adresse("Rue de la terre ", 20, "Tlemcen", 690);

    // Creation of people
    Personne personne1 = new Personne("lhadi", "mohamed", 22);
    Personne personne2 = new Personne("Dupont", "Jean", 30);
    Personne selma = new Personne("Selma", "Kara", 30);


    // Creation of notebooks
    Carnet carnet1 = new Carnet(new HashMap<>(), "Carnet1");
    public HelloResource() {
        carnet1.addPersonne(personne1, adresse1);
        carnet1.addPersonne(personne2, adresse2);
    }

    @GET
    @Path("Adresses/")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public HashMap<Personne, Adresse> getListAdresse() {
        return carnet1.getListAdresse();
    }

    @POST
    @Path("Adresses/")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public void addPersonne(Personne personne, Adresse adresse) {
         carnet1.addPersonne(selma, adresse3);
         //Personne p = carnet1.getPersonne(adresse);
         //return p;
    }
}