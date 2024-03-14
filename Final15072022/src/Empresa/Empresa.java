package Empresa;

import Adicional.Adicional;
import Adicional.CobroPorCredito;
import Criterio.Criterio;
import Criterio.CriterioPorTema;
import Criterio.CriterioContienePalabra;
import Criterio.CriterioCostoMenor;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Usuario>usuarios;
    private Criterio criterio;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.usuarios = new ArrayList<>();
    }
    public ArrayList<Usuario>potencialmenteInteresado(Curso curso, Criterio criterio){
        ArrayList<Usuario>losQuecumple = new ArrayList<>();
        for(Usuario usuario: usuarios){
            if(usuario.tieneCursoAprobado(curso) && criterio.cumple(curso)){
                losQuecumple.add(usuario);
            }
        }
        return losQuecumple;
    }

    public static void main(String[] args) {
        Empresa empresa= new Empresa("empresa");

        // Crear algunos cursos
        Curso cursoBasico = new Curso("Introducción a Java", "Programación", 100, 4);
        Curso cursoProfundo = new Curso("Patrones de diseño", "Programación", 200, 8);
        Curso cursoPorCredito = new CursoPorCredito("Java avanzado", "Programación", 0, 12, 100);
        Adicional cobroCredito= new CobroPorCredito(12, 100, 200);

        // Crear una carrera
        Carreras carreraProgramacion = new Carreras("Programación orientada a objetos", "Programación", 10);
        carreraProgramacion.addElemento(cursoBasico);
        carreraProgramacion.addElemento(cursoProfundo);

        // Crear un usuario
        Usuario usuario1 = new Usuario("Juan", "Pérez");
        usuario1.addCursoAprobados(cursoProfundo);

        // Buscar cursos por tema
        System.out.println("**Cursos con tema Java:**");
        Criterio criterioTemaJava = new CriterioPorTema("Java");
        for (Curso curso : cursoBasico.buscar(criterioTemaJava)) {
            System.out.println(curso.getNombre());
        }

        // Buscar cursos por nombre
        System.out.println("\n**Cursos con la palabra 'Objetos' en el nombre:**");
        Criterio criterioContieneObjetos = new CriterioContienePalabra("Objetos");
        for (Curso curso : cursoBasico.buscar(criterioContieneObjetos)) {
            System.out.println(curso.getNombre());
        }

        // Buscar cursos por costo menor a $1000
        System.out.println("\n**Cursos con costo menor a $1000:**");
        Criterio criterioCostoMenor = new CriterioCostoMenor(10);
        for (Curso curso : cursoBasico.buscar(criterioCostoMenor)) {
            System.out.println(curso.getNombre());
        }

        // Buscar cursos de la carrera
        System.out.println("\n**Cursos de la carrera 'Programación orientada a objetos':**");
        for (Curso curso1 : carreraProgramacion.buscar(new CriterioPorTema(""))){
            System.out.println(curso1.getNombre());
        }

        // Obtener usuarios potencialmente interesados en un curso
        System.out.println("\n**Usuarios potencialmente interesados en 'Java avanzado':**");
        for (Usuario usuario : empresa.potencialmenteInteresado(cursoPorCredito, criterioTemaJava)) {
            System.out.println(usuario + " " + usuario.getApellido());
        }
    }

}
