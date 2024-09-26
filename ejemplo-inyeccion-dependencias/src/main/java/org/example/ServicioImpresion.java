package org.example;

import org.example.dependencias.ServicioEnvio;
import org.example.dependencias.ServicioPDF;

public class ServicioImpresion {

    ServicioEnvio servicioEnvio;
    ServicioPDF servicioPDF;

    public ServicioImpresion(ServicioEnvio servicioEnvio, ServicioPDF servicioPDF) {
        this.servicioEnvio = new ServicioEnvio();
        this.servicioPDF = new ServicioPDF();
    }

    public void imprimir(){
        servicioEnvio.envio();
        servicioPDF.pdf();
    }

}
