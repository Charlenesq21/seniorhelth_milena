package com.example.seniorhealth;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.List;

public class ListarMedicamentosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_medicamentos);

        ListView listView = findViewById(R.id.listView);
        List<Medicamento> listaMedicamentos = DataHolder.getListaMedicamentos();

        // Crie um adaptador personalizado para exibir os detalhes de medicamentos
        MedicamentoAdapter adaptador = new MedicamentoAdapter(this, listaMedicamentos);

        // Configure o adaptador no ListView
        listView.setAdapter(adaptador);
    }
}
