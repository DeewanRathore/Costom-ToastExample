package com.rathoreraja.costomtost;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btncostomToast;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btncostomToast = findViewById(R.id.btncostomToast);
        btncostomToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast toast = new Toast(getApplicationContext());

                @SuppressLint({"MissingInflatedId", "LocalSuppress"}) View view = getLayoutInflater().inflate(R.layout.costom_layout_toast,(ViewGroup) findViewById(R.id.viewContainer));

                setContentView(view);
                @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView txtMsg = findViewById(R.id.txtMsg);
                txtMsg.setText("Massage Sent Successfully!");
                toast.setDuration(Toast.LENGTH_LONG);
                toast.show();

            }
        });
    }
}