/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adrián
 */
public class Satelite {
 
    private double merid;
    private double paral ;
    private double dTierra;

public Satelite (){}
public Satelite (double m, double p,double d){
    merid = m;
    paral = p;
    dTierra = d;
}
public void verPosicion ( ) {

System.out.println(" El satelite esta en el paralelo " +paral + " y meridiano " + merid+ " a una distancia de la tierra de "+ dTierra);
}  
}
