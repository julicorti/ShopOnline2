
package shoponline;

public class Cliente 
{
    private String nombre;
    private int edad;
    private int telefono;
    private int dni;

    public Cliente(String nombre, int edad, int telefono, int dni) 
    {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.dni = dni;
    }
    
    public String emitir()
    {
        return "Nombre: " + nombre + "Edad: " + edad + "Telefono: " + telefono + "Dni: " + dni;
    }
}
