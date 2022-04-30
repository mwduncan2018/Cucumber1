package duncan.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;

import duncan.customparametertypes.Product;

public class SampleSteps {

	@Given("a product with model {product}")
	public void aProductWithModel(Product product) {
		System.out.println("Inside step def -- a product with model {product}");
		System.out.println(product.getModel());
	}
	
}
