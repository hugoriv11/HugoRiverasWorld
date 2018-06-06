/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder.elementos;

import builder.Milicia;
import builder.Vehiculo;
import builder.WorkerMilicia;

/**
 *
 * @author HugoJr. <Hugo Rivera at 00161417@uca.edu.sv>
 */
public class Escuadron implements WorkerMilicia{
    private Milicia milicia;
    private int vida = 100;

    public Escuadron() {
        this.milicia = new Milicia();
    }
    
    @Override
    public void crearMilicia() {
        System.out.println("Se crea el escuadron de ataque " + "// vida " +vida);
    }

    @Override
    public Milicia getMilicia() {
        return this.milicia;
    }
    
}
