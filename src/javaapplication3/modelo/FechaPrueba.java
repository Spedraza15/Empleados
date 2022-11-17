/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3.modelo;


import java.sql.*;
import java.time.LocalDate;
import java.time.Month;
import javaapplication3.controlador.conexionSQL;

/**
 *
 * @author Santiago
 */
public class FechaPrueba {

    
    public static void main(String[] args) throws SQLException {
        
        
        conexionSQL test1 = new conexionSQL();  // se puede ahcer static
        Fecha calcAntiguedad = new Fecha();
        
        Statement pst;
        ResultSet rs ;
        
        String request = "SELECT * from empleados WHERE DNI  = " + 100022334;
        
//        System.out.println(" anio " + test1.darAnio() + " mes "+ test1.darMes() + " dia "+ test1.darDia());

test1.conection();
pst = test1.getConexionsql().createStatement();
//pst.setString(1, "FechaIngreso");
//pst.setInt(2, 100022334);

rs = pst.executeQuery(request);

int a = rs.getInt(1);
int m = rs.getInt(2);
int d = rs.getInt(3);

calcAntiguedad.calcularTiempo(a, m, d);

    }
    
}
