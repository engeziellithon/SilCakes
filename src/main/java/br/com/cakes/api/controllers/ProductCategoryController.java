package br.com.cakes.api.controllers;
import br.com.cakes.data.entities.ProductCategory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/productcategory")
public class ProductCategoryController {

    @GetMapping("/")
    public ProductCategory getAll(@RequestParam(name = "skip",required = false,defaultValue = "0") int skip,
                                  @RequestParam(name = "take",required = false,defaultValue = "20") int take) {

        return new ProductCategory("g",false);
    }

    @GetMapping("/{id}")
    public ProductCategory get(@PathVariable(name = "id") int id) {
        return new ProductCategory("g",false);
    }

    @PostMapping("/")
    public ProductCategory save(@RequestBody ProductCategory productCategory) {
        return new ProductCategory("g",false);
    }

    @PatchMapping("/")
    public ProductCategory update(@RequestBody ProductCategory productCategory) {
        return new ProductCategory("g",false);
    }
}
