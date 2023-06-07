package com.example.ifelse_rangga;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    EditText nilaiakhir;
    Button btnhasil;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nilaiakhir = (EditText) findViewById(R.id.editTextnilaihasilakhir);
        btnhasil = (Button) findViewById(R.id.buttonhasil);
        hasil = (TextView) findViewById(R.id.textViewhasil);

        btnhasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int angka1 = 0;
                String angka = nilaiakhir.getText().toString();
                angka1 = Integer.parseInt(angka);

                if ((angka1 >= 80) && (angka1<=100)){
                    hasil.setText("Nilai Anda A");
                }
                else if ((angka1 >= 70) && (angka1<=85)){
                    hasil.setText("Nilai B");
                }
                else if ((angka1 >= 60) && (angka1<=69)){
                    hasil.setText("Nilai C");
                }
                else if ((angka1 >= 50) && (angka1<=59)){
                    hasil.setText("Nilai D");
                }
                else{
                    hasil.setText("Nilai Anda E, Silahkan Belajar Lebih Tekun Lagi");
                }

            }
        });
    }
}