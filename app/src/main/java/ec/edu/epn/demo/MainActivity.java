package ec.edu.epn.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Crear elementos
        Button btnImplicito = (Button) findViewById(R.id.btnImplicito);
        Button btnExplicito = (Button) findViewById(R.id.btnExplicito);
        // Eventos de los botones
        btnImplicito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Boton","Intent implicito");
                implicito();
            }
        });
        btnExplicito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Boton","Intent explicito");
                explicito();
            }
        });
    }

    private void implicito(){
        Intent intent01 = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://avelectronics.cc"));
        startActivity(intent01);
    }

    private void explicito(){
        Intent intent02 = new Intent(this,
                Acerca.class);
        startActivity(intent02);
    }


}