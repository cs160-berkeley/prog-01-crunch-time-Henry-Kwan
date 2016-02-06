package com.example.henry.crunchtime;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText PushUpsEdit = (EditText) findViewById(R.id.pushUpEdit);
        final EditText SitUpsEdit = (EditText) findViewById(R.id.sitUpEdit);
        final EditText JJEdit = (EditText) findViewById(R.id.jjEdit);
        final EditText jogEdit = (EditText) findViewById(R.id.jogEdit);
        final EditText calor = (EditText) findViewById(R.id.Calorie);
        Button convertButton = (Button) findViewById(R.id.PushUpButton);
        Button sitUpCon = (Button) findViewById(R.id.situpButton);
        Button jumpButton = (Button) findViewById(R.id.jjbutton);
        Button jogButton = (Button) findViewById(R.id.JogButton);
        Button Burn = (Button) findViewById(R.id.burn);

        jogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double jogs = Double.valueOf(jogEdit.getText().toString());
                double pushups = jogs*350/12;
                double situps = jogs*200/12;
                double jumpjack = jogs*10/12;
                PushUpsEdit.setText(String.valueOf(pushups));
                SitUpsEdit.setText(String.valueOf(situps));
                JJEdit.setText(String.valueOf(jumpjack));
                calor.setText(String.valueOf(100*jogs/12));
            }
        });

        sitUpCon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double situps = Double.valueOf(SitUpsEdit.getText().toString());
                double pushups = situps*350/200;
                double jumpjack = situps/20;
                double jogging = situps*12/200;
                PushUpsEdit.setText(String.valueOf(pushups));
                JJEdit.setText(String.valueOf(jumpjack));
                jogEdit.setText(String.valueOf(jogging));
                calor.setText(String.valueOf(100*situps/200));
            }
        });

        jumpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double jumpjack = Double.valueOf(JJEdit.getText().toString());
                double pushups = 35 * jumpjack;
                double situps = 20 * jumpjack;
                double jogging = jumpjack*12/10;
                PushUpsEdit.setText(String.valueOf(pushups));
                SitUpsEdit.setText(String.valueOf(situps));
                jogEdit.setText(String.valueOf(jogging));
                calor.setText(String.valueOf(100*jumpjack/10));
            }
        });

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double pushups = Double.valueOf(PushUpsEdit.getText().toString());
                double situps = pushups*200/350;
                double jumpjack = pushups/35;
                double jogging = pushups*12/350;
                SitUpsEdit.setText(String.valueOf(situps));
                JJEdit.setText(String.valueOf(jumpjack));
                jogEdit.setText(String.valueOf(jogging));
                calor.setText(String.valueOf(100*pushups/350));
            }
        });

        Burn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double burned = Double.valueOf(calor.getText().toString());
                double pushups = 3.5*burned;
                double situps =  2.0*burned;
                double jumpjack = .1*burned;
                double jogging = .12*burned;
                PushUpsEdit.setText(String.valueOf(pushups));
                SitUpsEdit.setText(String.valueOf(situps));
                JJEdit.setText(String.valueOf(jumpjack));
                jogEdit.setText(String.valueOf(jogging));
            }
        });


    }


}
