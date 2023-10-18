package dev.jyoti.productservice.Services;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

public class FakeStoreProductService implements productService{
    @Override
    @Service("fakeStoreProductService")
    public String getproductById(Long id) {
        return "Here is Product Id " + id;
//        return null;
    }
}
