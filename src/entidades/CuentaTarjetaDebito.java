package entidades;


 
public class CuentaTarjetaDebito extends Cuenta{
    public CuentaTarjetaDebito(String unNombre, String unaDescripcion, double unSaldo){
        super.Cuenta(unNombre, unaDescripcion, unSaldo);
    }

    @Override
    public double abonarCuenta(double monto) {
        super.abonarCuenta(monto); 
    }

    @Override
    public double retiroCuenta(double monto) {
        super.retiroCuenta(monto); 
    }
    
}
