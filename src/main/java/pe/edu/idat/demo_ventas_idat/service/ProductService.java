package pe.edu.idat.demo_ventas_idat.service;
import org.springframework.stereotype.Service;
import pe.edu.idat.demo_ventas_idat.model.ProductModel;
import pe.edu.idat.demo_ventas_idat.repository.ProductRepository;
import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductModel> obtenerProductos(){
        return productRepository.findAll();
    }

    public ProductModel obtenerProductoXid(int id) {
        return productRepository.findById(id)
                .orElse(null);
    }

    public void guardarProducto(ProductModel product){
        productRepository.save(product);
    }
}
