package ejercicio_02_registrado_empleado;

public class EmpleadoPermanente extends Empleado {
    private int añosAntiguedad;

    public EmpleadoPermanente(int añosAntiguedad) {
        this.añosAntiguedad = añosAntiguedad;
    }

    public EmpleadoPermanente(String nombre, String posicion, Double salario, int id, int añosAntiguedad) {
        super(nombre, posicion, salario, id);
        this.añosAntiguedad = añosAntiguedad;
    }

    public int  getAñosAntiguedad(){
        return añosAntiguedad;
    }

    public void setAñosAntiguedad(int añosAntiguedad){
        this.añosAntiguedad = añosAntiguedad;
    }
}
