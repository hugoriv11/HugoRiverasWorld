/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hugoriverasworld;

import abstractfactory.AbstractFactory;
import abstractfactory.FactoryProducer;
import abstractfactory.razas.Raza;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author HugoJr. <Hugo Rivera at 00161417@uca.edu.sv>
 */
public class MenuRaza {
    private static MenuRaza instance;
    
    private MenuRaza(){
    }
    
    public static MenuRaza getInstance(){
        if (instance == null){
            synchronized (MenuRaza.class){
                if (instance == null){
                    instance = new MenuRaza();
                }
            }
        }
        return instance;
    }
    
//    private void opciones(){
//        String opciones = "1 ) Nazis\n" + "2 ) Aliados\n" + "3 ) Japos\n" + "4 ) Salir\n";
//    }
    
    public void showMain(){
        int opcion;
        boolean m = false; 
        Scanner sn = new Scanner(System.in);
        AbstractFactory factory;
        
//        try {
//                opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion ", null));
//            } catch (NumberFormatException e) {
//                opcion = 5;
//            }
        
        while(!m){     
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
                        break;            
                    case 2:
                        System.out.println("\n");
                        factory = FactoryProducer.getFactory("Raza");
                        Raza razaAliados = factory.getRaza("Aliados");
                        razaAliados.crear();
                        break;
                    case 3:
                        System.out.println("\n");
                        factory = FactoryProducer.getFactory("Raza");
                        Raza razaJapos = factory.getRaza("Japos");
                        razaJapos.crear();
                        break;
                    case 4:
                        System.out.println("\nChaoooo....");
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
    }
}

