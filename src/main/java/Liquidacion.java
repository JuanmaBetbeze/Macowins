public class Liquidacion implements EstadoPrenda {
  @Override
  public Double precio(Double precioBase) {
    return precioBase*0.5;
  }

}
