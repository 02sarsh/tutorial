package product;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class Productdb {

	Connection conn=null;
	
	public Productdb() {
		
		try {
			conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/telusko","postgres","0000");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	public void save(product p) {
		
		String query= "insert into product(name,type,place,warranty) values (?,?,?,?)";
		PreparedStatement st;
		try {
			st = conn.prepareStatement(query);
			st.setString(1,p.getname());
			st.setString(3,p.getplace());
			st.setString(2,p.gettype());
			st.setInt(4,p.getwarranty());
			
			
			st.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}




	public List<product> getall() {
	List<product>Products= new ArrayList<>();
	try {
	String query= "select name,type,place,warranty from product";
	PreparedStatement st=conn.prepareStatement(query);
    ResultSet rs=st.executeQuery();
    
    while(rs.next()) {
    	
    	product p=new product();
    	
        p.setname(rs.getString(1));
        p.settype(rs.getString(2));
        p.setplace(rs.getString(3));
        p.setwarranty(rs.getInt(4));
          
        Products.add(p);
    }
		
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}
		return Products;
	}

}
