package entidades;


public class Cuenta {
   private String nombre;
   private String descripcion;
   private double saldo;
   private String tarjeta;
   
  public void Cuenta(){
      
  }
  
  public void Cuenta(String unNombre, String unaDescripcion, double unSaldo, String tipoTarjeta){
      this.nombre = unNombre;
      this.descripcion = unaDescripcion;
      this.saldo = unSaldo;
      this.tarjeta = tipoTarjeta;
      
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
    
     public String getTarjeta(){
        return tarjeta;
    }
    
    public void setTarjeta(String tarjeta){
        this.tarjeta = tarjeta;        
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

