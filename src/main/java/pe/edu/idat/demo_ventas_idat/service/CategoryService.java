package pe.edu.idat.demo_ventas_idat.service;
import org.springframework.stereotype.Service;
import pe.edu.idat.demo_ventas_idat.model.CategoryModel;
import pe.edu.idat.demo_ventas_idat.repository.CategoryRepository;
import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<CategoryModel> obtenerCategorias(){
        return categoryRepository.findAll();
    }

    public CategoryModel obtenerCategoriaXid(int id) {
        return categoryRepository.findById(id)
                .orElse(null);
    }

    public void guardarCategoria(CategoryModel category){
        categoryRepository.save(category);
    }

    public CategoryModel eliminarCategoria(int id) {
        CategoryModel category  = obtenerCategoriaXid(id);

        if (category != null) {
            categoryRepository.deleteById(id);
        }
        return category;
    }
}
