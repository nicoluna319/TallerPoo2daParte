package ejercicio_02_registrado_empleado;

import java.util.ArrayList;

public class GestionEmpleados {
    private ArrayList<Empleado>empleados;

    public GestionEmpleados(){
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado){
        empleados.add(empleado);
    }

    public boolean eliminarEmpleado (int idEmpleado){
        return empleados.removeIf(emp ->emp.getIdEmpleado() == idEmpleado );

    }

    public void mostrarEmpleado(){
        for (Empleado emp : empleados){
            System.out.println("ID Empleado: " + emp.getIdEmpleado()+", Nombre: " +emp.getNombre()+",Salario:" + emp.getSalario());
        }
    }
}
