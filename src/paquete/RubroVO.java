/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

/**
 *
 * @author Marina
 */
public class RubroVO {
    private int rubro;
    private String nombre;

    public RubroVO() {
    }

    public RubroVO(int rubro, String nombre) {
        this.rubro = rubro;
        this.nombre = nombre;
    }

    public int getRubro() {
        return rubro;
    }

    public void setRubro(int rubro) {
        this.rubro = rubro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return this.nombre;
    }
}
