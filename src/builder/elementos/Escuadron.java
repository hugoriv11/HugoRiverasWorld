/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder.elementos;

import builder.Milicia;
import builder.Worker;

/**
 *
 * @author HugoJr. <Hugo Rivera at 00161417@uca.edu.sv>
 */
public class Escuadron implements Worker{
    private Milicia milicia;
    private int vida;

    public Escuadron() {
        this.milicia = new Milicia();
    }
    
    @Override
    public void crearMilicia() {
        System.out.println("Se crea el escuadron de ataque");
    }

    @Override
    public Milicia getMilicia() {
        return this.milicia;
    }
    
}
