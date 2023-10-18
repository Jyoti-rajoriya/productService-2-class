package dev.jyoti.productservice.Services;

import org.springframework.stereotype.Service;

@Service("selfProductService")
public class SelfProductservice implements productService {
    @Override
    public String getproductById(Long id) {
        return null;
    }
}
