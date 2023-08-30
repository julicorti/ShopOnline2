package shoponline;

public class Pantalon extends Producto {
    public String nombre;
    public int talle;
    public Modelos modelo;
    public Pantalon(Modelos modelo, String desc, double precio, int talle) {
        super(desc, precio);
      
        this.talle = talle;
        this.modelo = modelo;
    }
   
   

    public double getPrecio() {
        if (modelo.getModelo().equalsIgnoreCase(Modelos.OXFORD.getModelo())) {
            double oxford = precio * 15 / 100;
            precio = precio + oxford;
        }

        if (modelo.getModelo().equalsIgnoreCase(Modelos.RECTO.getModelo())) {
            double skinny = precio * 25 / 100;
            precio = precio + skinny;
        }

        if (modelo.getModelo().equalsIgnoreCase(Modelos.SKINNY.getModelo())) {
            double recto = precio * 15 / 100;
            precio = precio - recto;
        }
        return precio;
    }

    public String ticket() {
        return  "Pantalon " +  modelo + "........ $ " + this.getPrecio() +  "(" + talle + ")";
    }


    public String toString() {
       return  "Pantalon " + modelo + " " + this.getPrecio() + " "+  "(" + talle + ")";
    }
    
}
