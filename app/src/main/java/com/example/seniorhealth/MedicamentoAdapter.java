package com.example.seniorhealth;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

public class MedicamentoAdapter extends ArrayAdapter<Medicamento> {

    private Context context;
    private List<Medicamento> listaMedicamentos;

    public MedicamentoAdapter(Context context, List<Medicamento> listaMedicamentos) {
        super(context, 0, listaMedicamentos);
        this.context = context;
        this.listaMedicamentos = listaMedicamentos;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_medicamento, parent, false);
        }

        Medicamento medicamento = getItem(position);

        TextView textViewNome = convertView.findViewById(R.id.textViewNome);
        TextView textViewDosagem = convertView.findViewById(R.id.textViewDosagem);

        // Configure os textViews com os dados do medicamento
        textViewNome.setText(medicamento.getNome());
        textViewDosagem.setText(medicamento.getDosagem());

        return convertView;
    }
}
