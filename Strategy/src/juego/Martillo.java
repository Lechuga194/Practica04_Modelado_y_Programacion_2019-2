/*
 * Amaya Lopez Dulce,Lechuga Martinez Eduardo | Practica01 | Modelado y Programacion
 */
package juego;

/**
 * Clase que asigna el comportamiento del hacha
 * @since 27/8/18
 * @authors Dulce, Lechuga
 */
public class Martillo extends Arma{
    
    public Martillo(){
        setTipoAtaque(new AtaqueConHacha());
    }
    
    
}
