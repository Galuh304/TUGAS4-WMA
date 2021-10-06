package com.galuhapriliano.recyclerview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.viewHolder>{

    //Menambahkan properti ArrayList
    private ArrayList<String> gambarmakanan = new ArrayList<>();
    private ArrayList<String> namamakanan = new ArrayList<>();
    private ArrayList<String> hargamakanan = new ArrayList<>();
    private ArrayList<String> deskripsimakanan = new ArrayList<>();
    private Context context;
    //Menambahkan adapter
    public RecyclerViewAdapter(ArrayList<String> gambarmakanan, ArrayList<String> namamakanan, ArrayList<String> hargamakanan, ArrayList<String> deskripsimakanan, Context context) {
        this.gambarmakanan = gambarmakanan;
        this.namamakanan = namamakanan;
        this.hargamakanan = hargamakanan;
        this.deskripsimakanan = deskripsimakanan;
        this.context = context;
    }

    //Layout
    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        viewHolder holder = new viewHolder(view);
        return holder;
    }

    //Mengambil data dari setiap item
    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, @SuppressLint("RecyclerView") int position) {
        Glide.with(context).asBitmap().load(gambarmakanan.get(position)).into(holder.gambar);
        holder.nama.setText(namamakanan.get(position));
        holder.harga.setText(hargamakanan.get(position));

        //Menambahkan event klik
        holder.linearlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Berpindah ke DetailActivity
                Intent intent = new Intent(context, DetailActivity.class);

                //Menyimpan data di dalam memori terlehi dahulu kemudian diterima oleh DetailActtivity
                intent.putExtra("gambar_makanan", gambarmakanan.get(position));
                intent.putExtra("nama_makanan", namamakanan.get(position));
                intent.putExtra("harga_makanan", hargamakanan.get(position));
                intent.putExtra("deskripsi_makanan", deskripsimakanan.get(position));

                //mengirimkan data
                context.startActivity(intent);
            }
        });
    }

    //Menentukan urutan item
    @Override
    public int getItemCount() {
        return namamakanan.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{

        //Menambahkan property
        ImageView gambar;
        TextView nama, harga;
        LinearLayout linearlayout;

        //Membuat constructor class viewHolder
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            gambar = itemView.findViewById(R.id.img);
            nama = itemView.findViewById(R.id.Nama);
            harga = itemView.findViewById(R.id.Harga);
            linearlayout = itemView.findViewById(R.id.linearLayout);
        }
    }
}
