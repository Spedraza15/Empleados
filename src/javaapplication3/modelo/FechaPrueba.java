/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3.modelo;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Santiago
 */
public class FechaPrueba {
    
    public static void main(String[] args) {
        
        
        Fecha test1 = new Fecha();
        
//        System.out.println(" anio " + test1.darAnio() + " mes "+ test1.darMes() + " dia "+ test1.darDia());

test1.calcularEdad(LocalDate.of(2000, Month.APRIL, 15), LocalDate.of(2022, Month.NOVEMBER, 2));
//        LocalDate nacimiento = LocalDate.of(2000, Month.APRIL, 17);
//        int actual = Fecha.calcularEdad(nacimiento, LocalDate.of(2016, 7, 12));
        // assert

    }
    
}
