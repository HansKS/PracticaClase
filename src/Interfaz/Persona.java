/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

/**
 *
 * @author laboratorio
 */
public class Persona {
    private int Cedula; 
    private String Nombre; 
    private String Apellidos; 
    
    public Persona(){
    
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }
    
    public static boolean esNumero (String valor){
        try{
            Integer.parseInt(valor);
            return true;
        }catch(NumberFormatException e){
        return false;
        }
    }
    
}
