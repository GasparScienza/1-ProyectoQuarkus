package org.acme.Services;

import org.acme.Models.Producto;
import java.util.List;

public interface IProductService {
	public void addProduct(Producto producto);
    public List<Producto> getProduct();
    public void delProduct(Long id);
    public Producto findProduct(Long id);
    public void editProduct(Long id, String name);
}
