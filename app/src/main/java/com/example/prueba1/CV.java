package com.example.prueba1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.prueba1.modules.Datos;
import com.google.gson.Gson;

public class CV extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cv);

        TextView nombre = findViewById(R.id.nombre);
        TextView bio = findViewById(R.id.bio);
        TextView educacion = findViewById(R.id.educacion);
        TextView habilidades = findViewById(R.id.habilidades);

        RequestQueue queue = Volley.newRequestQueue(this);

        String url ="http://www.google.com";

        // Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // Display the first 500 characters of the response string.
                        Datos datos = new Gson().fromJson(response.toString(), Datos.class);
                        nombre.setText(datos.nombre);
                        bio.setText(datos.bio);
                        educacion.setText(datos.educacion);
                        habilidades.setText(datos.habilidades);

                    }

                }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("server-request-error", error.getMessage());
            }

        });
        // Add the request to the RequestQueue.
        queue.add(stringRequest);
    }

}