package com.example.lesson21twoactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnActTwo;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnActTwo = findViewById(R.id.btnActTwo);
        btnActTwo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // Intent – это объект, в котором мы прописываем, какое Activity нам необходимо вызвать
        Intent intent = new Intent(this, ActivityTwo.class);
        // Context – это объект, который предоставляет доступ к базовым функциям приложения таким как: доступ к ресурсам,
        // к файловой системе, вызов Activiy и т.д
        if (v.getId() == R.id.btnActTwo)
            startActivity(intent); // метод startActivity, который находит соответствующее Activity и показывает его

    }
}

