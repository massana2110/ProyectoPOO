package entidades;


 
public class CuentaTarjetaDebito extends Cuenta{
    public CuentaTarjetaDebito(String unNombre, String unaDescripcion, double unSaldo, String tipoTarjeta){
        super.Cuenta(unNombre, unaDescripcion, unSaldo, tipoTarjeta);
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
