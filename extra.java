package product;
import java.util.*;
public class product {
   private String name;
   private String type;
   private String place;
   private int warranty;
   
   
   public product() {
   }
   
   
   public product(String name,String type,String place,int warranty) {
	    
	   this.name=name;
	   this.type=type;
	   this.place=place;
	   this.warranty=warranty;
   }
   
   public String getname() {
	   
	   return name;
   }
   
   public void setname(String name) {
	   this.name=name;
   }
   
public String gettype() {
	   
	   return type;
   }
   
   public void settype(String type) {
	   this.type=type;
   }
   
   public String getplace() {
	   
	   return place;
   }
   
   public void setplace(String place) {
	   this.place=place;
   }
   
   public int getwarranty() {
	   
	   return warranty;
   }
   
   public void setwarranty(int warranty) {
	   this.warranty=warranty;
   }
   
   @Override
   public String toString() {
	   
	   return "product{name=" +name+ "place="+ place+ "type=" +type+ "warranty=" +warranty+"}";
   }
   
   
}
