package javaapplication3.controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaapplication3.interfaz.InterfazEmpleado;
import javaapplication3.modelo.Fecha;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Santiago
 */
public class empleado {
    
    conexionSQL conectarsql = new conexionSQL();
    

    public empleado(String request) {
        
        
    Fecha calcEdad = new Fecha();
    ResultSet resultset;
        
    String idCampo = InterfazEmpleado.
    
    try {
            this.conectarsql.conection();

            Statement statement = conectarsql.getConexionsql().createStatement();
            resultset = statement.executeQuery(request);

            while(resultset.next()){                 
                
                textcalcedad.setText(calcEdad.calcularTiempo(resultset.getInt(1), resultset.getInt(2), resultset.getInt(3)));

            }

        } catch (SQLException ex) {
            Logger.getLogger(InterfazEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            
        } // TODO add your handling code here:
    
    }
    
    
    
    
    
}
