package com.posyandu.chrisnaputra.posyandu.berandakader;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.posyandu.chrisnaputra.posyandu.FiturKader;
import com.posyandu.chrisnaputra.posyandu.R;
import com.posyandu.chrisnaputra.posyandu.UbahKader;
import com.posyandu.chrisnaputra.posyandu.login.DataLogin;
import com.posyandu.chrisnaputra.posyandu.login.LoginObj;

public class BerandaKader extends AppCompatActivity {

    private TextView nama;
    private TextView username;
    private TextView no_tlp;
    private TextView alamat;
    Button ubahKader;
    Button pilihFitur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beranda_kader);

        nama = (TextView) findViewById(R.id.nama);
        username = (TextView) findViewById(R.id.username);
        no_tlp = (TextView) findViewById(R.id.no_tlp);
        alamat = (TextView) findViewById(R.id.alamat);
        ubahKader = (Button) findViewById(R.id.ubah);
        pilihFitur = (Button) findViewById(R.id.pilih_fitur);
        loadData();
    }

    private void loadData() {
        nama.setText(LoginObj.loginObj.getNama());
        username.setText(LoginObj.loginObj.getUsername());
        no_tlp.setText(LoginObj.loginObj.getNo_telp());
        alamat.setText(LoginObj.loginObj.getAlamat());
    }


    public void ubahKader(View view) {
        Intent uk = new Intent(this, UbahKader.class);
        startActivity(uk);
    }
    public void pilihFitur(View view) {
        Intent pk = new Intent(this, FiturKader.class);
        startActivity(pk);
    }
}
