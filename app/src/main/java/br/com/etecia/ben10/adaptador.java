package br.com.etecia.ben10;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class adaptador extends RecyclerView.Adapter<adaptador.ViewHolder> {
    private Context context;
    private List<alien> lstAlien;

    public adaptador(Context context, List<alien> lstAlien) {
        this.context = context;
        this.lstAlien = lstAlien;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;

        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.modelo_alien, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.modeloTitulo.setText(lstAlien.get(position).getNome());
        holder.modeloImagem.setImageResource(lstAlien.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return lstAlien.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView modeloTitulo;
        ImageView modeloImagem;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            modeloTitulo = itemView.findViewById(R.id.idTituloModeloAlien);
            modeloImagem = itemView.findViewById(R.id.idFotoModeloAlien);
        }
    }

}
