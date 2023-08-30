package shoponline;

public class Remera extends Producto {

    public Talle talle;

    public String modelo;
    public Remera(String modelo, String desc, double precio, Talle talle) {
        super(desc, precio);
       this.talle = talle;
        this.desc = desc;
        this.modelo = modelo;
    }

    public String ticket() {
        return modelo + " " +  desc + ".......$" + this.getPrecio() + " " + "(" + "talle" +  talle +")";
    }

    @Override
    public String toString() {
        return modelo + " " + desc + " " + this.getPrecio() + " " + "(" + "talle" +  talle +")";
    }
    
    public double getPrecio() {
        if (talle.getTalle().equalsIgnoreCase(Talle.S.getTalle()) ) {
            double s = precio;
            precio = s;
        }

        if (talle.getTalle().equalsIgnoreCase ( Talle.M.getTalle())) {
            double m = precio * 5 / 100;
            precio = precio + m;
        }

        if (talle.getTalle().equalsIgnoreCase(Talle.L.getTalle())) { //Converti los dos en String 
            double l = precio * 10 / 100;
            precio = precio + l;
        }

        if (talle.getTalle().equalsIgnoreCase(Talle.XL.getTalle())) {
            double xl = precio * 15 / 100;
            precio = precio + xl;
        }

        return precio;
    }

}
