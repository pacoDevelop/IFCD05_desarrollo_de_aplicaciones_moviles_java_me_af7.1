package ejercicio2;

public class Persona {

    private String nombre;
    private int edad;
    private EstadoCivil estado;

    public Persona(String nombre, int edad, EstadoCivil estado) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public EstadoCivil getEstado() {
        return estado;
    }

    public void setEstado(EstadoCivil estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if ((this.nombre == null) ? (other.nombre != null) : !this.nombre.equals(other.nombre)) {
            return false;
        }
        if (this.edad != other.edad) {
            return false;
        }
        if (this.estado != other.estado) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + (this.nombre != null ? this.nombre.hashCode() : 0);
        hash = 59 * hash + this.edad;
        hash = 59 * hash + (this.estado != null ? this.estado.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + "edad=" + edad + "estado=" + estado.getAlias() + '}';
    }



}
