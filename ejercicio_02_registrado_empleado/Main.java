package ejercicio_02_registrado_empleado;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        GestionEmpleados gestionEmpleados = new GestionEmpleados();

        boolean salir = false;
        while (!salir) {
            String opcion = JOptionPane.showInputDialog("selecciona una opcion:\n"
                    + "1.añadir empleado\n"
                    + "2.elimianr empleado\n"
                    + "3.mostrar empleados\n"
                    + "4.salir");

            switch (opcion) {
                case "1":
                    String nombre = JOptionPane.showInputDialog("ingresa el nombre del empleado:");
                    int edad = Integer.parseInt(JOptionPane.showInputDialog("ingrese la edad del empleado:"));
                    int tipo = Integer.parseInt(JOptionPane.showInputDialog("ingrese el tipo de empleado que sera(1 - permanente, 2 - temporal):"));
                    double salario = Double.parseDouble(JOptionPane.showInputDialog("ingrese el salario del empleado:"));
                    if (tipo == 1) {
                        int antiguedad = Integer.parseInt(JOptionPane.showInputDialog("ingrese la antiguedad del empleado permanente:"));
                        gestionEmpleados.agregarEmpleado(new EmpleadoPermanente(nombre, edad, tipo, salario, antiguedad));
                    } else if (tipo == 2) {
                        String fechaFin = JOptionPane.showInputDialog("ingrese la fecha de fin del contrato (dd/mm/yyyy) del empleado temporal:");
                        gestionEmpleados.agregarEmpleado(new EmpleadoTemporal(nombre, edad, tipo, salario, fechaFin));
                    } else {
                        JOptionPane.showMessageDialog(null, "opcion invalida");
                    }
                    break;
                case "2":
                    int idEliminar = Integer.parseInt(JOptionPane.showInputDialog("ingress el id del empleado para eliminar:"));
                    gestionEmpleados.eliminarEmpleado(idEliminar);
                    break;
                case "3":
                    gestionEmpleados.mostrarEmpleado();
                    break;
                case "4":
                    salir = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "opcion invalida");
                    break;
            }
        }
    }
}