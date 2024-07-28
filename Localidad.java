public class Localidad {
    private String nombre;
    private int capacidad;
    private int precio;

    public Localidad(String nombre, int capacidad, int precio)
    {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.precio = precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getPrecio() {
        return precio;
    }
}
