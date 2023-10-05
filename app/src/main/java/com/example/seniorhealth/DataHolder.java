package com.example.seniorhealth;

import java.util.ArrayList;
import java.util.List;

public class DataHolder {
    private static List<Medicamento> listaMedicamentos = new ArrayList<>();

    public static List<Medicamento> getListaMedicamentos() {
        Medicamento med = new Medicamento();
        med.setNome("KAKAKSKASa");
        listaMedicamentos.add(med);
        return listaMedicamentos;
    }

    public static void insere(Medicamento med){
        listaMedicamentos.add(med);
    }


    public static void adicionarMedicamento(Medicamento medicamento) {
        listaMedicamentos.add(medicamento);
    }
}
