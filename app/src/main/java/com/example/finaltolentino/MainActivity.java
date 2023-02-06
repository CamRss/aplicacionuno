package com.example.finaltolentino;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import datos.PersonalContratado;

public class MainActivity extends AppCompatActivity {
    EditText etDato1, etDato2, etDato3, etDato4, etResultado;
    PersonalContratado pc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etDato1 = findViewById(R.id.editTextTextPersonName);
        etDato2 = findViewById(R.id.editTextTextPersonName2);
        etDato3 = findViewById(R.id.editTextTextPersonName3);
        etDato4 = findViewById(R.id.editTextTextPersonName4);
        etResultado = findViewById(R.id.editTextTextMultiLine);

        PersonalContratado.tarifaXHora = 60;
    }

    public void btnMostrar(View v) {
        pc = new PersonalContratado();
        double aux;

        pc.nombre = etDato1.getText().toString();
        pc.nroHorasTrabajadas = Double.parseDouble(etDato2.getText().toString());
        aux = Double.parseDouble((etDato3.getText().toString()));
        pc.HorasExtras = Double.parseDouble(etDato4.getText().toString());
        pc.setDescuento(aux);
        pc.calcularSueldoBruto();

        etResultado.setText("");
        etResultado.append("Nombre y apellidos: " + pc.nombre + "\n");
        etResultado.append("Calcular suelto bruto: " + pc.getSueldoBruto() + "\n");
        etResultado.append("Sueldo neto: " + pc.calcularSueldoNeto() + "\n");
        etResultado.append("Sueldo Extra" + pc.calcularSueldoExtra()+ "\n");
    }

}