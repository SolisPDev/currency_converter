package net.horizondevs.currencyconverter.principal;

import net.horizondevs.currencyconverter.calculos.CalculaConversion;
import java.io.IOException;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) throws IOException, InterruptedException {
        String usuario;
        Scanner datoLeido = new Scanner(System.in);
        Double cantidad = 0.0;
        var conversion = new CalculaConversion();

        System.out.println("Bienvenido al conversor de monedas");
        System.out.println("Ingresa tu numbre: ");
        usuario = datoLeido.nextLine();
        System.out.println("Saludos " + usuario);
        var opcion = 0;

        while (opcion != 8) {
            System.out.println("===================================");
            System.out.println("== Menu de Conversion de Monedas ==");
            System.out.println("  1] Dolar >> Peso Mexicano ");
            System.out.println("  2] Peso Mexicano >> Dolar ");
            System.out.println("  3] Peso Mexicano >> Real Brasileño ");
            System.out.println("  4] Real Brasileño >> Peso Mexicano ");
            System.out.println("  5] Peso Mexicano >> Peso Colombiano ");
            System.out.println("  6] Peso Colombiano >> Peso Mexicano ");
            //System.out.println("  7] Otras monedas");
            System.out.println("");
            System.out.println("  8] Terminar ");
            System.out.println("===================================");
            opcion = Integer.parseInt(datoLeido.nextLine());

            if (opcion < 8) {
                System.out.println("Cantidad a convertir: ");
                cantidad = Double.valueOf(datoLeido.nextLine());
            }

            switch (opcion){
                case 1:
                    System.out.println(conversion.resultado("USD", "MXN", cantidad));
                    break;
                case 2:
                    System.out.println(conversion.resultado("MXN", "USD", cantidad));
                    break;
                case 3:
                    System.out.println(conversion.resultado("MXN", "BRL", cantidad));
                    break;
                case 4:
                    System.out.println(conversion.resultado("BRL", "MXN", cantidad));
                    break;
                case 5:
                    System.out.println(conversion.resultado("MXN", "COP", cantidad));
                    break;
                case 6:
                    System.out.println(conversion.resultado("COP", "MXN", cantidad));
                    break;
            }
        }
    }
}
