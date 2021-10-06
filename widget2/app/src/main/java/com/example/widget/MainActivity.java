package com.example.widget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormatSymbols;

public class MainActivity extends AppCompatActivity {

    ListView listViewMonth; //tipe data ListView dan variabel ListViewMonth
    String[] months;

    //membuat String dari kabupaten yang berisi nama-nama kota
    private static final String[] kabupaten = new String[]{
            "Jember", "Banyuwangi", "Jombang", "Lumajang",
            "Bandung", "Bekasi", "Bogor", "Purwakarta",
            "Banyumas", "Cilacap", "Wonosobo", "Kebumen",
            "Samarinda", "Balikpapan", "Berau", "Paser",
            "Asahan", "Serdang Bedagai", "Pakpak Bharat", "Langkat",
            "Badung", "Bangli", "Buleleng", "Gianyar"
    };

    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Provinsi, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String Provinsi = parent.getItemAtPosition(position).toString();
                Toast.makeText(parent.getContext(),"Choose: "+ Provinsi , Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        listViewMonth = findViewById(R.id.lvmonth);
        months = new DateFormatSymbols().getMonths();
        ArrayAdapter<String> monthAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, months);
        listViewMonth.setAdapter(monthAdapter);
        listViewMonth.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String month = ((TextView) view).getText().toString();
                Toast.makeText(getApplicationContext(), "Clicked"+month, Toast.LENGTH_SHORT).show();
            }
        });

        AutoCompleteTextView editText =findViewById(R.id.actv);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, kabupaten);
        editText.setAdapter(adapter1);
    }
}