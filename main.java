package product;

import java.util.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          productservice service=new productservice();
          
          
        /*  service.addproducts(new product("laptop","system","table1",2024));
          service.addproducts(new product("Laptop A10", "System A1", "Table 11", 2024));
          service.addproducts(new product("Laptop A2", "System A2", "Table 12", 2023));
          service.addproducts(new product("Laptop A3", "System A3", "Table 13", 2022));
          service.addproducts(new product("Laptop A4", "System A4", "Table 14", 2021));
          service.addproducts(new product("Laptop A5", "System A5", "Table 15", 2020));
          service.addproducts(new product("Laptop A6", "System A6", "Table 16", 2021));
          service.addproducts(new product("Laptop A7", "System A7", "Table 17", 2022));
          service.addproducts(new product("Laptop A8", "System A8", "Table 18", 2023));
          service.addproducts(new product("Laptop A9", "System A9", "Table 19", 2024));
          service.addproducts(new product("Laptop A0", "System A0", "Table 10", 2020));*/
          
          List<product> products=service.getallproducts();
          for(product p : products) {
          System.out.println(products);
          }
	
	      //product t=service.getproductname("Laptop A9");
	      //System.out.println(t);
	
	
	
	
	
	
	
	
	}
	
	
	
	

}
