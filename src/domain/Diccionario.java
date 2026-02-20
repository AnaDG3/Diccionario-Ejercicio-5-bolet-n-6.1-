package domain;

import java.util.*;

public class Diccionario {
    Map<String, List<String>> diccionario = new HashMap<>();

    public Diccionario() {
        diccionario = new HashMap<>();
    }

    public void addPalabra(String palabra, String significado) {
        if (diccionario.containsKey(palabra)) {
            diccionario.get(palabra).add(significado);
        } else {
            List<String> palabras = new ArrayList<>();
            palabras.add(significado);
            diccionario.put(palabra, palabras);
        }
    }

    public List<String> buscarPalabra(String palabra) {
        return diccionario.get(palabra);
    }

    public void borrarPalabra(String palabra) {
        diccionario.remove(palabra);
    }

    public List<String> listadoPalabras(String empiezaPor) {
        List<String> palabras = new LinkedList<>();
        for (String palabra: diccionario.keySet()) {
            if (palabra.startsWith(empiezaPor)) {
                palabras.add(palabra);
            }
        }
        palabras.sort(null);
        return palabras;
    }
}

