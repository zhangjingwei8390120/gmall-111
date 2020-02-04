package com.zhang.gmall.pms;

import com.zhang.gmall.pms.entity.Brand;
import com.zhang.gmall.pms.service.BrandService;
import com.zhang.gmall.pms.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GmallPmsApplicationTests {

  @Autowired
    ProductService productService;
  @Autowired
  BrandService brandService;

    @Test
    void contextLoads() {
//        System.out.println(productService.getById(1).getName());

//      测试 增删改去主库， 查去从库
//      Brand brand=new Brand();
//      brand.setName("天界");
//      brandService.save(brand);
      System.out.println(brandService.getById(53).getName());
    }

}
