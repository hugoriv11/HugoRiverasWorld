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
public class Especialista implements Worker{
    private Milicia milicia;
    private int vida;

    public Especialista() {
        this.milicia = new Milicia();
    }
    
    @Override
    public void crearMilicia() {
        System.out.println("TERMINATOR creado");
    }

    @Override
    public Milicia getMilicia() {
        return this.milicia;
    }
    
}
