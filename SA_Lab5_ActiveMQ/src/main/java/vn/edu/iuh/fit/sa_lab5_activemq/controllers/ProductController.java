package vn.edu.iuh.fit.sa_lab5_activemq.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import vn.edu.iuh.fit.sa_lab5_activemq.services.impls.ProductServicesImpl;

@Controller
public class ProductController {
  @Autowired
  private ProductServicesImpl productServices;


  //  get all products when customer at home page
  @GetMapping("/")
  public String getAllProducts(Model model) {
    model.addAttribute("products", productServices.getAll());
    return "/index";
  }



}
