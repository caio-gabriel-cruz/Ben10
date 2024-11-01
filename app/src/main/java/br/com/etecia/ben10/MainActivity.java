package br.com.etecia.ben10;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<alien> lstAlien;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        lstAlien = new ArrayList<>();
        lstAlien.add(new alien("Aquático", R.drawable.aquatico));
        lstAlien.add(new alien("Bala de Canhão", R.drawable.bala));
        lstAlien.add(new alien("Besta", R.drawable.besta));
        lstAlien.add(new alien("4 Braços", R.drawable.bracinho));
        lstAlien.add(new alien("Chama", R.drawable.chama));
        lstAlien.add(new alien("Diamante", R.drawable.dima));
        lstAlien.add(new alien("Eco-Eco Supremo", R.drawable.eco));
        lstAlien.add(new alien("Enormossauro", R.drawable.enormo));
        lstAlien.add(new alien("Fantasmático", R.drawable.fantasmatico));
        lstAlien.add(new alien("Feedback", R.drawable.feedback));
        lstAlien.add(new alien("Friagem", R.drawable.friagem));
        lstAlien.add(new alien("Gigante", R.drawable.gigante));
        lstAlien.add(new alien("XLR8", R.drawable.gisele));
        lstAlien.add(new alien("Insectóide", R.drawable.inse));
        lstAlien.add(new alien("Massa Cinzenta", R.drawable.massa));
        lstAlien.add(new alien("Ultra T", R.drawable.ultra));


        recyclerView = findViewById(R.id.idRecAlien);

        adaptador adaptador = new adaptador(getApplicationContext(), lstAlien);

        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
        recyclerView.hasFixedSize();
        recyclerView.setAdapter(adaptador);

    }
}