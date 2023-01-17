package com.posyandu.chrisnaputra.posyandu.berandabidan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.posyandu.chrisnaputra.posyandu.FiturBidan;
import com.posyandu.chrisnaputra.posyandu.R;
import com.posyandu.chrisnaputra.posyandu.UbahBidan;
import com.posyandu.chrisnaputra.posyandu.login.LoginObj;

public class BerandaBidan extends AppCompatActivity {

    Button ubahBidan;
    Button pilihFitur;
    private TextView nama;
    private TextView username;
    private TextView no_tlp;
    private TextView alamat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beranda_bidan);

        nama = (TextView) findViewById(R.id.nama);
        username = (TextView) findViewById(R.id.username);
        no_tlp = (TextView) findViewById(R.id.no_tlp);
        alamat = (TextView) findViewById(R.id.alamat);
        ubahBidan = (Button) findViewById(R.id.ubah);
        pilihFitur = (Button) findViewById(R.id.pilih_fitur);
        loadData();
    }

    private void loadData() {
        nama.setText(LoginObj.loginObj.getNama());
        username.setText(LoginObj.loginObj.getUsername());
        no_tlp.setText(LoginObj.loginObj.getNo_telp());
        alamat.setText(LoginObj.loginObj.getAlamat());
    }


    public void ubahBidan(View view) {
        Intent intent = new Intent(this, UbahBidan.class);
        startActivity(intent);
    }

    public void pilihFitur(View view) {
        Intent intent = new Intent(this, FiturBidan.class);
        startActivity(intent);
    }
}