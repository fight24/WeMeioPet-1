package com.web.WeMeioPet.PresentationLayer;

import com.web.WeMeioPet.ServiceLayer.Customer.CustomerService;
import com.web.WeMeioPet.ServiceLayer.ProductService.ProductService;
import com.web.WeMeioPet.entities.Customer;
import com.web.WeMeioPet.entities.Product;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;



import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/data")
public class MainController {
    ModelAndView modelAndView ;
    @Autowired
    private ProductService productService;
    
    @Autowired
    private CustomerService customerService;
    @RequestMapping("/showCreate")
    public String showCreate() {
        return "create";
    }
    @RequestMapping("/save")
    public ModelAndView save(@ModelAttribute("product")Product product,
    		@ModelAttribute("customer")Customer customer){
        modelAndView = new ModelAndView("create");
        Product productSave = productService.saveProduct(product);
        Customer customerSave = customerService.saveCustomer(customer);
        String msg = "This product saved with code: " + productSave.getProductCode() + "and User name: "+ customerSave;
        modelAndView.addObject("msg",msg);
        return modelAndView;
    }
    @RequestMapping("/display")
    public ModelAndView display(Product product){
        List<Product> productList = productService.getAllProduct();
        List<Customer> customerList = customerService.getAllCustomer();
        modelAndView = new ModelAndView("display");
        modelAndView.addObject("customers",customerList);
        modelAndView.addObject("products",productList);
        return modelAndView;
    }
   
}
