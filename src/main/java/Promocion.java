
public class Promocion implements Prenda{
  Double precioBase;
  Double valorFijo;
  TipoPrenda tipoPrenda;

  public Promocion(Double precioBase, Double valorFijo, TipoPrenda tipoPrenda) {
    this.precioBase = precioBase;
    this.valorFijo = valorFijo;
    this.tipoPrenda = tipoPrenda;
  }


  @Override
  public Double precio() {
    return precioBase-valorFijo;
  }

  @Override
  public TipoPrenda tipo() {
    return tipoPrenda;
  }
}
