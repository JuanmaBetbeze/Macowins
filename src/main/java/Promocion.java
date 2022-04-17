
public class Promocion implements EstadoPrenda {
  Double valorFijo;

  public Promocion(Double valorFijo) {

    this.valorFijo = valorFijo;
  }
  @Override
  public Double precio(Double precioBase) {
    return precioBase-valorFijo;
  }
}
