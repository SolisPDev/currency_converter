package net.horizondevs.currencyconverter.modelos;

public record ExchangeRate(String result,
                           String base_code,
                           String target_code,
                           Double conversion_rate
                           ) {
}
