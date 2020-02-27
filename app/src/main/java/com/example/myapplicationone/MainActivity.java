package com.example.myapplicationone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {


    private Button mSnackbarBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSnackbarBtn = findViewById(R.id.snackbar_btn);

        mSnackbarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(v, "You Just clicked this", Snackbar.LENGTH_LONG);

                snackbar.show();
            }
        });

    }
}
