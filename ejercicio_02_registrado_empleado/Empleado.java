package ejercicio_02_registrado_empleado;

public class Empleado {
    //ATRIBUTOS
    private String nombre;
    private String posicion;
    private Double salario;
    private int id;


    public Empleado() {
    }

    public Empleado(String nombre, String posicion, Double salario, int id) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.salario = salario;
        this.id = id;
    }

    //METODOS


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void aumentoSalario(Double porcentaje){
        this.salario += (this.salario * porcentaje) / 100;

    }

    @Override
    public String toString() {
        return "ejercicio_02_registrado_empleado.Empleado{" +
                "nombre='" + nombre + '\'' +
                ", posicion='" + posicion + '\'' +
                ", salario=" + salario +
                ", id=" + id +
                '}';
    }
}
