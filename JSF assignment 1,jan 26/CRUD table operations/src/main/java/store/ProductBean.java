package store;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class ProductBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String save(){
		System.out.println("I am invoked");
		return "productlist";
	}
	
	public String showAddProduct(){
		System.out.println("I am invoked");
		return "add-product?faces-redirect=true";
	}
	
	
	
}
