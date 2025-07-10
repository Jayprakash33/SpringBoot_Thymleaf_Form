package in.jpjena.sbms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.jpjena.sbms.binding.Product;
import jakarta.validation.Valid;

@Controller
public class ProductController {

	@GetMapping("/")
	public String getForm(Model model) {
		model.addAttribute("product", new Product());
		return "index";
	}

	@PostMapping("/product")
	public String handleSubmitBtn(@Valid Product product, BindingResult result, Model model) {

		System.out.println(product);
		if (result.hasErrors()) {
			model.addAttribute("msg", "Product Data Is Not Provided In Correct Manner");
		} else {
			model.addAttribute("msg", "Product Saved");
		}
		return "index";
	}
}
