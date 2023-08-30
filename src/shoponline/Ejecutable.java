package shoponline;


import java.util.ArrayList;
import java.util.Scanner;

public class Ejecutable {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        
        ArrayList<Producto> productos = new ArrayList();
        productos.add(new Remera("Remera", "Recta blanca", 2300, Talle.L));
        productos.add(new Pantalon(Modelos.OXFORD , "" ,5000, 44));
        productos.add(new Accesorio("collar", "dije cruz", 1800, "bijouteria", Metales.ORO));
        productos.add(new Accesorio("anillo", "de compromiso", 1100, "bijouteria", Metales.PLATA));
        productos.add(new Remera("Musculosa", "negra", 5600, Talle.M));
        productos.add(new Pantalon(Modelos.SKINNY , "" ,1200, 42));
       
        Cliente c1 = crearC();//crea cliente 
        
        Venta v = new Venta(c1);//se crea una venta y se le pasa el cliente creado

        boolean seguirAgregando = true;
        v.agregarProductos(menu(productos));
        while (seguirAgregando) {//while de si quiere seguir agregando productos
            System.out.println("Desea agregar mas productos?\n[1]Si\n[2]No");
            int respuesta = Integer.parseInt(teclado.nextLine());
            if (respuesta == 1) {
                v.agregarProductos(menu(productos));
            } else {
                seguirAgregando = false;
            }
        }
        boolean seguirSacando = true;
        while (seguirSacando) {//while si quiere sacar algun producto 
            System.out.println("Desea remover un producto?\n[1]Si\n[2]No");
            int respuesta2 = Integer.parseInt(teclado.nextLine());
            if (respuesta2 == 1) {
                v.removerProducto(menu(v.getListaProd()));
            } else {
                seguirSacando = false;
            }
        }
        v.imprimirFactura();
    }

    public static Producto menu(ArrayList<Producto> productos) {

        String text = "------Menu------\n";
        int index = 0;//posicion array
        for (Producto p : productos) {//recorre los productos
            text += index + ": " + p.toString() + "\n";
            index++;
        }
        System.out.println(text);
        System.out.println("Elija el producto que desee: ");
        int opc = Integer.parseInt(teclado.nextLine());
        return productos.get(opc);//te devuelve el producto del index seleccionado
    }

    public static Cliente crearC() {
        System.out.println("Creando cliente...");
        System.out.println("Ingrese su nombre: ");
        String n = teclado.nextLine();
        System.out.println("Ingrese su edad: ");
        int e = Integer.parseInt(teclado.nextLine());
        System.out.println("Ingrese su telefono: ");
        int t = Integer.parseInt(teclado.nextLine());
        System.out.println("Ingrese su dni: ");
        int d = Integer.parseInt(teclado.nextLine());

        return new Cliente(n, e, t, d);
    }

}
