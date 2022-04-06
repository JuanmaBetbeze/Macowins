public class Item {
    Prenda prenda;
    int cantidad;

    public Item(Prenda prenda, int cantidad) {
        this.prenda = prenda;
        this.cantidad = cantidad;
    }
    public Double precioItem(){
        return prenda.precio()*cantidad;
    }
}
