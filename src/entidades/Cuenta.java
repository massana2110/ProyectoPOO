package entidades;


public class Cuenta {
   private String nombre;
   private String descripcion;
   private double saldo;

   
  public void Cuenta(){
      
  }
  
  public void Cuenta(String unNombre, String unaDescripcion, double unSaldo){
      this.nombre = unNombre;
      this.descripcion = unaDescripcion;
      this.saldo = unSaldo;
      
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

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public double abonarCuenta(double monto){
    double nuevoSaldo;
    nuevoSaldo = monto + saldo;
    saldo = nuevoSaldo;
    return monto;
    }
    
    public double retiroCuenta(double monto){
        double nuevoSaldo;
        nuevoSaldo = monto - saldo;
        saldo = nuevoSaldo;
        return monto;
    }
  
  
  
}

