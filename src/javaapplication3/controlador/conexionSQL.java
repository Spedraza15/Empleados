/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3.controlador;

import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Calendar;
import javaapplication3.interfaz.InterfazEmpleado;
import javaapplication3.modelo.Fecha;
import javax.swing.JOptionPane;

/**
 *
 * @author Santiago
 */
public class conexionSQL {
    
    Connection conexionsql;
    InterfazEmpleado interfazEmpleado;
    
    
//    Connection conexion = null;
//    
//    String strConexion = "'jdbc:mysql://localhost:3306/empleados', 'root', 'root'";
//
//    public conexionSQL() {
//        
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            conexion = DriverManager.getConnection(strConexion);
//            
//            
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
    
//    public int ejecutarSentenciaSQL(String sntc){
//        
//       
//        try {
//            
//            
//            PreparedStatement sentencia = conexion.prepareStatement(sntc); 
//            ResultSet Rs = 
//            
//            sentencia.executeQuery(); 
//            
//            return 1;
//            
//        } catch (Exception e) {
//            
//            return 0;
//        }
//        
//    }
    
//    public void conexionDB(String columna, int DNI){
//
//
//        String request = "SELECT YEAR (" +columna+ ") as anioN, month("+ columna +") mesN, day("+ columna+ ") as diaN  FROM empleados where DNI = " + DNI;
//        String req = "SELECT " + columna + "FROM empleados where DNI = " + DNI;
//        
//
//        try {
//            Connection conexionsql=DriverManager.getConnection("jdbc:mysql://localhost:3306/empleados", "root", "root");
//
//            Statement statement = conexionsql.createStatement();
//
//            ResultSet resultset = statement.executeQuery(request);
//
//            while(resultset.next()){
//                
//                int anio = resultset.getInt("anioN");
//                int mes = resultset.getInt("mesN");
//                int dia = resultset.getInt("diaN");
//                System.out.println("año" + anio + " mes "+mes+" dia "+dia);         
//            Fecha calcTiempo = new Fecha();
//            calcTiempo.calcularTiempo(anio, mes, dia);
//            
//            
//            }
//
//        } catch (SQLException ex) {
//            System.out.println("error" + "\n" + ex);
//      
//        }
//       
//
//    }

    public  Connection getConexionsql() {
        return conexionsql;
    }

    

    public InterfazEmpleado getInterfazEmpleado() {
        return interfazEmpleado;
    }

    public void setInterfazEmpleado(InterfazEmpleado interfazEmpleado) {
        this.interfazEmpleado = interfazEmpleado;
    }

    
    
    
    public  void conection() throws SQLException{
        String jdbc = "jdbc:mysql://localhost:3306/empleados";
        conexionsql = DriverManager.getConnection(jdbc, "root", "root");
    }
    
    public ResultSet consulta(String columna, String DNI) throws SQLException{
        final String request = "SELECT ? from empleados WHERE DNI  = ?";
        PreparedStatement st = conexionsql.prepareStatement(request);
        st.setString(1, columna);
        st.setString(2, DNI);
        ResultSet rs = st.executeQuery();
                
        return rs;
    }
    
    
    
    
    
    public void statement(String columna, int DNI){
        
        ResultSet rs = null;
        String req = "SELECT YEAR (" +columna+ ") as anioN, month("+ columna +") mesN, day("+ columna+ ") as diaN  FROM empleados where DNI = " + DNI;
        
        try {
            
            Statement st = conexionsql.createStatement();           
            rs = st.executeQuery(req);
            int anio = rs.getInt("anioN");
            int mes = rs.getInt("mesN");
            int dia = rs.getInt("diaN");
                              
        }catch(Exception e){
            
        }
        
        
        
    }
    

    
    
   
    
}
