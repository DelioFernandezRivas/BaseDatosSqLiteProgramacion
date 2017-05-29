/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlprogramacion;


/**
 *
 * @author delio
 */
public class Carta  {
 
   
    private String nombre;
    private int vida;
    private int ataque;
    private int coste;
    private int id;


    public Carta(String nombre,int vida, int ataque, int coste, int id) {
        this.nombre= nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.coste = coste;
        this.id=id;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getCoste() {
        return coste;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

 

}
