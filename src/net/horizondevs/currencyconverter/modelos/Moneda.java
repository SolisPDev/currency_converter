package net.horizondevs.currencyconverter.modelos;

import com.google.gson.annotations.SerializedName;

public class Moneda {
    @SerializedName("result")
    private String resultado;
    @SerializedName("base_code")
    private String codigoPais;
    @SerializedName("target_code")
    private String codigoPaisDestino;
    @SerializedName("conversion_rate")
    private Double factorEquivalencia;

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(String codigoPais) {
        this.codigoPais = codigoPais;
    }

    public String getCodigoPaisDestino() {
        return codigoPaisDestino;
    }

    public void setCodigoPaisDestino(String codigoPaisDestino) {
        this.codigoPaisDestino = codigoPaisDestino;
    }

    public Double getFactorEquivalencia() {
        return factorEquivalencia;
    }

    public void setFactorEquivalencia(Double factorEquivalencia) {
        this.factorEquivalencia = factorEquivalencia;
    }

    @Override
    public String toString() {
        return
                this.resultado + " / " +
                this.codigoPais + " / " +
                this.codigoPaisDestino + " / " +
                this.factorEquivalencia;
    }
}
