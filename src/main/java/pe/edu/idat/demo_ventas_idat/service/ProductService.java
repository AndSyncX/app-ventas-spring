package pe.edu.idat.demo_ventas_idat.service;
import org.springframework.stereotype.Service;
import pe.edu.idat.demo_ventas_idat.model.ProductModel;
import pe.edu.idat.demo_ventas_idat.repository.ProductRepository;
import java.util.List;

@Service
public class ProductService {
    private final ProductRepository ProductRepository;

    public ProductService(ProductRepository ProductRepository) {
        this.ProductRepository = ProductRepository;
    }

    public List<ProductModel> obtenerProducto(){
        return ProductRepository.findAll();
    }

    public ProductModel obtenerProductoXid(int id) {
        return ProductRepository.findById(id)
                .orElse(null);
    }

    public void guardarProducto(ProductModel product){
        ProductRepository.save(product);
    }

    public ProductModel eliminarProducto(int id) {
        ProductModel product  = obtenerProductoXid(id);

        if (product != null) {
            ProductRepository.deleteById(id);
        }
        return product;
    }
}
