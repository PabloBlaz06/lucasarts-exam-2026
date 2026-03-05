package org.Domain;

public class CharacterModem {
    private String id;
    private String nombre;
    private int nivel;
    private String habilidad;
    private int vida;

    public CharacterModem(String id, String nombre, int nivel, String habilidad) {
        this.id = id;
        this.nombre = nombre;
        this.nivel = nivel;
        this.habilidad = habilidad;
        this.vida = 100;
    }

    public static String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}
