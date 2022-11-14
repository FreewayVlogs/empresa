/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author mauriciounate
 */
public class Empleado {
    
    private String IdPersona, cargo, sueldo, fechaIngreo;

    public Empleado(String IdPersona, String cargo, String sueldo, String fechaIngreo) {
        this.IdPersona = IdPersona;
        this.cargo = cargo;
        this.sueldo = sueldo;
        this.fechaIngreo = fechaIngreo;
    }

    public Empleado() {
    }

    public String getIdPersona() {
        return IdPersona;
    }

    public String getCargo() {
        return cargo;
    }

    public String getSueldo() {
        return sueldo;
    }

    public String getFechaIngreo() {
        return fechaIngreo;
    }

    public void setIdPersona(String IdPersona) {
        this.IdPersona = IdPersona;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }

    public void setFechaIngreo(String fechaIngreo) {
        this.fechaIngreo = fechaIngreo;
    }
    
    
    
}
