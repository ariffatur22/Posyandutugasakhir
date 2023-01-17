package com.posyandu.chrisnaputra.posyandu.login;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.posyandu.chrisnaputra.posyandu.berandabidan.BerandaBidan;
import com.posyandu.chrisnaputra.posyandu.R;
import com.posyandu.chrisnaputra.posyandu.api.ApiService;
import com.posyandu.chrisnaputra.posyandu.api.ApiHelper;
import com.posyandu.chrisnaputra.posyandu.berandakader.BerandaKader;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {

    private static final String LOG = "LOGIN";
    String jsonString = "";
    private ProgressDialog progressDialog;
    private EditText username;
    private EditText password;
    private Button login;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beranda);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.login);
        progressBar = (ProgressBar) findViewById(R.id.progressbar);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = username.getText().toString().trim();
                String pass = password.getText().toString().trim();

                if (user.isEmpty() || pass.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Username atau Password belum di isi", Toast.LENGTH_SHORT).show();
                } else {
                    login(user, pass);
                }
            }
        });
    }

    private void login(String user, String pass) {
        progressBar.setVisibility(View.VISIBLE);

        ApiService apiService = ApiHelper.Companion.initService();
        Call<DataLogin> call = apiService.login(user, pass);
        call.enqueue(new Callback<DataLogin>() {
            @Override
            public void onResponse(Call<DataLogin> call, Response<DataLogin> response) {
                progressBar.setVisibility(View.GONE);

                DataLogin data = response.body();
                if (data.getStatus().equalsIgnoreCase("success")) {
                    DataLogin.DataBean biodata = data.getData();
                    Toast.makeText(LoginActivity.this,  data.getPesan(), Toast.LENGTH_SHORT).show();

                    LoginObj.loginObj = biodata;
                    switch (biodata.getPeran()){
                        case "kader" :
                            Intent intent = new Intent(getApplicationContext(), BerandaKader.class);
                            startActivity(intent);
                            break;
                        case "bidan" :
                            Intent intent1 = new Intent(getApplicationContext(), BerandaBidan.class);
                            startActivity(intent1);
                            break;

                    }

                } else {
                    Toast.makeText(LoginActivity.this,  data.getPesan(), Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onFailure(Call<DataLogin> call, Throwable t) {
                progressBar.setVisibility(View.GONE);
                t.printStackTrace();
                Toast.makeText(LoginActivity.this, "LoginActivity gagal!", Toast.LENGTH_SHORT).show();

            }
        });
    }

}
