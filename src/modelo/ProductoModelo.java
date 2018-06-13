package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class ProductoModelo extends Conector{

	public ArrayList<Producto> selectAll() {
		
		//crear arraylist
		ArrayList<Producto> productos = new ArrayList<Producto>(); 
		PreparedStatement pst;
		
		try {
			//conectar con BBDD
			pst = (PreparedStatement) super.conexion.prepareStatement("select * from productos");
			
			ResultSet rs = pst.executeQuery(); 
			
			//crear el prod cada vez que encuentre uno
			while(rs.next()){
				Producto producto = new Producto(); 
				producto.setId(rs.getInt("id"));
				producto.setNombre(rs.getString("nombre"));
				producto.setFecha_compra(rs.getDate("fecha_compra"));
				producto.setPrecio(rs.getDouble("precio"));
				productos.add(producto); //añadirlo al arraylist
				
			}
			
			//enviar los productos
			return productos; 
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		return null;
	}

	public Producto select(int idProducto) {
		
		try {
			
			PreparedStatement pst = (PreparedStatement) super.conexion.prepareStatement("select * from productos where id = ?");
			pst.setInt(1, idProducto);
			ResultSet rs = pst.executeQuery(); 
			
			if(rs.next()){
				Producto producto = new Producto(); 
				producto.setId(rs.getInt("id"));
				producto.setNombre(rs.getString("nombre"));
				producto.setFecha_compra(rs.getDate("fecha_compra"));
				producto.setPrecio(rs.getDouble("precio"));
				
				return producto;
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return null;
	}

}
