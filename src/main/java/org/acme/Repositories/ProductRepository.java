package org.acme.Repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

import org.acme.Models.Producto;

@ApplicationScoped
public class ProductRepository implements PanacheRepository<Producto>{

}
