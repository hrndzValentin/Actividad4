package com.animales;

public class Leon extends Felino{
    public String getSonido() {
        return "Rugido";
    }
    /**
     * Método que devuelve un String con los alimentos de un león
     * @return Un valor String con la alimentación de un león: “Carnívoro”
     */
    public String getAlimentos() {
        return "Carnívoro";
    }

    public String getHábitat() {
        return "Praderas";
    }
    /**
     * Método que devuelve un String con el nombre científico de un león
     * @return Un valor String con el nombre científico de un león:
     * “Panthera leo”
     */
    public String getNombreCientífico() {
        return "Panthera leo";
    }
}
