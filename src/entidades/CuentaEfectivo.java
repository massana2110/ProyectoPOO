package entidades;


public class CuentaEfectivo extends Cuenta {

public CuentaEfectivo(String unNombre, String unaDescripcion, double unSaldo){
    super.Cuenta(unNombre, unaDescripcion, unSaldo);
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
