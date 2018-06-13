package controlador;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CambiarProducto
 */
@WebServlet("/CambiarProducto")
public class CambiarProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CambiarProducto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doPost(request, response); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//llamar a los params
		
		int idProducto = Integer.parseInt(request.getParameter("id")); 
		
		String nombre = request.getParameter("nombre"); 
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
		
		try {
			
			java.util.Date fecha_compra = sdf.parse(request.getParameter("fecha_compra"));
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		double precio = (double) Integer.parseInt(request.getParameter("precio")); 
		
		//llamar a modelo
		
		//hacer set de los params
		
		//hacer update
		
		//enviar la infor a otra page
		
	}

}
