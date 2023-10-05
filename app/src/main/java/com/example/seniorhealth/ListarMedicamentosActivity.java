package com.example.seniorhealth;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.List;

public class ListarMedicamentosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_medicamentos);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        ListView listView = findViewById(R.id.listView);
        List<Medicamento> listaMedicamentos = DataHolder.getListaMedicamentos();

        // Crie um adaptador personalizado para exibir os detalhes de medicamentos
        MedicamentoAdapter adaptador = new MedicamentoAdapter(this, listaMedicamentos);

        // Configure o adaptador no ListView
        listView.setAdapter(adaptador);
    }
}
