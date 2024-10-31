package net.horizondevs.currencyconverter.calculos;

import net.horizondevs.currencyconverter.modelos.ExchangeRate;
import net.horizondevs.currencyconverter.procesos.Exchange;

public class CalculaConversion {
    public String resultado(String monedaBase, String monedaDestino, Double cantidad){
        Exchange datos = new Exchange();
        String cadenaDeRespuesta = "";

        try {
            ExchangeRate valores = datos.consultaExchange(monedaBase, monedaDestino);
            // System.out.println(valores.conversion_rate());
            cadenaDeRespuesta = ">> " 
                    + String.valueOf(cantidad) 
                    + " [USD] Equivalen a " 
                    + String.valueOf(cantidad * valores.conversion_rate()) 
                    + " [MXN]";
            

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("Termina el programa.");
        }
        return cadenaDeRespuesta;
    }
}
