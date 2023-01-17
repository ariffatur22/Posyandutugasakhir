package com.posyandu.chrisnaputra.posyandu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;

public class KelolaIbu extends AppCompatActivity {

    Button tambahIbu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kelola_ibu);

        tambahIbu = (Button) findViewById(R.id.tambah_Ibu);
    }

    public void tambahIbu(View view) {
        Intent intent = new Intent(this, TambahIbu.class);
        startActivity(intent);
    }
}
