import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Venta {
  List <Item> items=new ArrayList<>();
  LocalDate fecha;

  public void agregarItem(Prenda prenda,int cantidad){
    Item item=new Item(prenda,cantidad);
    items.add(item);
  }
  abstract Double recargo(Double precioBase);

  public Double importeFinal(){
    return this.recargo(items.stream().mapToDouble(Item::precioItem).sum());
  }

}
