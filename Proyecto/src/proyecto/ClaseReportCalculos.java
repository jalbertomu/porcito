/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author jalberto.munoz
 */
public class ClaseReportCalculos {
    double CC;
    double desempleo;
    double profesional;
    double pagarIRPF;
    double totalADeducir;
    double TotalAPercibir;
    double BaseIT;
    double RemunPersonal;
    double Prorrata;
    public ClaseReportCalculos(){
        
    }
    public ClaseReportCalculos(double CC, double desempleo, double profesional, double pagarIRPF, double totalADeducir, double TotalAPercibir, double BaseIT, double RemunPersonal, double Prorrata) {
        this.CC = CC;
        this.desempleo = desempleo;
        this.profesional = profesional;
        this.pagarIRPF = pagarIRPF;
        this.totalADeducir = totalADeducir;
        this.TotalAPercibir = TotalAPercibir;
        this.BaseIT = BaseIT;
        this.RemunPersonal = RemunPersonal;
        this.Prorrata = Prorrata;
    }

    public double getCC() {
        return CC;
    }

    public void setCC(double CC) {
        this.CC = CC;
    }

    public double getDesempleo() {
        return desempleo;
    }

    public void setDesempleo(double desempleo) {
        this.desempleo = desempleo;
    }

    public double getProfesional() {
        return profesional;
    }

    public void setProfesional(double profesional) {
        this.profesional = profesional;
    }

    public double getPagarIRPF() {
        return pagarIRPF;
    }

    public void setPagarIRPF(double pagarIRPF) {
        this.pagarIRPF = pagarIRPF;
    }

    public double getTotalADeducir() {
        return totalADeducir;
    }

    public void setTotalADeducir(double totalADeducir) {
        this.totalADeducir = totalADeducir;
    }

    public double getTotalAPercibir() {
        return TotalAPercibir;
    }

    public void setTotalAPercibir(double TotalAPercibir) {
        this.TotalAPercibir = TotalAPercibir;
    }

    public double getBaseIT() {
        return BaseIT;
    }

    public void setBaseIT(double BaseIT) {
        this.BaseIT = BaseIT;
    }

    public double getRemunPersonal() {
        return RemunPersonal;
    }

    public void setRemunPersonal(double RemunPersonal) {
        this.RemunPersonal = RemunPersonal;
    }

    public double getProrrata() {
        return Prorrata;
    }

    public void setProrrata(double Prorrata) {
        this.Prorrata = Prorrata;
    }
    
    
}
