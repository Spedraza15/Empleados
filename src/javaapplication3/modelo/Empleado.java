/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3.modelo;

/**
 *
 * @author salag601
 */
public class Empleado {
    
   private String nombre;
   private String apellido;
   private int sexo;
   private String imagen;
   private int salario;
   private Fecha fechaIngreso;
   private Fecha fechaNacimiento;
    


public void inicializar(String pNombre, String pApellido, int pSexo, Fecha pFechaN, Fecha pFechaI, int pSalario){
    
    this.nombre = pNombre;
    this.apellido = pApellido;
    this.sexo = pSexo;
    this.salario = pSalario;
    this.fechaIngreso = pFechaI;
    this.fechaNacimiento = pFechaN;
    

}

public void cambiarFechaIngreso(Fecha pFechaIngreso){
    
    this.fechaIngreso = pFechaIngreso;

}

public void cambiarImagen(String pImagen){
    
    

}

public void cambiarSalario(int pSalario){
    
    this.salario = pSalario;

}

public int darAntiguedad(){
    
    

}

public String darApellido(){

}

public int darEdad(){

}

public String darFechaIngreso(){

}

public String darFechaNacimiento(){


}

public String darImagen(){

}

public String darNombre(){

}

public double darPrestaciones(){

}

public int darSalario(){

}

public int darSexo(){

}

    



    
}