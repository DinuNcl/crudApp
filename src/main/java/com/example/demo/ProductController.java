package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller()
public class ProductController {

    @RequestMapping("/")
    @ResponseBody
    String printHello() {
        return "aaaaaa";
    }
//    private ProductService productService;
//
//    @Autowired
//    public void setProductService(ProductService productService) {
//        this.productService = productService;
//    }
//
//    @RequestMapping("/")
//    public String home(Model model) {
//        List<Product> listProducts = productService.listAll();
//        model.addAttribute("listProducts", listProducts);
//        model.addAttribute("name", "Prod Manager");
//        return "index";
//    }
//
//    @RequestMapping("/new")
//    public String showNewProductForm(Model model) {
//        Product product = new Product();
//        model.addAttribute("product", product);
//        return "newProduct";
//    }
//
//    @PostMapping("/save")
//    public String saveProduct(@ModelAttribute("product") Product product) {
//        productService.save(product);
//        return "redirect:/";
//    }
//
//    @RequestMapping("/edit/{id}")
//    public ModelAndView showEditPage(@PathVariable(name = "id") Long id) {
//        ModelAndView mv = new ModelAndView("editProduct");
//        Product product = productService.get(id);
//        mv.addObject("product", product);
//        return mv;
//    }
//
//    @RequestMapping("/delete/{id}")
//    public String deleteProduct(@PathVariable Long id) {
//        productService.delete(id);
//        return "redirect:/";
//    }
}
