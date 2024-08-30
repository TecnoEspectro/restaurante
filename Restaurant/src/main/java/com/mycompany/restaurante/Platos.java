
package com.mycompany.restaurante;


public class Platos {

    /**
     * @return the precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getProduccion() {
        return produccion;
    }

    public void setProduccion(int produccion) {
        this.produccion = produccion;
    }
    
    
    
    private int precio=0;
    private String nombre;
    private int produccion=0;
    
    public Platos(String nombre, int precio, int produccion) {
        this.precio = precio;
        this.nombre = nombre;
        this.produccion = produccion;
    }
    
}
