package duncan.customparametertypes;

import io.cucumber.java.ParameterType;

public class CustomParameterTypes {

	@ParameterType(".*")
	public Product product(String str) {
		Product product = new Product();
		product.setModel(str);
		return product;
	}

}
