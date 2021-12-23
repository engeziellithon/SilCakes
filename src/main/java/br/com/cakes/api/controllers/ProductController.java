package br.com.cakes.api.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.cakes.data.entities.Product;
import br.com.cakes.data.repository.ProductRepository;


@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/")
    public List<Product> getAll(@RequestParam(name = "skip", required = false, defaultValue = "0") int skip,
            @RequestParam(name = "take", required = false, defaultValue = "20") int take) {

        return this.productRepository.findAll();

    }

    @GetMapping("/{id}")
    public Product get(@PathVariable(name = "id") Long id) {
        Optional<Product> entity = this.productRepository.findById(id);

        if (entity.isPresent())
            return entity.get();

        return null;
    }

    @PostMapping("/")
    public Product save(@RequestBody Product product) {
        return this.productRepository.save(product);
    }

    @PatchMapping("/")
    public Product update(@RequestBody Product product) {
        return this.productRepository.save(product);
    }
}
