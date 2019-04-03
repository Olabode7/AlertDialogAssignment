package com.example.alertdialogassignment;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String language;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selectLanguage(View view){
        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_info)
                .setTitle("Please choose a language")
                .setMessage("You can choose between English and Spanish : )")
                .setPositiveButton("English", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        language = "English";
                        message();
                    }
                })
                .setNegativeButton("Spanish", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        language = "Spanish";
                        message();
                    }
                }).show();
    }


    public void message(){
        TextView showText = findViewById(R.id.ShowLanguage);
        if(language.equals("English")) {
            String message = "You chose English";
            showText.setText(message);
        }
        else if(language.equals("Spanish")){
            String message = "You chose Spanish";
            showText.setText(message);
        }
    }
}

