package com.posyandu.chrisnaputra.posyandu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.posyandu.chrisnaputra.posyandu.data_anak.DataAnakMdl;
import com.posyandu.chrisnaputra.posyandu.data_anak.KelolaAnakActivity;

public class FiturKader extends AppCompatActivity {

    ImageButton kelolaAnak;
    ImageButton kelolaIbu;
    ImageButton kelolaIbuHamil;
    ImageButton kelolaPenimbanganBalita;
    ImageButton kelolaImunisasi;
    ImageButton kelolaPsg;
    ImageButton kelolaRujukan;
    ImageButton kelolaLaporan;
    ImageButton kelolaKks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fitur_kader);

        kelolaAnak = (ImageButton) findViewById(R.id.kelola_Anak);
        kelolaIbu = (ImageButton) findViewById(R.id.kelola_Ibu);
        kelolaIbuHamil = (ImageButton) findViewById(R.id.kelola_Ibu_Hamil);
        kelolaPenimbanganBalita = (ImageButton) findViewById(R.id.kelola_Timbang_Balita);
        kelolaImunisasi = (ImageButton) findViewById(R.id.kelola_Imunisasi);
        kelolaPsg = (ImageButton) findViewById(R.id.kelola_Psg);
        kelolaRujukan = (ImageButton) findViewById(R.id.kelola_Rujukan);
        kelolaLaporan = (ImageButton) findViewById(R.id.kelola_Laporan);
        kelolaKks = (ImageButton) findViewById(R.id.kelola_Kks);
    }

    public void kelolaAnak(View view) {
        Intent intent = new Intent(this, KelolaAnakActivity.class);
        startActivity(intent);
    }
    public void kelolaIbu(View view) {
        Intent intent = new Intent( this, KelolaIbu.class);
        startActivity(intent);
    }
}
