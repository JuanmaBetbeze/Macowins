
public class Promocion implements EstadoPrenda {
  Double precioBase;
  Double valorFijo;

  public Promocion(Double precioBase, Double valorFijo) {
    this.precioBase = precioBase;
    this.valorFijo = valorFijo;
  }
  @Override
  public Double precio() {
    return precioBase-valorFijo;
  }
}
