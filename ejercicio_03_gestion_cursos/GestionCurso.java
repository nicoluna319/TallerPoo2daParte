package ejercicio_03_gestion_cursos;

import java.util.ArrayList;
import java.util.Scanner;


public class GestionCurso {
    private ArrayList<Curso> listaCursos;
    private Scanner objScan;

    public GestionCurso(){
        this.listaCursos = new ArrayList<>();
        this.objScan = new Scanner(System.in);
    }


    public void guardarCurso(){
        System.out.println("Agregar curso");

        System.out.println("Ingresa el nombre del curso");
        String nombre = objScan.next();

        System.out.println("Ingresa el codigo del curso");
        String codigo = objScan.next();

        //Si el metodo buscar no devuelve null quiere decir que ese codigo ya existe

        if(this.buscarPorCodigo(codigo) != null){
            System.out.println("El codigo ya existe");
        }else {
            //Creamos el curso
            Curso objCurso = new Curso(codigo,nombre);
            this.listaCursos.add(objCurso);
        }
    }

    public Curso buscarPorCodigo(String codigoBuscar){
        for (Curso cursoTemp: this.listaCursos){
            if(cursoTemp.getCodigo().equalsIgnoreCase(codigoBuscar)){
                return cursoTemp;
            }
            return null;
        }
    }

    public void listarCursos(){
        if (this.listaCursos.isEmpty()){
            System.out.println("No hay cursos registrados");
        }else {
            System.out.println("Lista de cursos");
            for (Curso temp : this.listaCursos){
                System.out.println(temp.toString());
            }
        }
    }
    public ArrayList<Curso> getListaCursos(){
        return listaCursos;
    }

    public void setListaCursos(ArrayList<Curso> listaCursos) {
        this.listaCursos = listaCursos;
    }
}
