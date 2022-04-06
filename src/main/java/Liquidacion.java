public class Liquidacion implements Prenda{
  Double precioBase;
  TipoPrenda tipoPrenda;

  public Liquidacion(Double precioBase, TipoPrenda tipoPrenda) {
    this.precioBase = precioBase;
    this.tipoPrenda = tipoPrenda;
  }

  @Override
  public Double precio() {
    return precioBase*0.5;
  }

  @Override
  public TipoPrenda tipo() {
    return tipoPrenda;
  }
}
