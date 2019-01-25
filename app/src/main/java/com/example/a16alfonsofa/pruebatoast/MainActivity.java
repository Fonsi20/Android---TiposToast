package com.example.a16alfonsofa.pruebatoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import junit.framework.TestResult;

public class MainActivity extends AppCompatActivity {

    private Button btnDefecto, btnPersonalizado, btnMovido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnDefecto = (Button) findViewById(R.id.btnToastDefecto);
        btnPersonalizado = (Button) findViewById(R.id.btnToastPersonalizado);
        btnMovido = (Button) findViewById(R.id.btnToastEnOtraPosi);

        btnDefecto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, " Toast de defecto ", Toast.LENGTH_LONG).show();
            }
        });

        btnMovido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast t2 = Toast.makeText(MainActivity.this, " Toast Mocido ", Toast.LENGTH_LONG);
                t2.setGravity(Gravity.CENTER_VERTICAL | Gravity.LEFT, 300, 0);
                t2.show();
            }
        });


        btnPersonalizado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout toastLayout = (LinearLayout) findViewById(R.id.toastLayout);
                LayoutInflater inflater = getLayoutInflater();
                View view = inflater.inflate(R.layout.mitoast, toastLayout);
                TextView texto =(TextView) view.findViewById(R.id.txtToast);
                texto.setText("Toast Personalizado");

                Toast t3 = new Toast(MainActivity.this);
                t3.setDuration(Toast.LENGTH_LONG);
                t3.setView(view);
                t3.show();
            }
        });


    }
}
