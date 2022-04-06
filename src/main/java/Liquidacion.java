public class Liquidacion implements EstadoPrenda {
  Double precioBase;

  public Liquidacion(Double precioBase) {
    this.precioBase = precioBase;
  }

  @Override
  public Double precio() {
    return precioBase*0.5;
  }

}
