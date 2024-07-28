public class Usuario {
    private String nombre;
    private int telefono;
    private int presupuesto;
    private int cantidad;

    public Usuario(String nombre, int telefono, int presupuesto, int cantidad)
    {
        this.nombre = nombre;
        this.telefono = telefono;
        this.presupuesto = presupuesto;
        this.cantidad = cantidad;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public int getCantidad() {
        return cantidad;
    }
}
