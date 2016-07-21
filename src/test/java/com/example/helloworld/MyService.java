package com.example.helloworld;

import java.lang.Void;
import no.jansoren.codegen.Something;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class MyService {

  private WebTarget target;

  public MyService() {
    Client client = ClientBuilder.newClient();
    target = client.target("http://localhost:8080").path("something");
  }

  public Something addSomething(Something dataToPost) {
      Response response = target.path("add").request(MediaType.APPLICATION_JSON_TYPE).post(Entity.entity(dataToPost, MediaType.APPLICATION_JSON_TYPE));
      return (Something)response.getEntity();
  }

  public Void deleteSomething() {
      Response response = target.path("delete").request(MediaType.APPLICATION_JSON_TYPE).delete();
      return (Void)response.getEntity();
  }

  public Something getSomething() {
      Response response = target.path("get").request(MediaType.APPLICATION_JSON_TYPE).get();
      return (Something)response.getEntity();
  }

  public Something putSomething(Something dataToPut) {
      Response response = target.path("get").request(MediaType.APPLICATION_JSON_TYPE).put(Entity.entity(dataToPut, MediaType.APPLICATION_JSON_TYPE));
      return (Something)response.getEntity();
  }
}
