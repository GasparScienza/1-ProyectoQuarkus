package org.acme.ServicesImpl;

import java.util.List;

import org.acme.Models.Producto;
import org.acme.Repositories.ProductRepository;
import org.acme.Services.IProductService;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ProductService implements IProductService{
	
	@Inject
	private ProductRepository productRepository;
	
	@Override
	public void addProduct(Producto producto) {
		productRepository.persist(producto);
	}

	@Override
	public List<Producto> getProduct() {
		return productRepository.listAll();
	}

	@Override
	public void delProduct(Long id) {
		productRepository.deleteById(id);
	}
	
	@Override
	public Producto findProduct(Long id) {
		return productRepository.findById(id);
	}

	@Override
	public void editProduct(Long id, String name) {

	}
}

