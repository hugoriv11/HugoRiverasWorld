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
import java.util.InputMismatchException;
import java.util.Scanner;
//import javax.swing.JOptionPane;

/**
 *
 * @author HugoJr. <Hugo Rivera at 00161417@uca.edu.sv>
 */
public class Menu {
    private static Menu instance;
    
    private Menu(){
    }
    
    public static Menu getInstance(){
        if (instance == null){
            synchronized (Menu.class){
                if (instance == null){
                    instance = new Menu();
                }
            }
        }
        return instance;
    }
    
    
//    private void opciones(){
//        String opciones = "1 ) Nazis\n" + "2 ) Aliados\n" + "3 ) Japos\n" + "4 ) Salir\n";
//    }
    
    public void showMain(){
        String alias;
        int jugador = 0;
        int opcion;
        int opcion1 = 0;
        boolean m = false;
        boolean n = false;
        Scanner sn = new Scanner(System.in);
        AbstractFactory factory;
        
        random();
    }
    
    /**
     * Cuando inicia jugador 1, termina bien el trabajo
     * cuando inicia jugador 2 termina el programa sin dejar que
     * el jugador 1 comience su turno
     */
    private void random(){
        boolean bande = true;
        String alias;
        Scanner sn = new Scanner(System.in);
        int jugador = (int) (Math.random() * 2) + 1;
        if(jugador == 1){
            System.out.println("JUGADOR 1 ==========================");
            System.out.println("INGRESA TU ALIAS");
            alias = sn.next();
            menus();
            jugador = 2;
            bande = false;
        }
        if(jugador == 2){
            System.out.println("JUGADOR 2 ==========================");
            System.out.println("INGRESA TU ALIAS");
            alias = sn.next();
            menus();
            jugador = 1;
            bande = false;
        }
        //bande = false;
    }
     
        /**
         * Se ejecuta el primer menu para elegir Raza
         * y luego se ejecuta el segundo menu
         * para crear las edificaciones
         */
    public void menus(){
        String alias;
        int jugador;
        int opcion;
        int opcion1 = 0;
        boolean m = false;
        boolean n = false;
        Scanner sn = new Scanner(System.in);
        AbstractFactory factory;
        while(!m){  
            System.out.println("\nELIGE TU RAZA PARA DOMINAR AL MUNDO");
            System.out.println("\n1 ) Nazis\n" + "2 ) Aliados\n" + "3 ) Japos\n" + "4 ) Salir\n");

            try {
                System.out.println("Escribe una de las opciones por favor");
                opcion = sn.nextInt();

                switch(opcion){
                    case 1:
                        System.out.println("\n");
                        factory = FactoryProducer.getFactory("Raza");
                        Raza razaNazis = factory.getRaza("Nazis");
                        razaNazis.crear();
                        m = true;
                        break;            
                    case 2:
                        System.out.println("\n");
                        factory = FactoryProducer.getFactory("Raza");
                        Raza razaAliados = factory.getRaza("Aliados");
                        razaAliados.crear();
                        m = true;
                        break;
                    case 3:
                        System.out.println("\n");
                        factory = FactoryProducer.getFactory("Raza");
                        Raza razaJapos = factory.getRaza("Japos");
                        razaJapos.crear();
                        m = true;
                        break;
                    case 4:
                        System.out.println("\n+++++++++++++++++++++++++++++++++++++");
                        m = true;
                        break;
                        //return;
                    default:
                        System.err.println("ERROR! Ingresa una opcion valida por favor");
                }   

            } catch (InputMismatchException e) {
                System.out.println("Inserta un numero por favor");
                sn.next();
            }
        }
        while(!n){
            System.out.println("\nCONSTRUYE TU IMPERIO");
            System.out.println("\n1 ) Crear edificacion recolectora de recurso 1\n" + 
                "2 ) Crear edificacion recolectora de recurso 2\n" + 
                "3 ) Crear edificacion recolectora de recurso 3\n" +
                "4 ) Crear edificacion entrenar milicias\n" +
                "5 ) Crear edificacion construir vehiculos terrestres\n" +
                "6 ) Crear edificacion construir vehiculos aereos\n" +
                "7 ) Crear Escuadron\n" +
                "8 ) Crear Especialista\n" +
                "9 ) Crear vehiculo terrestre\n" +
                "10 ) Crear vehiculo aereo\n" +
                "11 ) Salir\n");

            try {
                System.out.println("Escribe una de las opciones por favor");
                opcion1 = sn.nextInt();

                switch(opcion1){
                    case 1:
                        System.out.println("\n");
                        factory = FactoryProducer.getFactory("Edificacion");
                        Edificacion edificacionRecur1 = factory.getEdificacion("Edificacion recolectora de recursos 1");
                        edificacionRecur1.construir();
                        n = true;
                        break;
                    case 2:
                        System.out.println("\n");
                        factory = FactoryProducer.getFactory("Edificacion");
                        Edificacion edificacionRecur2 = factory.getEdificacion("Edificacion recolectora de recursos 2");
                        edificacionRecur2.construir();
                        n = true;
                        break;
                    case 3:
                        System.out.println("\n");
                        factory = FactoryProducer.getFactory("Edificacion");
                        Edificacion edificacionRecur3 = factory.getEdificacion("Edificacion recolectora de recursos 3");
                        edificacionRecur3.construir();
                        n = true;
                        break;
                    case 4:
                        System.out.println("\n");
                        factory = FactoryProducer.getFactory("Edificacion");
                        Edificacion edificacionMilicia = factory.getEdificacion("Edificacion entrenadora de milicia");
                        edificacionMilicia.construir();
                        n = true;
                        break;
                    case 5:
                        System.out.println("\n");
                        factory = FactoryProducer.getFactory("Edificacion");
                        Edificacion edificacionTerrestres = factory.getEdificacion("Edificacion constructora vehiculos terrestres");
                        edificacionTerrestres.construir();
                        n = true;
                        break;
                    case 6:
                        System.out.println("\n");
                        factory = FactoryProducer.getFactory("Edificacion");
                        Edificacion edificacionAereos = factory.getEdificacion("Edificacion constructora vehiculos aereos");
                        edificacionAereos.construir();
                        n = true;
                        break;
                    case 7:
                        System.out.println("\n");
                        Escuadron creador1 = new Escuadron();
                        MiliciaBuilder miliciabuilder1 = new MiliciaBuilder(creador1);
                        miliciabuilder1.BuildAMilicia();
                        Milicia milicia1 = miliciabuilder1.getMilicia();
                        n = true;
                        break;
                    case 8:
                        System.out.println("\n");
                        Especialista creador2 = new Especialista();
                        MiliciaBuilder miliciabuilder2 = new MiliciaBuilder(creador2);
                        miliciabuilder2.BuildAMilicia();
                        Milicia milicia2 = miliciabuilder2.getMilicia();
                        n = true;
                        break;
                    case 9:
                        System.out.println("\n");
                        VehiculoTerrestre creador3 = new VehiculoTerrestre();
                        VehiculoBuilder vehiculobuilder1 = new VehiculoBuilder(creador3);
                        vehiculobuilder1.BuildAVehiculo();
                        Vehiculo vehiculo1 = vehiculobuilder1.getVehiculo();
                        n = true;
                        break;
                    case 10:
                        System.out.println("\n");
                        VehiculoAereo creador4 = new VehiculoAereo();
                        VehiculoBuilder vehiculobuilder2 = new VehiculoBuilder(creador4);
                        vehiculobuilder2.BuildAVehiculo();
                        Vehiculo vehiculo2 = vehiculobuilder2.getVehiculo();
                        n = true;
                        break;
                    case 11:
                        System.out.println("\n");
                        System.out.println("Chaoo....");
                        n = true;
                        break;
                        //return;
                    default:
                        System.err.println("ERROR! Ingresa una opcion valida por favor");
                }         

            } catch (InputMismatchException e) {
                System.out.println("Inserta un numero por favor");
                sn.next();
            }
        }
    }
    
    //Aqui va el resto del juego
}
