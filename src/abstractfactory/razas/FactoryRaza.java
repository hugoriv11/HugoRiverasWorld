/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory.razas;

import abstractfactory.AbstractFactory;
import abstractfactory.edificaciones.Edificacion;

/**
 *
 * @author HugoJr. <Hugo Rivera at 00161417@uca.edu.sv>
 */
public class FactoryRaza implements AbstractFactory{

    @Override
    public Edificacion getEdificacion(String type) {
        return null;
    }

    @Override
    public Raza getRaza(String type) {
// ============= switch con los metodos de la creacion de las razas IMPORTANTE HACER===========================
//        switch(type){
//            case "Edificacion recolectora de recursos 1":
//                return new EdificacionRecolectarRecurso1();
//            case "Edificacion recolectora de recursos 2":
//                return new EdificacionRecolectarRecurso2();
//            case "Edificacion recolectora de recursos 3":
//                return new EdificacionRecolectarRecurso3();
//            case "Edificacion entrenadora de milicia":
//                return new EdificacionEntrenarMilicia();
//            case "Edificacion constructora vehiculos terrestres":
//                return new EdificacionConstruirVehiculoTerrestre();
//            case "Edificacion constructora vehiculos aereos":
//                return new EdificacionConstruirVehiculoAereo();
//        }
//        return null;
//    }
}
