package main;

import java.util.LinkedList;
import java.util.Queue;

//import utils.StudentValidator;

public class App {
    public static void main(String[] args) throws Exception {
        // NO MODIFICAR ESTE CÓDIGO
        //var estudiante = StudentValidator.validarDatos();
        //System.out.println("👤 Estudiante: " + estudiante.nombre());
        //System.out.println("✉️  Correo: " + estudiante.correo());
        // NO MODIFICAR HASTA AQUÍ
        
        LogicaClasificacion logicaClasificacion = new LogicaClasificacion();
        Queue<String> cola = new LinkedList<>();
        cola.add("Ana");
        cola.add("Luis");
        cola.add("Marta");
        
        System.out.println("Ejercicio 1\n Original:"+cola+"\nInvertido:"+logicaClasificacion.invertirColaNombres(cola));

    }
}
