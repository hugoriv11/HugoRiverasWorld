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
public class Milicia implements MiliciaPlan{
    private int vida;
    private int precio;

//    @Override
//    public void setVida(int vida) {
//        this.vida = vida;
//    }
//
//    @Override
//    public void atacar() {
//        //acceder a las edificaciones de otro jugador para seleccionar cual atacar
//        System.out.println("Atacando...");
//    }
//
//    @Override
//    public void setPrecio(int precio) {
//        System.out.println("Crear la milicia tiene precio de "+precio);
//    }

    @Override
    public int getVida(int vida) {
        return vida;
    }

    @Override
    public int getPrecio(int precio) {
        return precio;
    }

    @Override
    public void atacar() {
        System.out.println("Atacando.....");
    }
    
}
