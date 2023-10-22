package com.example.convertidor_de_grados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import com.example.convertidor_de_grados.Models.Celsius;
import com.example.convertidor_de_grados.Models.Kelvin;
import com.example.convertidor_de_grados.Models.Fahrenheit;
import com.example.convertidor_de_grados.Models.Grados;
import com.example.convertidor_de_grados.R;

import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    Button uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, cero, punto, menos, borraruno, borrartodo, igual;
    boolean menostur = true;
    boolean puntotur = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView contenedor = findViewById(R.id.cantidad_convertir);
        TextView contenedorres = findViewById(R.id.cantidad_convertida);
        Spinner spinner = (Spinner) findViewById(R.id.gradosde);
        Spinner spinner2 = (Spinner) findViewById(R.id.gradosa);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.todoslosgrados, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);
        spinner2.setAdapter(adapter);


        uno = findViewById(R.id.uno);

        uno.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String existingText = contenedor.getText().toString();
                int largo = existingText.length();
                if (largo > 0 && !existingText.equals("0")) {
                    contenedor.setText(existingText + "1");
                } else {
                    contenedor.setText("1");
                }
            }
        });
        dos = findViewById(R.id.dos);

        dos.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String existingText = contenedor.getText().toString();
                int largo = existingText.length();
                if (largo > 0 && !existingText.equals("0")) {
                    contenedor.setText(existingText + "2");
                } else {
                    contenedor.setText("2");
                }
            }
        });

        tres = findViewById(R.id.tres);

        tres.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String existingText = contenedor.getText().toString();
                int largo = existingText.length();
                if (largo > 0 && !existingText.equals("0")) {
                    contenedor.setText(existingText + "3");
                } else {
                    contenedor.setText("3");
                }
            }
        });
        cuatro = findViewById(R.id.cuatro);

        cuatro.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String existingText = contenedor.getText().toString();
                int largo = existingText.length();
                if (largo > 0 && !existingText.equals("0")) {
                    contenedor.setText(existingText + "4");
                } else {
                    contenedor.setText("4");
                }
            }
        });
        cinco = findViewById(R.id.cinco);

        cinco.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String existingText = contenedor.getText().toString();
                int largo = existingText.length();
                if (largo > 0 && !existingText.equals("0")) {
                    contenedor.setText(existingText + "5");
                } else {
                    contenedor.setText("5");
                }
            }
        });
        seis = findViewById(R.id.seis);

        seis.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String existingText = contenedor.getText().toString();
                int largo = existingText.length();
                if (largo > 0 && !existingText.equals("0")) {
                    contenedor.setText(existingText + "6");
                } else {
                    contenedor.setText("6");
                }
            }
        });
        siete = findViewById(R.id.siete);

        siete.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String existingText = contenedor.getText().toString();
                int largo = existingText.length();
                if (largo > 0 && !existingText.equals("0")) {
                    contenedor.setText(existingText + "7");
                } else {
                    contenedor.setText("7");
                }
            }
        });
        ocho = findViewById(R.id.ocho);

        ocho.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String existingText = contenedor.getText().toString();
                int largo = existingText.length();
                if (largo > 0 && !existingText.equals("0")) {
                    contenedor.setText(existingText + "8");
                } else {
                    contenedor.setText("8");
                }
            }
        });
        nueve = findViewById(R.id.nueve);

        nueve.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String existingText = contenedor.getText().toString();
                int largo = existingText.length();
                if (largo > 0 && !existingText.equals("0")) {
                    contenedor.setText(existingText + "9");
                } else {
                    contenedor.setText("9");
                }
            }
        });
        cero = findViewById(R.id.cero);

        cero.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String existingText = contenedor.getText().toString();
                    int largo = existingText.length();
                    if (largo > 0 && !existingText.equals("0")) {
                        contenedor.setText(existingText + "0");
                    } else {
                        contenedor.setText("0");
                    }

            }
        });

        punto = findViewById(R.id.punto);

        punto.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               if(puntotur){
                   String existingText = contenedor.getText().toString();
                   contenedor.setText(existingText + ".");
                   puntotur = false;
               }
            }
        });
        menos = findViewById(R.id.menos);

        menos.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String existingText = contenedor.getText().toString();
               if(menostur){
                   int largo = existingText.length();
                   if(largo==0 || largo ==1 || existingText.equals("0")) {
                       contenedor.setText("-");
                   }
                   menostur = false;
               }
            }
        });

        borrartodo = findViewById(R.id.borrartodo);

        borrartodo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String existingText = contenedor.getText().toString();
                contenedor.setText("0");
                menostur = true;
                puntotur = true;
            }
        });


        borraruno = findViewById(R.id.borraruno);

        borraruno.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String existingText = contenedor.getText().toString();
                int largo = existingText.length();
                if(largo == 0 || largo == 1) {
                    contenedor.setText("0");
                }else {
                        String menosunnumero = existingText.substring(0, largo -1);
                        contenedor.setText(menosunnumero);
                }
            }
        });
        igual = findViewById(R.id.total);

        igual.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String grados = contenedor.getText().toString();
                double numero = Double.parseDouble(grados);
                String desde = spinner.getSelectedItem().toString();
                String hasta = spinner2.getSelectedItem().toString();;
                Kelvin K = new Kelvin(numero);
                Celsius C = new Celsius(numero);
                Fahrenheit F = new Fahrenheit(numero);
                double conversion;
                switch (desde){
                    case "Celsius":
                        if(hasta.equals("Kelvin")){
                            contenedorres.setText(String.valueOf(C.parse(K).getValor()));
                        }else if(hasta.equals("Fahrenheit")){
                            contenedorres.setText(String.valueOf(C.parse(F).getValor()));
                        }else{
                        contenedorres.setText(grados);
                    }
                        break;
                    case "Kelvin":
                        if(hasta.equals("Celsius")){
                            contenedorres.setText(String.valueOf(K.parse(C).getValor()));
                        }else if(hasta.equals("Fahrenheit")){
                            contenedorres.setText(String.valueOf(K.parse(F).getValor()));
                        }else{
                            contenedorres.setText(grados);
                        }
                        break;
                    case "Fahrenheit":
                        if(hasta.equals("Celsius")){
                            contenedorres.setText(String.valueOf(F.parse(C).getValor()));
                        }else if(hasta.equals("Kelvin")){
                            contenedorres.setText(String.valueOf(F.parse(K).getValor()));
                        }else{
                            contenedorres.setText(grados);
                        }
                        break;
                }
            }
        });


    }





}