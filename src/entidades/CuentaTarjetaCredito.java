package entidades;


public class CuentaTarjetaCredito extends Cuenta {
public CuentaTarjetaCredito(String unNombre, String unaDescripcion, double unSaldo){
    
}

    @Override
    public double abonarCuenta(double monto) {
        super.abonarCuenta(monto); 
        return monto;
    }

    @Override
    public double retiroCuenta(double monto) {
        super.retiroCuenta(monto); 
        return monto;
    }


}
