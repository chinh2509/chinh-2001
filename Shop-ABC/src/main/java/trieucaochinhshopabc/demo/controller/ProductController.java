package trieucaochinhshopabc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import trieucaochinhshopabc.demo.entity.ProductEntity;
import trieucaochinhshopabc.demo.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    ProductService productService;

        @GetMapping({"/","/index"})
        public String index(Model model){
            String msg = "..";
            model.addAttribute("msg", msg);
            return "index";
        }

        @GetMapping("/addproduct")
        public String addProduct(Model model){
            ProductEntity productEntity = new ProductEntity();
            model.addAttribute("product",productEntity);
            return "addproduct";
        }

        @GetMapping("/listproduct")
        public String listproduct(Model model) {
            List<ProductEntity> products = productService.getAll();
            model.addAttribute("products", products);
            return "listuser";
        }

        @PostMapping("/addproduct")
        public String addProduct(@ModelAttribute ProductEntity productEntity, Model model) {
            productService.addProduct(productEntity);
            return "redirect:/listuser";
        }


}
