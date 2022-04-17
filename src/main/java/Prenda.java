public class Prenda {
  EstadoPrenda estadoPrenda;
  TipoPrenda tipoPrenda;
  Double precioBase;


  public Prenda(EstadoPrenda estadoPrenda, TipoPrenda tipoPrenda,Double precioBase) {
    this.estadoPrenda = estadoPrenda;
    this.tipoPrenda = tipoPrenda;
    this.precioBase=precioBase;
  }

  public Double precio() {
    return estadoPrenda.precio(precioBase);
  }

  public TipoPrenda getTipoPrenda() {
    return tipoPrenda;
  }
}
