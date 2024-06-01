package org.acme.Services;

import org.acme.Models.Producto;
import java.util.List;
import java.util.Optional;

public interface IProductService {
	public void addProduct(Producto producto);
    public List<Producto> getProduct();
    public void delProduct(Long id);
    public Optional<Producto> findProduct(Long id);
    public void editProduct(Long id, String name);
}
