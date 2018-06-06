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
import builder.Vehiculo;
import builder.VehiculoBuilder;
import builder.elementos.Escuadron;
import builder.elementos.Especialista;
import builder.elementos.VehiculoAereo;
import builder.elementos.VehiculoTerrestre;
import javax.swing.JOptionPane;

/**
 *
 * @author HugoJr. <Hugo Rivera at 00161417@uca.edu.sv>
 */
public class MenuMenu {
    private static MenuMenu instance;
    
    private MenuMenu(){
    }
    
    public static MenuMenu getInstance(){
        if (instance == null){
            synchronized (MenuMenu.class){
                if (instance == null){
                    instance = new MenuMenu();
                }
            }
        }
        return instance;
    }
    
    private void opciones(){
        String opciones = "1 ) Crear edificacion recolectora de recurso 1\n" + 
                "2 ) Crear edificacion recolectora de recurso 2\n" + 
                "3 ) Crear edificacion recolectora de recurso 3\n" +
                "4 ) Crear edificacion entrenar milicias\n" +
                "5 ) Crear edificacion construir vehiculos terrestres\n" +
                "6 ) Crear edificacion construir vehiculos aereos\n" +
                "7 ) Crear Escuadron\n" +
                "8 ) Crear Especialista\n" +
                "9 ) Crear vehiculo terrestre\n" +
                "10 ) Crear vehiculo aereo\n" +
                "11 ) Salir\n";
    }
    
    public void showMain(){
        int opcion = 0;
        boolean m = false; 
        AbstractFactory factory;
        
        try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion ", null));
            } catch (NumberFormatException e) {
                opcion = 12;
            }
        
        while(!m){
            switch(opcion){
                case 1:
                    factory = FactoryProducer.getFactory("Edificacion");
                    Edificacion edificacionRecur1 = factory.getEdificacion("Edificacion recolectora de recursos 1");
                    edificacionRecur1.construir();
                    break;
                case 2:
                    factory = FactoryProducer.getFactory("Edificacion");
                    Edificacion edificacionRecur2 = factory.getEdificacion("Edificacion recolectora de recursos 2");
                    edificacionRecur2.construir();
                    break;
                case 3:
                    factory = FactoryProducer.getFactory("Edificacion");
                    Edificacion edificacionRecur3 = factory.getEdificacion("Edificacion recolectora de recursos 3");
                    edificacionRecur3.construir();
                    break;
                case 4:
                    factory = FactoryProducer.getFactory("Edificacion");
                    Edificacion edificacionMilicia = factory.getEdificacion("Edificacion entrenadora de milicia");
                    edificacionMilicia.construir();
                    break;
                case 5:
                    factory = FactoryProducer.getFactory("Edificacion");
                    Edificacion edificacionTerrestres = factory.getEdificacion("Edificacion constructora vehiculos terrestres");
                    edificacionTerrestres.construir();
                    break;
                case 6:
                    factory = FactoryProducer.getFactory("Edificacion");
                    Edificacion edificacionAereos = factory.getEdificacion("Edificacion constructora vehiculos aereos");
                    edificacionAereos.construir();
                    break;
                case 7:
                    Escuadron creador1 = new Escuadron();
                    MiliciaBuilder miliciabuilder1 = new MiliciaBuilder(creador1);
        
                    miliciabuilder1.BuildAMilicia();
        
                    Milicia milicia1 = miliciabuilder1.getMilicia();
                case 8:
                    Especialista creador2 = new Especialista();
                    MiliciaBuilder miliciabuilder2 = new MiliciaBuilder(creador2);
        
                    miliciabuilder2.BuildAMilicia();
        
                    Milicia milicia2 = miliciabuilder2.getMilicia();
                case 9:
                    VehiculoTerrestre creador3 = new VehiculoTerrestre();
                    VehiculoBuilder vehiculobuilder1 = new VehiculoBuilder(creador3);
        
                    vehiculobuilder1.BuildAVehiculo();
        
                    Vehiculo vehiculo1 = vehiculobuilder1.getVehiculo();
                case 10:
                    VehiculoAereo creador4 = new VehiculoAereo();
                    VehiculoBuilder vehiculobuilder2 = new VehiculoBuilder(creador4);
        
                    vehiculobuilder2.BuildAVehiculo();
        
                    Vehiculo vehiculo2 = vehiculobuilder2.getVehiculo();
                case 11:
                    return;
                default:
                    System.err.println("ERROR! Ingresa una opcion valida por favor");
            }
        }
    }
}