/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory.edificaciones;

/**
 *
 * @author HugoJr. <Hugo Rivera at 00161417@uca.edu.sv>
 */
public class EdificacionConstruirVehiculoTerrestre implements Edificacion{
    public int vida;

    @Override
    public void construir() {
        //vida = 10;
        System.out.println("Edificacion constructora vehiculos terrestres construida " + "vida: (" + vida + ")");
    }
    
}
