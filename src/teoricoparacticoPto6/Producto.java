package teoricoparacticoPto6;

/**
 *
 * @author AlanSandoval
 */
public class Producto {
    String idPrducto,nombre;
    int precio;   
    
    public Producto(String idProducto,String nombre,int precioProd)
    {
        this.idPrducto=idProducto;
        this.nombre=nombre;
        this.precio=precioProd;
    }

    public String getIdPrducto() {
        return idPrducto;
    }

    public void setIdPrducto(String idPrducto) {
        this.idPrducto = idPrducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Producto() {
    }
    
    @Override
    public String toString()
    {
        return idPrducto+", "+nombre+" ,"+precio;
    }
}
    

