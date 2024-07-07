/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projeto.iphone.iphone2007;
import java.util.List;

public class iPhone {
    private Telefone telefone;
    private SMS sms;
    private Email email;
    private Safari safari;
    private iPod ipod;
    private FotosECamera fotosECamera;
    private Calendario calendario;
    private Contatos contatos;
    private Calculadora calculadora;
    private Relogio relogio;
    private Configuracoes configuracoes;
    private Notas notas;
    private Mapas mapas;
    private Weather weather;
    private Stocks stocks;
    private List<Widget> widgets;

    // Métodos e construtores aqui

    public iPhone(Telefone telefone, SMS sms, Email email, Safari safari, iPod ipod, FotosECamera fotosECamera, Calendario calendario, Contatos contatos, Calculadora calculadora, Relogio relogio, Configuracoes configuracoes, Notas notas, Mapas mapas, Weather weather, Stocks stocks, List<Widget> widgets) {
        this.telefone = telefone;
        this.sms = sms;
        this.email = email;
        this.safari = safari;
        this.ipod = ipod;
        this.fotosECamera = fotosECamera;
        this.calendario = calendario;
        this.contatos = contatos;
        this.calculadora = calculadora;
        this.relogio = relogio;
        this.configuracoes = configuracoes;
        this.notas = notas;
        this.mapas = mapas;
        this.weather = weather;
        this.stocks = stocks;
        this.widgets = widgets;
    }
}
