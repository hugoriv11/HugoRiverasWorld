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
public class MiliciaBuilder {
    private Worker worker;
    
    public MiliciaBuilder(Worker worker){
        this.worker = worker;
    }
    
    public void BuildAMilicia(){
        this.worker.crearMilicia();
    }
    
    public Milicia getMilicia(){
        return this.worker.getMilicia();
    }
    
}
