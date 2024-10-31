package net.horizondevs.currencyconverter.procesos;

import com.google.gson.Gson;
import net.horizondevs.currencyconverter.modelos.ExchangeRate;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Exchange {
    public ExchangeRate consultaExchange(String codigoPaisBase, String codigoPaisRespuesta){
        String direccion = "https://v6.exchangerate-api.com/v6/cbfc87b8e0c319e3ce05af0f/pair/"
                + codigoPaisBase + "/"
                + codigoPaisRespuesta;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), ExchangeRate.class);

        } catch (Exception e) {
            throw new RuntimeException("No se encontro el Pais correspondiente al codigo enviado.");
        }
    }
}
