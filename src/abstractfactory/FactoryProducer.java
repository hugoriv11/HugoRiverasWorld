/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import abstractfactory.edificaciones.FactoryEdificacion;

/**
 *
 * @author HugoJr. <Hugo Rivera at 00161417@uca.edu.sv>
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String type){
        switch(type){
            case "Edificacion":
                return new FactoryEdificacion();
//            case "Raza":
//                return new FactoryRaza(); //FactoryRaza aun no hecho porque no he hecho las razas IMPORTANTE======================
        }
        return null;
    }
}
