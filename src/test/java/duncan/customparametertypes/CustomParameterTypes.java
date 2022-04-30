package duncan.customparametertypes;

import io.cucumber.java.ParameterType;

public class CustomParameterTypes {

	/*
	 * Custom parameter types only take one parameter.
	 * To reduce complexity, pass a string instead.
	 * Do not use custom parameter types.
	 * They seem like a good idea on the surface, but introduce extra complexity with little benefit.
	 */
	
	@ParameterType(".*")
	public Product product(String str) {
		Product product = new Product();
		product.setModel(str);
		return product;
	}

}
