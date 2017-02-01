/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg14;

/**
 *
 * @author slagogonzalez
 */
public class Boletin14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     try{
            System.out.println("La temperatura en grados farenheit es= " + ConversorTemperaturas.centigradosAFharenheit(80)+"ºF");
        }catch(TemperaturaExcepcion e){
            System.out.println(e.getMessage());
        }
  
        ConversorTemperaturas.centigradosAReamur(85);
        ConversorTemperaturas.centigradosAReamurObligatorio(120);
               
    }
    
}