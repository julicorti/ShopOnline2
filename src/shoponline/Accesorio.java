package shoponline;

public class Accesorio extends Producto implements Metal{

    public double peso;
    public Metales metal;
    public String desc;
    public String nombre;
    public String tipo;
    public Accesorio(String nombre, String desc, double precio, String tipo, Metales metal) {
        super(desc, precio);
       this.nombre = nombre;
       this.desc = desc;
       this.tipo = tipo;
       this.metal = metal;
    }
    
    public String ticket() {
        return  nombre + " + " + desc + ".......$" + precio + "(" + tipo + ")";
    }

    @Override
    public String toString() {
       return  nombre + " + " + desc + " " + precio + " " + "(" + tipo + ")";
    }
    
    public double getPrecio() {
        if (metal.getMetal().equalsIgnoreCase(Metales.ORO.getMetal())) {
            this.precio = 33;
        }

        if (metal.getMetal().equalsIgnoreCase(Metales.PLATA.getMetal())) {
            this.precio = 24;
        }
        
        if (metal.getMetal().equalsIgnoreCase(Metales.ORO.getMetal())) {
            this.precio = 1;
        }

        double precioF = precio * peso;
        // deberían invocar solo una vez a los dos métodos
        calcularImpuestoTransporte();
        
        calcularImpuestoAduanero();
        
        // pasar como parámetro el precioF
        return precioF + calcularImpuestoTransporte() + calcularImpuestoAduanero();
    }
    
    @Override
    public double calcularImpuestoTransporte(){
        double impTransporte = precio * 2 / 100;
        
        return impTransporte;
    }

    @Override
    public double calcularImpuestoAduanero() {
        double impAduanero = precio * 10 / 100;
        
        return impAduanero;
    }
}
