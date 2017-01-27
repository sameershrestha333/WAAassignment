package store;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class Product implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private List<ProductBean> products;

	public List<ProductBean> getProducts() {
		return products;
	}

	public void setProducts(List<ProductBean> products) {
		this.products = products;
	}
	
	public void deleteProduct(){
		products.remove(0);
	}

}
