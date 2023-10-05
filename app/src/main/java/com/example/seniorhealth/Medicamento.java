package com.example.seniorhealth;

import java.util.Date;
import java.util.UUID;

public class Medicamento {
    private String nome;
    private String dosagem;

    private Date dataInicial;
    private Date horaInicial;
    private String duracaoEmDias;
    private String intervaloEmHoras;


    public Medicamento(String nome, String dosagem) {
        this.nome = nome;
        this.dosagem = dosagem;
    }

    public Medicamento()  {
            }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDosagem() {
        return dosagem;
    }

    public void setDosagem(String dosagem) {
        this.dosagem = dosagem;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getHoraInicial() {
        return horaInicial;
    }

    public void setHoraInicial(Date horaInicial) {
        this.horaInicial = horaInicial;
    }

    public String getDuracaoEmDias() {
        return duracaoEmDias;
    }

    public void setDuracaoEmDias(String duracaoEmDias) {
        this.duracaoEmDias = duracaoEmDias;
    }

    public String getIntervaloEmHoras() {
        return intervaloEmHoras;
    }

    public void setIntervaloEmHoras(String intervaloEmHoras) {
        this.intervaloEmHoras = intervaloEmHoras;
    }


}
