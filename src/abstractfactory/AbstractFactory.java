/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import abstractfactory.edificaciones.Edificacion;
import abstractfactory.razas.Raza;

/**
 *
 * @author HugoJr. <Hugo Rivera at 00161417@uca.edu.sv>
 */
public interface AbstractFactory {
    Edificacion getEdificacion(String type);
    Raza getRaza(String type);
}
