package main;

import java.util.*;

public class LogicaClasificacion {

    /**
     * Invierte el contenido de una cola de nombres utilizando una pila auxiliar.
     * 
     * Ejemplo:
     * Entrada: ["Ana", "Luis", "Pedro"]
     * Salida: ["Pedro", "Luis", "Ana"]
     *
     * @param cola cola original de nombres
     * @return nueva cola con los nombres en orden invertido
     */
    public Queue<String> invertirColaNombres(Queue<String> cola) {
        Queue<String> invertido = new LinkedList<>();
        Stack<String> pilaAux = new Stack<>();

        while (!cola.isEmpty()) {
            pilaAux.push(cola.poll());
        }
        while (!pilaAux.isEmpty()) {
            invertido.add(pilaAux.pop());
        }
        return invertido; // Simulación de resultado
    }

    /**
     * Verifica si la palabra formada por los elementos de una cola es un
     * palíndromo.
     *
     * Se considera que la cola contiene letras individuales como strings.
     * Ejemplo:
     * Entrada: ["r", "a", "d", "a", "r"] → true
     * Entrada: ["c", "a", "s", "a"] → false
     *
     * @param cola Cola de letras en minúsculas
     * @return true si forman un palíndromo, false si no
     */
    public boolean verificarPalindromoCola(Queue<String> cola) {
        Queue<String> invertido = new LinkedList<>();
        Queue<String> copiaCola = new LinkedList<>();
        Stack<String> pilaAux = new Stack<>();


        
        while (!cola.isEmpty()) {
            pilaAux.push(cola.peek());
            copiaCola.add(cola.poll());
        }
        while (!pilaAux.isEmpty()) {
            invertido.add(pilaAux.pop());
        }
        System.out.println(invertido);
        System.out.println(copiaCola);
        while (!invertido.isEmpty()) {
            if (invertido.poll()==copiaCola.poll()) {
                return true;
            }
            else break;
        }
        
        return false;
    }

}
