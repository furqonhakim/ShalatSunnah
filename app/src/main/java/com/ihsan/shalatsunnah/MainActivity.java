package com.ihsan.shalatsunnah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView tahajjud,witir,rawatib,duha,istikoroh,tahiyatullmasjid,syurq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tahajjud = findViewById(R.id.tahajjud);
        witir = findViewById(R.id.witir);
        rawatib = findViewById(R.id.rawatib);
        duha = findViewById(R.id.duha);
        istikoroh = findViewById(R.id.istikoroh);
        tahiyatullmasjid = findViewById(R.id.tahiyatullmasjid);
        syurq = findViewById(R.id.shalat_Suruk);

        tahajjud.setOnClickListener(this);
        witir.setOnClickListener(this);
        rawatib.setOnClickListener(this);
        duha.setOnClickListener(this);
        istikoroh.setOnClickListener(this);
        tahiyatullmasjid.setOnClickListener(this);
        syurq.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tahajjud:
                Intent tahaju = new Intent(MainActivity.this, deskripsi.class);
                tahaju.putExtra("sunnah", "https://wistanabawi.com/shalat-tahajud");
                startActivity(tahaju);
                break;




            case R.id.witir:
                Intent witi = new Intent(MainActivity.this, deskripsi.class);
                witi.putExtra("sunnah", "https://bersamadakwah.net/shalat-witir");
                startActivity(witi);
                break;




            case R.id.rawatib:
                Intent rawa = new Intent(MainActivity.this, deskripsi.class);
                rawa.putExtra("sunnah", "https://muslim.or.id./4602-tuntunan-shalat-sunnah-rawatib.html");
                startActivity(rawa);
                break;





            case R.id.duha:
                Intent du = new Intent(MainActivity.this, deskripsi.class);
                du.putExtra("sunnah", "https://muslim.or.id/44198-fikih-shlat-dhuha.html");
                startActivity(du);
                break;




            case R.id.istikoroh:
                Intent istiko = new Intent(MainActivity.this, deskripsi.class);
                istiko.putExtra("sunnah", "https://www..dream.co.id/orbit/tata-cara-shalat-istikharah-1811128.html");
                startActivity(istiko);
                break;






            case R.id.tahiyatullmasjid:
                Intent tahiya = new Intent(MainActivity.this, deskripsi.class);
                tahiya.putExtra("sunnah", "https://muslim.or.id/18829-shalat-tahiyatul-masjid.html");
                startActivity(tahiya);
                break;






            case R.id.shalat_Suruk:
                Intent syur = new Intent(MainActivity.this, deskripsi.class);
                syur.putExtra("sunnah", "https://aitarus.com/sholat-syuruq-isyraq/");
                startActivity(syur);
                break;






        }
    }
}
