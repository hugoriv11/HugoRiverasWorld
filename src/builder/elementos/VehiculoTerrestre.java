/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder.elementos;

import builder.Vehiculo;
import builder.WorkerVehiculo;

/**
 *
 * @author HugoJr. <Hugo Rivera at 00161417@uca.edu.sv>
 */
public class VehiculoTerrestre implements WorkerVehiculo{
    private Vehiculo vehiculo;
    private int vida = 100;
    
    public VehiculoTerrestre(){
        this.vehiculo = new Vehiculo();
    }

    @Override
    public void crearVehiculo() {
        System.out.println("Se crea Tanque "  + "// vida " +vida);
    }

    @Override
    public Vehiculo getVehiculo() {
        return this.vehiculo;
    }

}
