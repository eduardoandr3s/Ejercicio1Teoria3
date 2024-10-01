package EduCodeDev.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

/*Hacer una actividad que permita escribir una frase y que tenga dos botones que
vayan a la misma actividad, pero que uno resuelva cuantos caracteres tiene la
frase y otro que diga cuantas palabras tiene esa misma frase.*/

public class MainActivity extends AppCompatActivity {


    private EditText txtFrase;
    private Button btnCuentaChar;
    private Button btnCuentaPalabras;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        inicializarVistas();

        btnCuentaChar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String frase = txtFrase.getText().toString();
                boolean bool = true;

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                Bundle bundle = new Bundle();
                bundle.putString("FRASE", frase);
                bundle.putBoolean("BOOL", bool);

                intent.putExtras(bundle);
                startActivity(intent);
            }
        });


        btnCuentaPalabras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String frase2 = txtFrase.getText().toString();
                boolean bool2 = true;

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                Bundle bundle = new Bundle();
                bundle.putString("FRASE", frase2);
                bundle.putBoolean("BOOL", bool2);

                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }

    private void inicializarVistas() {

        txtFrase = findViewById(R.id.txtFraseMain);
        btnCuentaChar = findViewById(R.id.btnCuentaCharMain);
        btnCuentaPalabras = findViewById(R.id.btnCuentaPalabrasMain);

    }
}