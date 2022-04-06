import java.time.LocalDate;

public class Tarjeta extends Venta {
  int cantidadCuotas;
  int coeficienteFijo;

  public Tarjeta(int cantidadCuotas, int coeficienteFijo) {
    this.cantidadCuotas = cantidadCuotas;
    this.coeficienteFijo = coeficienteFijo;
  }


  @Override
  Double recargo(Double precioBase) {
    return cantidadCuotas*coeficienteFijo+precioBase;
  }
}
