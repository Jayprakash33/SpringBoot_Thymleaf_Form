package in.jpjena.sbms.binding;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Product {

	@NotNull(message = "Product Id Is Mandatory")
	private Integer pid;
	@NotBlank(message = " Product Name Is Mandatory")
	@Size(min = 3 ,max = 8 ,message = "Size Must Be Between 3 to 8 Characters")
	private String pname;
	@NotNull(message = " Product Price Is Manadatory")
	private Double price;
}
