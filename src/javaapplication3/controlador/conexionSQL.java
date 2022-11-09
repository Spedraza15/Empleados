/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3.controlador;

import java.sql.*;
import java.util.Calendar;
import javaapplication3.modelo.Fecha;

/**
 *
 * @author Santiago
 */
public class conexionSQL {
    
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
    
    public void conexionDB(String columna, int DNI){


        String request = "SELECT YEAR (" +columna+ ") as anioN, month("+ columna +") mesN, day("+ columna+ ") as diaN  FROM empleados where DNI = " + DNI;
        String req = "SELECT " + columna + "FROM empleados where DNI = " + DNI;
        

        try {
            Connection conexionsql=DriverManager.getConnection("jdbc:mysql://localhost:3306/empleados", "root", "root");

            Statement statement = conexionsql.createStatement();

            ResultSet resultset = statement.executeQuery(request);

            while(resultset.next()){
                
                int anio = resultset.getInt("anioN");
                int mes = resultset.getInt("mesN");
                int dia = resultset.getInt("diaN");
                System.out.println("año" + anio + " mes "+mes+" dia "+dia);         
            Fecha calcTiempo = new Fecha();
            calcTiempo.calcularTiempo(anio, mes, dia);
            
            
            }

        } catch (SQLException ex) {
            System.out.println("error");
      
        }
       

    }
    
    
    public Connection conection(){
        try {
            Connection conexionsql=DriverManager.getConnection("jdbc:mysql://localhost:3306/empleados", "root", "root");
            
        }
        catch(SQLException ex){
            System.out.println("error");
        }
        return conection();
               
    }
    
    public void statement(String columna, int DNI){
        conection();
        
        String req = "SELECT " + columna + "FROM empleados where DNI = " + DNI;
        
        
    }
    

    
    
   
    
}
