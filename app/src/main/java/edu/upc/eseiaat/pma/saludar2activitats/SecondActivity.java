package edu.upc.eseiaat.pma.saludar2activitats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public static String KEY_NOM = "KEY_NOM";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String nom = getIntent().getExtras().getString(KEY_NOM);
        //Substitueix el "%s" pel string nom
        String missatge = String.format(getResources().getString(R.string.missatgeSalutacio),nom);
        TextView textView = (TextView) findViewById(R.id.textViewSalutacio);
        textView.setText(missatge);
    }
}
