package edu.upc.eseiaat.pma.saludar2activitats;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {

    private EditText editTextNom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        editTextNom = (EditText) findViewById(R.id.editTextNom);
    }

    public void saludar(View view) {
        //TODO
        Intent intent = new Intent(this,SecondActivity.class);
        String nom = editTextNom.getText().toString();
        intent.putExtra(SecondActivity.KEY_NOM,nom);
        startActivity(intent);
    }
}
