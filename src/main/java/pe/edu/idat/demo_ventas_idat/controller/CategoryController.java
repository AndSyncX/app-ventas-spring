package pe.edu.idat.demo_ventas_idat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.edu.idat.demo_ventas_idat.model.CategoryModel;
import pe.edu.idat.demo_ventas_idat.service.CategoryService;

@Controller
@RequestMapping("/category")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public String index(Model model) {
        model.addAttribute("categorias", categoryService.obtenerCategorias());
        return "category/index";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("category", new CategoryModel());
        return "category/create";
    }

    //localhost:8080/category/edit/1
    @GetMapping("/edit/{id}")
    public String edit(Model model, @PathVariable int id) {
        model.addAttribute("category", categoryService.obtenerCategoriaXid(id));
        return "category/edit";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("category") CategoryModel category){
        categoryService.guardarCategoria(category);
        return "redirect:/category";
    }
}