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
public class Vehiculo implements VehiculoPlan{
    private int vida;
    private int precio;

//    @Override
//    public void setVida(int vida) {
//        this.vida = vida;
//    }
//
//    @Override
//    public void setPrecio(int precio) {
//        System.out.println("Crear el vehiculo tiene precio de "+precio);
//    }
    
//    @Override
//    public void getVida(int vida) {
//        vida = 100;
//    }
//
//    @Override
//    public void getPrecio(int precio) {
//        precio = 10;
//    }

    @Override
    public int getVida(int vida) {
        return vida;
    }

    @Override
    public int getPrecio(int precio) {
        return precio;
    }
    
}
