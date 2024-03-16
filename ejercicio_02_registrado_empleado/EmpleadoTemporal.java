package ejercicio_02_registrado_empleado;

public class EmpleadoTemporal extends Empleado{

    private String FechaFinContrato;

    public EmpleadoTemporal(String fechaFinContrato) {
        FechaFinContrato = fechaFinContrato;
    }

    public EmpleadoTemporal(String nombre, String posicion, Double salario, int id, String fechaFinContrato) {
        super(nombre, posicion, salario, id);
        FechaFinContrato = fechaFinContrato;
    }

    public String getFechaFinContrato(){
        return FechaFinContrato;
    }

    public void setFechaFinContrato(String fechaFinContrato){
        FechaFinContrato = fechaFinContrato;
    }
}
