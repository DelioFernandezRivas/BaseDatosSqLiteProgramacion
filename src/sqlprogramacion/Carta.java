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
public class Carta {

    private String nombre, vida, ataque, coste;
    public static String id;

    public Carta(String id, String nombre, String vida, String ataque, String coste) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.coste = coste;
        this.id = id;
    }

    public void setVida(String vida) {
        this.vida = vida;
    }

    public void setAtaque(String ataque) {
        this.ataque = ataque;
    }

    public void setCoste(String coste) {
        this.coste = coste;
    }

    public String getVida() {
        return vida;
    }

    public String getAtaque() {
        return ataque;
    }

    public String getCoste() {
        return coste;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        Carta.id = id;
    }

}
