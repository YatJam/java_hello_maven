package com.example.hellomaven.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/v1")
public class Version1Application extends Application {
  @Override
  public Set<Class<?>> getClasses() {
    Set<Class<?>> clazzes = new HashSet<Class<?>>();
    clazzes.add(HelloResource.class);

    return clazzes;
  }
}