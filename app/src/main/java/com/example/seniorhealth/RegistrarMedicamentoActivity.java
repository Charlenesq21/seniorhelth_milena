package com.example.seniorhealth;

/*
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class RegistrarMedicamentoActivity extends AppCompatActivity {

    private EditText etNomeMedicamento;
    private EditText etDosagem;
    private Button btnSalvarMedicamento;

    private List<Medicamento> listaMedicamentos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_medicamento);

        etNomeMedicamento = findViewById(R.id.etNomeMedicamento);
        etDosagem = findViewById(R.id.etDosagem);
        btnSalvarMedicamento = findViewById(R.id.btnSalvarMedicamento);

        // Dentro do OnClickListener do botão de salvar
        btnSalvarMedicamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtenha os dados do formulário
                String nome = etNomeMedicamento.getText().toString();
                String dosagem = etDosagem.getText().toString();

                // Crie um objeto Medicamento com os dados
                Medicamento medicamento = new Medicamento(nome, dosagem);

                // Adicione o medicamento à lista compartilhada
                DataHolder.adicionarMedicamento(medicamento);

                // Limpe os campos do formulário
                etNomeMedicamento.setText("");
                etDosagem.setText("");

                // Navegue para a atividade de listagem de medicamentos
                Intent intent = new Intent(RegistrarMedicamentoActivity.this, ListarMedicamentosActivity.class);
                startActivity(intent);
            }
        });
    }
}
*/
