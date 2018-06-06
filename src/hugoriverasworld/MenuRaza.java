/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hugoriverasworld;

import abstractfactory.AbstractFactory;
import abstractfactory.FactoryProducer;
import abstractfactory.razas.Raza;
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
    
    private void opciones(){
        String opciones = "1 ) Nazis\n" + "2 ) Aliados\n" + "3 ) Japos\n" + "4 ) Salir\n";
    }
    
    public void showMain(){
        int opcion = 0;
        boolean m = false; 
        AbstractFactory factory;
        
        try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion ", null));
            } catch (NumberFormatException e) {
                opcion = 5;
            }
        
        while(!m){
            switch(opcion){
                case 1:
                    factory = FactoryProducer.getFactory("Raza");
                    Raza razaNazis = factory.getRaza("Nazis");
                    razaNazis.crear();
                    break;
                case 2:
                    factory = FactoryProducer.getFactory("Raza");
                    Raza razaAliados = factory.getRaza("Aliados");
                    razaAliados.crear();
                    break;
                case 3:
                    factory = FactoryProducer.getFactory("Raza");
                    Raza razaJapos = factory.getRaza("Japos");
                    razaJapos.crear();
                    break;
                case 4:
                    return;
                default:
                    System.err.println("ERROR! Ingresa una opcion valida por favor");
            }
        }
    }
}
