/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author HugoJr. <Hugo Rivera at 00161417@uca.edu.sv>
 */
public class VehiculoBuilder {
    private WorkerVehiculo worker;
    
    public VehiculoBuilder (WorkerVehiculo worker){
        this.worker = worker;
    }
    
    public void BuildAVehiculo(){
        this.worker.crearVehiculo();
    }
    
    public Vehiculo getVehiculo(){
        return this.worker.getVehiculo();
    }
}
