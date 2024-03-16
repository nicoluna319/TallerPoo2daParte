package ejercicio_03_gestion_cursosMeta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Instancias
        Scanner objScan = new Scanner(System.in);
        GestionCurso objGestion = new GestionCurso();

        int option = 0;

        do {
            System.out.println("""
                    Menu de Opciones
                    1. Administrar cursos.
                    2. Administrar estudiantes.
                    3. Salir.              
                    """);

            option = objScan.nextInt();

            switch (option){
                int option2 = 0;
                case 1:

                    do {
                        System.out.println("""
                            Menu de Opciones
                        1. Crear un curso.
                        2. Buscar curso por codigos.
                        3. Listar cursos. 
                        4.  Salir.         
                            
                            """);
                        option2 = objScan.nextInt();

                        switch (option2){
                            case 1:
                                objGestion.guardarCurso(objScan);
                                break;

                            case 2:
                                int option3 = 0;
                                do {
                                    System.out.println("""
                                             Menu de Opciones
                                1. Agregar estudiante.
                                2. Eliminar estudiante.
                                3. Listar Estudiantes. 
                                4.  Salir.       
                                            
                                            """);

                                    option3 = objScan.nextInt();

                                    switch (option3){
                                        case 1:
                                            objGestion.listarCursos();
                                            System.out.println("Ingrese el codigo del curso donde desea inscribir");
                                            String codigo = objScan.next();
                                            Curso curso = objGestion.buscarPorCodigo(codigo);

                                            if (curso == null){
                                                System.out.println("Curso no encontrado");
                                            }else {
                                                curso.guardarEstudiante(objScan);
                                            }
                                            break;
                                        case 3:
                                            objGestion.listarCursos();
                                            System.out.println("Ingrese el codigo del curso donde desea inscribir el estudiante");
                                            codigo = objScan.next();
                                            curso = objGestion.buscarPorCodigo(codigo);

                                            if (curso == null){
                                                System.out.println("Curso no encontrado");
                                            }else {
                                                curso.eliminarEstudiante();
                                            }
                                            break;

                                        case 2:

                                            objGestion.listarCursos();

                                            System.out.println("Ingrese el codigo del curso del estudiante a eliminar");
                                            codigo = objScan.next();

                                            Curso objcurso
                                    }

                    } while (option != 4);
                    break;

            }



    }
}
