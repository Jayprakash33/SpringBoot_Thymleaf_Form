package in.jpjena.sbms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.jpjena.sbms.binding.Product;

@Controller
public class ProductController {

	@GetMapping("/")
	public String getForm(Model model) {
		model.addAttribute("product",new Product());
		return "index";
	}
	
	@PostMapping("/product")
	public String handleSubmitBtn(Product product,Model model) {
		
		System.out.println(product);
		
		//logic to save in db
		model.addAttribute("msg","Product Saved");
		
		return "index";
	}
}
