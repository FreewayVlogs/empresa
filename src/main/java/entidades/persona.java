/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author mauriciounate
 */
public class Persona {
    
    private String IdPersona, Pnombre, Snombre, Papellido, Sapellido,telefono, sexo, fechaNacimiento,tipoDoc, NumDoc, estado;

    public Persona(String IdPersona, String Pnombre, String Snombre, String Papellido, String Sapellido, String telefono, String sexo, String fechaNacimiento, String tipoDoc, String NumDoc, String estado) {
        this.IdPersona = IdPersona;
        this.Pnombre = Pnombre;
        this.Snombre = Snombre;
        this.Papellido = Papellido;
        this.Sapellido = Sapellido;
        this.telefono = telefono;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoDoc = tipoDoc;
        this.NumDoc = NumDoc;
        this.estado = estado;
    }

    public Persona() {
    }

    public String getIdPersona() {
        return IdPersona;
    }

    public String getPnombre() {
        return Pnombre;
    }

    public String getSnombre() {
        return Snombre;
    }

    public String getPapellido() {
        return Papellido;
    }

    public String getSapellido() {
        return Sapellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getSexo() {
        return sexo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public String getNumDoc() {
        return NumDoc;
    }

    public String getEstado() {
        return estado;
    }

    public void setIdPersona(String IdPersona) {
        this.IdPersona = IdPersona;
    }

    public void setPnombre(String Pnombre) {
        this.Pnombre = Pnombre;
    }

    public void setSnombre(String Snombre) {
        this.Snombre = Snombre;
    }

    public void setPapellido(String Papellido) {
        this.Papellido = Papellido;
    }

    public void setSapellido(String Sapellido) {
        this.Sapellido = Sapellido;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public void setNumDoc(String NumDoc) {
        this.NumDoc = NumDoc;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
