package net.horizondevs.currencyconverter.principal;

import com.google.gson.Gson;
import net.horizondevs.currencyconverter.modelos.Moneda;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {
    public static void main(String[] args) throws IOException, InterruptedException {

        String direccion = "https://v6.exchangerate-api.com/v6/cbfc87b8e0c319e3ce05af0f/pair/USD/MXN";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        // System.out.println(json);

        Gson gson = new Gson();
        Moneda miMoneda = gson.fromJson(json, Moneda.class);
        System.out.println("=> " + miMoneda.getCodigoPais());
        System.out.println("-> " + miMoneda.toString());

    }
}
