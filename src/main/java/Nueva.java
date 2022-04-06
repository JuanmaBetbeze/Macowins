public class Nueva implements Prenda {
  Double precioBase;
  TipoPrenda tipoPrenda;

  public Nueva(Double precioBase, TipoPrenda tipoPrenda) {
    this.precioBase = precioBase;
    this.tipoPrenda = tipoPrenda;
  }


  @Override
  public Double precio() {
    return precioBase;
  }

  @Override
  public TipoPrenda tipo() {
    return tipoPrenda;
  }
}
