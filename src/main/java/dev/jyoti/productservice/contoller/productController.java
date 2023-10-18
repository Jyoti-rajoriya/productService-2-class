package dev.jyoti.productservice.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/products")
public class productController {
//    private ProductService productService;
//
//    public ProductController(ProductService productService) {
//        this.productService = productService;
//    }
    // Field Injection
    private productService ProductService;
    // Constructor Injection
    @Autowired
    public productController(@Qualifier("fakeStoreProductService") productService ProductService){
        this.ProductService = ProductService;
    }

    @GetMapping
    public void getAllProducts(){

    }
    //local;host:8080/products/123
    @GetMapping("{id}")
    public String getproductById(@PathVariable("id") Long id){
        return productService.getproductById(id);
    }

    @DeleteMapping("{id}")
    public void deleteProductById(){

    }
    @PostMapping
    public String createProduct(){
        return "Created new product with Id " + UUID.randomUUID();
    }
    @PutMapping("{id}")
    public void updateProductbyId(){

    }

}
