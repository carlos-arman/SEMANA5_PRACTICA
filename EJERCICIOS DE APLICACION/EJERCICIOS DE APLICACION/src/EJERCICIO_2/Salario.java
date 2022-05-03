
package EJERCICIO_2;

public class Salario {
   double venta;
    public Salario() {
    }

    public Salario(double venta) {
        this.venta = venta;
    }

    public double getVenta() {
        return venta;
    }

    public void setVenta(double venta) {
        this.venta = venta;
    }
   
    double salario(){
        double salarioliquido = 0;
        double renta;
        if(this.venta == 3000){
            double vent;
            double salarioBase = 300;
            vent = this.venta * 0.10;
            renta = (salarioBase + vent)*0.10;
            salarioliquido = (salarioBase + vent)-renta;
            return salarioliquido;
        }else if(venta >= 1000 && venta <= 2999){
            double vent;
            double salarioBase = 300;
            vent = this.venta * 0.08;
            renta = (salarioBase + vent)*0.10;
            salarioliquido = (salarioBase + vent)-renta;
            return salarioliquido;
        }else if(venta >= 1 && venta <= 999){
            double vent;
            double salarioBase = 300;
            vent = this.venta * 0.05;
            renta = (salarioBase + vent) * 0.10;
            salarioliquido = (salarioBase + vent) - renta;
            return salarioliquido;
        }
        return salarioliquido;
    }
}