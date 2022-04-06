public class Prenda {
  EstadoPrenda estadoPrenda;
  TipoPrenda tipoPrenda;

  public Prenda(EstadoPrenda estadoPrenda, TipoPrenda tipoPrenda) {
    this.estadoPrenda = estadoPrenda;
    this.tipoPrenda = tipoPrenda;
  }

  public Double precio() {
    return estadoPrenda.precio();
  }

  public TipoPrenda getTipoPrenda() {
    return tipoPrenda;
  }
}
