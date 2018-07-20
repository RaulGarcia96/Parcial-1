/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

/**
 *
 * @author RaulG
 */
public class Producto {
    int codigo;
    String nombre;
    String descripcion;
    String categoria;
    int cantidad;
    String preciov;
    String precioc;
    String provedor;

    public Producto(int codigo, String nombre, String descripcion, String categoria, int cantidad, String preciov, String precioc, String provedor) {
        this.codigo = 0;
        this.nombre = "";
        this.descripcion = "";
        this.categoria = "";
        this.cantidad = 0;
        this.preciov = "";
        this.precioc = "";
        this.provedor = "";
    }

    Producto(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Producto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getPreciov() {
        return preciov;
    }

    public void setPreciov(String preciov) {
        this.preciov = preciov;
    }

    public String getPrecioc() {
        return precioc;
    }

    public void setPrecioc(String precioc) {
        this.precioc = precioc;
    }

    public String getProvedor() {
        return provedor;
    }

    public void setProvedor(String provedor) {
        this.provedor = provedor;
    }
    
    
}
