/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder.elementos;

import builder.Milicia;
import builder.WorkerMilicia;

/**
 *
 * @author HugoJr. <Hugo Rivera at 00161417@uca.edu.sv>
 */
public class Especialista implements WorkerMilicia{
    private Milicia milicia;
    private int vida = 100;
    private int precio = 90;

    public Especialista() {
        this.milicia = new Milicia();
    }
    
    @Override
    public void crearMilicia() {
        System.out.println("TERMINATOR creado " + "// vida " +vida+ " // precio "+milicia.getPrecio(precio));
    }

    @Override
    public Milicia getMilicia() {
        return this.milicia;
    }
    
}
