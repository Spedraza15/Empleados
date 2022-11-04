/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3.modelo;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
/**
 *
 * @author salag601
 */
public class Fecha {
    
    private int dia;
    private int mes;
    private int anio;
    private LocalDate fechaHoy = LocalDate.now();
    


public void inicializar(int d, int m, int a){

this.dia = d;
this.mes = m;
this.anio = a;
}

public void inicializarHoy(){
    
   
   
   this.dia = fechaHoy.getDayOfMonth();
    
   this.mes =fechaHoy.getMonthValue();
    
   this.anio =fechaHoy.getYear();
    
    
}

public int darAnio(){
    
    int anio = fechaHoy.getYear();
    return anio;
}

public int darDia(){
   
    int dia = fechaHoy.getDayOfMonth();
    return dia;

}

public int darMes(){
    
    int mes = fechaHoy.getMonthValue();
    return mes;

}

public String calcularEdad(int a, int m, int d) {
    
   
    this.anio = a ;
    this.mes = m ;
    this.dia = d ;
    
    Period edad = Period.between(LocalDate.of(a, m, d), LocalDate.now());
    String textf = (String.format("%d años ,%d meses y %d dias", edad.getYears(), edad.getMonths(), edad.getDays()));
    System.out.println(textf);
    
       
    return textf;
}
    



}
       