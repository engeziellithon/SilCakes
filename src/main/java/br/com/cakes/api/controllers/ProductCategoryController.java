package br.com.cakes.api.controllers;

import br.com.cakes.data.entities.ProductCategory;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/productcategory")
public class ProductCategoryController {

    @GetMapping("/")
    public List<ProductCategory> getAll(@RequestParam(name = "skip", required = false, defaultValue = "0") int skip,
            @RequestParam(name = "take", required = false, defaultValue = "20") int take) {

        return null;
    }

    @GetMapping("/{id}")
    public ProductCategory get(@PathVariable(name = "id") Long id) {
        Optional<ProductCategory> entity = null;

        if (entity.isPresent())
            return entity.get();

        return null;
    }

    @PostMapping("/")
    public ProductCategory save(@RequestBody ProductCategory productCategory) {
        return null;
    }

    @PatchMapping("/")
    public ProductCategory update(@RequestBody ProductCategory productCategory) {
        return null;
    }
}
