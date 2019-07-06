/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author laboratorio
 */
public class Persona {
    private int Cedula; 
    private String Nombre; 
    private String Apellidos; 

    public ArrayList getPersona() {
        return Persona;
    }

    public void setPersona(ArrayList Persona) {
        this.Persona = Persona;
    }
    private ArrayList Persona; 

    public int getAnoNac() {
        return AnoNac;
    }

    public void setAnoNac(int AnoNac) {
        this.AnoNac = AnoNac;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    private int AnoNac;
    private int Edad;
    
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
    
    public static int CalcularEdad (int Actual, int FechaNaci){
        int edad=Actual-FechaNaci;
        return edad;
   
    }


    
        public static void CargaTabla(ArrayList lista,JTable tabla){
    
        
        DefaultTableModel dtm=(DefaultTableModel)tabla.getModel();
        dtm.setRowCount(0);
        Object[] fila= new Object[dtm.getColumnCount()];
        
        for (int i=0; i<lista.size();i++){
        Persona P = (Persona) lista.get(i);
             fila[0]=P.getCedula();
             fila[1]=P.getNombre();
             fila[2]=P.getApellidos();
             fila[3]=P.getAnoNac();
             fila[4]=P.getEdad();
             dtm.addRow(fila);
        }

         
         tabla.setModel(dtm);
        
        
    }
    
    
    
    
    
    
}
