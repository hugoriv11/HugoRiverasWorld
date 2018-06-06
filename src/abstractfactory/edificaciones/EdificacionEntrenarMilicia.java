/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory.edificaciones;

/**
 * De alguna forma tengo que traer mis tipos de milicia, Escuadron y Especialista, para que esta edificacion 
 * tome el tiempo y el numero de fases y todo lo demas para entrenar el tipo de milicia que el jugador
 * quiera entrenar
 * @author HugoJr. <Hugo Rivera at 00161417@uca.edu.sv>
 */
public class EdificacionEntrenarMilicia implements Edificacion{
    public int vida;
    public int precio;

    @Override
    public void construir() {
        vida = 100;
        System.out.println("Edificacion entrenadora de milicia construida " + "// vida: (" + vida + ")");
    }
    
}
