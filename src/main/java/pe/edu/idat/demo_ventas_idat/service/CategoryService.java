package pe.edu.idat.demo_ventas_idat.service;
import pe.edu.idat.demo_ventas_idat.model.CategoryModel;
import pe.edu.idat.demo_ventas_idat.repository.CategoryRepository;

import java.util.List;

public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<CategoryModel> obtenerCategorias(){
        return categoryRepository.findAll();
    }

    public void guardarCategoria(CategoryModel category){
        // Insert Into
        categoryRepository.save(category);
    }
}
