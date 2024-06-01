package org.acme.Controllers;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


import java.util.List;

import org.acme.Models.Producto;
import org.acme.Services.IProductService;

@Path("/product")
@Transactional
public class ProductResource {
	
	@Inject
	private IProductService iProductService;
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Producto> getProducts() {
            return iProductService.getProduct();
    }
	
	@POST
	public Producto addProduct(Producto producto) {
		iProductService.addProduct(producto);
		return producto;
	}
}
