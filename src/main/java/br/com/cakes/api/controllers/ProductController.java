package br.com.cakes.api.controllers;

import br.com.cakes.data.entities.Product;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping("/")
    public Product getAll(@RequestParam(name = "skip",required = false,defaultValue = "0") int skip,
                                  @RequestParam(name = "take",required = false,defaultValue = "20") int take) {

        return  new Product("g","d","",null,0.00,false);
    }

    @GetMapping("/{id}")
    public Product get(@PathVariable(name = "id") int id) {
        return  new Product("g","d","",null,0.00,false);
    }

    @PostMapping("/")
    public Product save(@RequestBody Product product) {
        return new Product("g","d","",null,0.00,false);
    }

    @PatchMapping("/")
    public Product update(@RequestBody Product product) {
        return  new Product("g","d","",null,0.00,false);
    }
}
