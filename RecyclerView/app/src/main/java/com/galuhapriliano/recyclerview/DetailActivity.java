package com.galuhapriliano.recyclerview;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    //Deklarasi object
    ImageView img;
    TextView Nama, Harga, Deskripsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Memberikan nilai dengan memanggil ID setiap object
        img = findViewById(R.id.img);
        Nama = findViewById(R.id.Nama);
        Harga = findViewById(R.id.Harga);
        Deskripsi = findViewById(R.id.Deskripsi);

        //Menjalankan pegambilan data
        getIncomingExtra();
    }
    //Method untuk mengambil data yang dikirimkan
    private void getIncomingExtra() {
        //Pengecekan apakah memiliki Extra
        if(getIntent().hasExtra("gambar_makanan") && getIntent().hasExtra("nama_makanan")
                && getIntent().hasExtra("harga_makanan") & getIntent().hasExtra("deskripsi_makanan")){

            //Membuat variable untuk mengambil nilai string
            String gambarmakanan = getIntent().getStringExtra("gambar_makanan");
            String namamakanan = getIntent().getStringExtra("nama_makanan");
            String hargamakanan = getIntent().getStringExtra("harga_makanan");
            String deskripsimakanan = getIntent().getStringExtra("deskripsi_makanan");

            //Menjalankan
            setDataActivity(gambarmakanan, namamakanan, hargamakanan, deskripsimakanan);
        }
    }
    //Method untuk mengirimkan data
    private void setDataActivity(
            String gambarmakanan, String namamakanan, String hargamakanan,String deskripsimakanan){

        //Memasukkan data ke dalam objek sesuai dengan tempatnya
        Glide.with(this).asBitmap().load(gambarmakanan).into(img);
        Nama.setText(namamakanan);
        Harga.setText(hargamakanan);
        Deskripsi.setText(deskripsimakanan);

    }
}