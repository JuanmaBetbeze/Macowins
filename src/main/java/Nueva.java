public class Nueva implements EstadoPrenda {
  Double precioBase;

  public Nueva(Double precioBase) {
    this.precioBase = precioBase;

  }
  @Override
  public Double precio() {
    return precioBase;
  }
}
