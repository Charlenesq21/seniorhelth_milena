package com.example.seniorhealth;

import java.util.ArrayList;
import java.util.List;

public class DataHolder {
    private static List<Medicamento> listaMedicamentos = new ArrayList<>();

    public static List<Medicamento> getListaMedicamentos() {
        return listaMedicamentos;
    }

    public static void adicionarMedicamento(Medicamento medicamento) {
        listaMedicamentos.add(medicamento);
    }
}
