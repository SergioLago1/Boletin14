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
public class TemperaturaExcepcion extends Exception{
    
    public TemperaturaExcepcion(){
        super("No se permite una temperatura menor a 80 grados");
    }
    
    public TemperaturaExcepcion(String mensaje){
        super(mensaje);
    }
}