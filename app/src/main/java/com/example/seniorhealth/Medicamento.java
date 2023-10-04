package com.example.seniorhealth;

public class Medicamento {
    private String nome;
    private String dosagem;

    public Medicamento(String nome, String dosagem) {
        this.nome = nome;
        this.dosagem = dosagem;
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
}
