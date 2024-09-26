package org.example;

import org.example.dependencias.ServicioEnvio;
import org.example.dependencias.ServicioPDF;

public class Main {
    public static void main(String[] args) {
        ServicioImpresion servicioImpresion = new ServicioImpresion(new ServicioEnvio(),new ServicioPDF());
        servicioImpresion.imprimir();
    }
}