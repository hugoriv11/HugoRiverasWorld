/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hugoriverasworld;

import abstractfactory.AbstractFactory;
import abstractfactory.FactoryProducer;
import abstractfactory.edificaciones.Edificacion;
import abstractfactory.razas.Raza;

import builder.Milicia;
import builder.MiliciaBuilder;
import builder.elementos.Escuadron;
/**
 *
 * @author HugoJr. <Hugo Rivera at 00161417@uca.edu.sv>
 */
public class HugoRiverasWorld {

    public static void main(String[] args) {
        //hacer menu para elegir que crear
        //AbstractFactory factory;
        
        //PARA EL MENU, ESTE CODIGO DE ABAJO PUEDE SER LA OPC 1 DE CREAR VEHICULOS AEREOS
//        factory = FactoryProducer.getFactory("Edificacion");
//        Edificacion edificacion = factory.getEdificacion("Edificacion constructora vehiculos aereos");
//        edificacion.construir();
//        
//        factory = FactoryProducer.getFactory("Raza");
//        Raza raza = factory.getRaza("Nazis");
//        raza.crear();
        
        
        MenuRaza m  = MenuRaza.getInstance();
        m.showMain();

//        MenuMenu mm = MenuMenu.getInstance();
//        mm.showMain();
      
        
        
//        Escuadron creador = new Escuadron();
//        MiliciaBuilder miliciabuilder1 = new MiliciaBuilder(creador);
//        
//        miliciabuilder1.BuildAMilicia();
//        
//        Milicia milicia1 = miliciabuilder1.getMilicia();
    }
    
}
