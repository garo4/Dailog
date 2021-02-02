package com.example.dailog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnfon;
    ConstraintLayout constraintLayout;
    Context Context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnfon = (Button)findViewById(R.id.btnFon);
        constraintLayout = (ConstraintLayout)findViewById(R.id.ConstraintLayout);
        Context = MainActivity.this;
        btnfon.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        final CharSequence [] items = {"Красный","Желтый","Зеленый"};

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Хотите поменять фон?");

        builder.setTitle(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int item) {
                switch (item) {
                    case 0:
                        constraintLayout.setBackgroundResource(R.color.redColor);
                        Toast.makeText(Context, "Красный", Toast.LENGTH_LONG).show();
                        break;
                    case 1:
                        constraintLayout.setBackgroundResource(R.color.yellowColor);
                        Toast.makeText(Context, "Желтый", Toast.LENGTH_LONG).show();
                        break;
                    case 2:
                        constraintLayout.setBackgroundResource(R.color.greenColor);
                        Toast.makeText(Context, "Зеленый", Toast.LENGTH_LONG).show();
                        break;
                }
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}