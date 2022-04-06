import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Venta {
  List <Prenda> prendas;
  LocalDate fecha;
  TipoDePago tipoDePago;

  public Venta(List<Prenda> prendas, LocalDate fecha, TipoDePago tipoDePago) {
    this.prendas = prendas;
    this.fecha = fecha;
    this.tipoDePago = tipoDePago;
  }
  public void agregarPrenda(Prenda prenda){
    prendas.add(prenda);
  }
  public Double precioFinal(){
    return prendas.stream().mapToDouble(prenda -> tipoDePago.precioModificado(prenda.precio())).sum();
  }
  public TipoPrenda tipoPrenda(Prenda prenda){
    return prenda.tipo();
  }

}
