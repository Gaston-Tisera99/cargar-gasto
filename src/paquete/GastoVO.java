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
public class GastoVO {
    private int idGasto;
    private String fecha;
    private int rubro;
    private float importe;

    public GastoVO() {
    }

    public GastoVO(int idGasto, String fecha, int rubro, float importe) {
        this.idGasto = idGasto;
        this.fecha = fecha;
        this.rubro = rubro;
        this.importe = importe;
    }

    public int getIdGasto() {
        return idGasto;
    }

    public void setIdGasto(int idGasto) {
        this.idGasto = idGasto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getRubro() {
        return rubro;
    }

    public void setRubro(int rubro) {
        this.rubro = rubro;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }
    
    
}
