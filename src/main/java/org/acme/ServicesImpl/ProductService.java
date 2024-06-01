package org.acme.ServicesImpl;

import java.util.List;
import java.util.Optional;

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
		// TODO Auto-generated method stub
		return productRepository.listAll();
	}

	@Override
	public void delProduct(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Producto> findProduct(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public void editProduct(Long id, String name) {
		// TODO Auto-generated method stub
		
	}

}
