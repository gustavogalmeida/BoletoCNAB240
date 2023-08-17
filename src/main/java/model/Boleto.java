package model;

import java.util.Date;

public class Boleto {

    private Empresa empresa;
    private Pagador pagador;
    private String seuNumero;
    private Date dataEmissao; // <= hoje
    private Date dataVencimento; // >= amanhã
    private Date dataLimitePagamento; // > vencimento
    private float valorTotal;
    private float valorAbatimento; // <valorTotal
    private String tipoJuros;
    private float jurosValor;
    private String tipoMulta;
    private float multaValor;
    private String tipoDesconto;
    private float valorDesconto1;
    private Date dataDesconto1;
    private float valorDesconto2;
    private Date dataDesconto2;
    private float valorDesconto3;
    private Date dataDesconto3;

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Pagador getPagador() {
        return pagador;
    }

    public void setPagador(Pagador pagador) {
        this.pagador = pagador;
    }

    public String getSeuNumero() {
        return seuNumero;
    }

    public void setSeuNumero(String seuNumero) {
        this.seuNumero = seuNumero;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Date getDataLimitePagamento() {
        return dataLimitePagamento;
    }

    public void setDataLimitePagamento(Date dataLimitePagamento) {
        this.dataLimitePagamento = dataLimitePagamento;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public float getValorAbatimento() {
        return valorAbatimento;
    }

    public void setValorAbatimento(float valorAbatimento) {
        this.valorAbatimento = valorAbatimento;
    }

    public String getTipoJuros() {
        return tipoJuros;
    }

    public void setTipoJuros(String tipoJuros) {
        this.tipoJuros = tipoJuros;
    }

    public float getJurosValor() {
        return jurosValor;
    }

    public void setJurosValor(float jurosValor) {
        this.jurosValor = jurosValor;
    }

    public String getTipoMulta() {
        return tipoMulta;
    }

    public void setTipoMulta(String tipoMulta) {
        this.tipoMulta = tipoMulta;
    }

    public float getMultaValor() {
        return multaValor;
    }

    public void setMultaValor(float multaValor) {
        this.multaValor = multaValor;
    }

    public String getTipoDesconto() {
        return tipoDesconto;
    }

    public void setTipoDesconto(String tipoDesconto) {
        this.tipoDesconto = tipoDesconto;
    }

    public float getValorDesconto1() {
        return valorDesconto1;
    }

    public void setValorDesconto1(float valorDesconto1) {
        this.valorDesconto1 = valorDesconto1;
    }

    public Date getDataDesconto1() {
        return dataDesconto1;
    }

    public void setDataDesconto1(Date dataDesconto1) {
        this.dataDesconto1 = dataDesconto1;
    }

    public float getValorDesconto2() {
        return valorDesconto2;
    }

    public void setValorDesconto2(float valorDesconto2) {
        this.valorDesconto2 = valorDesconto2;
    }

    public Date getDataDesconto2() {
        return dataDesconto2;
    }

    public void setDataDesconto2(Date dataDesconto2) {
        this.dataDesconto2 = dataDesconto2;
    }

    public float getValorDesconto3() {
        return valorDesconto3;
    }

    public void setValorDesconto3(float valorDesconto3) {
        this.valorDesconto3 = valorDesconto3;
    }

    public Date getDataDesconto3() {
        return dataDesconto3;
    }

    public void setDataDesconto3(Date dataDesconto3) {
        this.dataDesconto3 = dataDesconto3;
    }
}
