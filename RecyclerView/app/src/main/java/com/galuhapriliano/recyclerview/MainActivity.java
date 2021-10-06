package com.galuhapriliano.recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> gambarmakanan = new ArrayList<>();
    private ArrayList<String> namamakanan = new ArrayList<>();
    private ArrayList<String> hargamakanan = new ArrayList<>();
    private ArrayList<String> deskripsimakanan = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromInternet(); //Menjalankan method
    }
    //Method untuk memproses RecyclerView
    protected  void prosesRecyclerViewAdapter(){

        RecyclerView recyclerView = findViewById(R.id.menumakanan); //Deklarasi object yang akan digunakan
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(gambarmakanan, namamakanan, hargamakanan, deskripsimakanan,this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getDataFromInternet(){
        //Burger
        namamakanan.add("Burger");
        hargamakanan.add("Rp10.000");
        gambarmakanan.add("https://cdns.klimg.com/merdeka.com/i/w/news/2021/04/28/1301485/670x335/8-makanan-siap-saji-yang-terkenal-di-indonesia-kenali-bahayanya.jpg");
        deskripsimakanan.add("Hamburger adalah sejenis makanan berupa roti berbentuk bundar yang diiris dua dan di tengahnya diisi dengan patty yang biasanya diambil dari daging, kemudian sayur-sayuran berupa selada, tomat dan bawang bombai. Sebagai sausnya, burger diberi berbagai jenis saus seperti mayones, saus tomat dan sambal serta mustard.");

        //Kentang Goreng
        namamakanan.add("Kentang Goreng");
        hargamakanan.add("Rp5.000");
        gambarmakanan.add("https://cdns.klimg.com/merdeka.com/i/w/news/2021/04/28/1301485/content_images/670x335/20210428084400-1-8-cara-membuat-kentang-goreng-ala-rumahan-009-fatimah-rahmawati.jpg");
        deskripsimakanan.add("Kentang goreng adalah hidangan yang dibuat dari potongan-potongan kentang yang digoreng dalam minyak goreng panas. Di dalam menu rumah-rumah makan, kentang goreng yang dipotong panjang-panjang dan digoreng dalam keadaan terendam di dalam minyak goreng panas disebut French fries.");

        //Es Krim
        namamakanan.add("Es Krim");
        hargamakanan.add("Rp8.000");
        gambarmakanan.add("https://cdns.klimg.com/merdeka.com/i/w/news/2021/04/28/1301485/content_images/670x335/20210428084401-1-ilustrasi-es-krim-014-tantri-setyorini.jpg");
        deskripsimakanan.add("Es krim adalah sebuah makanan beku dibuat dari produk susu seperti krim, digabungkan dengan perasa dan pemanis buatan ataupun alami. Campuran ini didinginkan dengan mengaduk sambil mengurangi suhunya untuk mencegah pembentukan kristal es besar.");

        //Donat
        namamakanan.add("Donat");
        hargamakanan.add("Rp15.000");
        gambarmakanan.add("https://cdns.klimg.com/merdeka.com/i/w/news/2021/04/28/1301485/content_images/670x335/20210428084402-1-ilustrasi-donat-015-tantri-setyorini.jpg");
        deskripsimakanan.add("Donat adalah penganan yang digoreng, dibuat dari adonan tepung terigu, gula, telur, dan mentega. Donat yang paling umum adalah donat berbentuk cincin dengan lubang di tengah dan donat berbentuk bundar dengan isian manis, seperti selai, jelly, krim, dan custard.");

        //Pizza
        namamakanan.add("Pizza");
        hargamakanan.add("Rp25.000");
        gambarmakanan.add("https://cdns.klimg.com/merdeka.com/i/w/news/2021/04/28/1301485/content_images/670x335/20210428084404-1-ilustrasi-pizza-012-tantri-setyorini.jpg");
        deskripsimakanan.add("Piza adalah hidangan gurih dari Italia sejenis adonan bundar dan pipih, yang dipanggang di oven dan biasanya dilumuri saus tomat serta keju dengan bahan makanan tambahan lainnya yang bisa dipilih. Keju yang dipakai biasanya mozzarella atau \"keju pizza\", bisa juga keju parmesan dan beberapa keju lainnya.");

        //Nugget Ikan
        namamakanan.add("Nugget Ikan");
        hargamakanan.add("Rp20.000");
        gambarmakanan.add("https://cdns.klimg.com/merdeka.com/i/w/news/2021/04/28/1301485/content_images/670x335/20210428084406-1-10-resep-nugget-ikan-gurih-dan-lezat-cocok-untuk-lauk-pendamping-makanan-003-ayu-isti.jpg");
        deskripsimakanan.add("Nugget ikan adalah olahan daging ikan yang dicampur dengan sedikit tepung dan telur sebagai bahan dasar. Jenis olahan ini dapat dinikmati dalam jangka panjang karena penyimpanan sebelum dikonsumsi dalam suasana beku.");

        //Hot Dog
        namamakanan.add("Hot Dog");
        hargamakanan.add("Rp15.000");
        gambarmakanan.add("https://cdns.klimg.com/merdeka.com/i/w/news/2021/04/28/1301485/content_images/670x335/20210428084407-1-hot-dog-003-kun-sila-ananda.jpg");
        deskripsimakanan.add("Hot dog adalah suatu jenis sosis yang dimasak atau diasapi dan memiliki tekstur yang lebih halus serta rasa yang lebih lembut dan basah daripada kebanyakan sosis.");

        //Cheesesteak
        namamakanan.add("Cheesesteak");
        hargamakanan.add("Rp17.500");
        gambarmakanan.add("https://cdns.klimg.com/merdeka.com/i/w/news/2021/04/28/1301485/content_images/670x335/20210428084408-1-olahan-keju-001-novi-fuji.jpg");
        deskripsimakanan.add("Cheesesteak, juga dikenal dengan nama antara lain Philadelphia cheesesteak, Philly cheesesteak, cheesesteak sandwich, cheese steak, atau steak and cheese adalah sandwich atau roti lapis yang terbuat dari irisan tipis bistik sapi dan keju yang meleleh dalam gulungan roti hoagie yang panjang.");

        prosesRecyclerViewAdapter();
    }
}