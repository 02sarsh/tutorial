package product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.*;

@Component

public class productservice {
	
	List<product>products=new ArrayList<>();
	Productdb db=new Productdb();
	

	public void addproducts(product p) {
	//	products.add(p);
		db.save(p);
		}
	
	public List<product> getallproducts(){
		return db.getall();
	}

	//public product getproductname(String name) {

		//for (product p : products) {
			//if(p.getname().equalsIgnoreCase(name)) {
			//	return p;
			//}
	//	}
	//	return null;
	//}

}
