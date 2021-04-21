public class Persona {
    String Nombre;
    String Apellido;
    public Persona(String nombre, String apellido) {
        this.Nombre = nombre;
        this.Apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getNombre() {
        return Nombre;
    }
    public void setApellido(String apellido) {
        this.Apellido = apellido;
    }

    public String getApellido() {
        return Apellido;
    }
}
