package com.example.elevator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ImageView man0, man1, man2, man3, floor1, floor2, floor3, building;
    private TextView txtFloorNumber;
    private Button btnGround;
    private Elevator elevator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        elevator = new Elevator(4);
        floor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txtFloorNumber.setText(elevator.goToFloorA());
                man0.setVisibility(View.INVISIBLE);
                man1.setVisibility(View.VISIBLE);
                man2.setVisibility(View.INVISIBLE);
                man3.setVisibility(View.INVISIBLE);
            }
        });
        floor2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtFloorNumber.setText(elevator.goToFloorB());
                man0.setVisibility(View.INVISIBLE);
                man1.setVisibility(View.INVISIBLE);
                man2.setVisibility(View.VISIBLE);
                man3.setVisibility(View.INVISIBLE);
            }
        });
        floor3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtFloorNumber.setText(elevator.goToFloorC());
                man0.setVisibility(View.INVISIBLE);
                man1.setVisibility(View.INVISIBLE);
                man2.setVisibility(View.INVISIBLE);
                man3.setVisibility(View.VISIBLE);
            }
        });
        btnGround.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtFloorNumber.setText(elevator.goToFloorGround());
                man0.setVisibility(View.VISIBLE);
                man1.setVisibility(View.INVISIBLE);
                man2.setVisibility(View.INVISIBLE);
                man3.setVisibility(View.INVISIBLE);
            }
        });
    }

    private void initViews() {
        man0 = findViewById(R.id.man0);
        man1 = findViewById(R.id.man1);
        man2 = findViewById(R.id.man2);
        man3 = findViewById(R.id.man3);
        floor1 = findViewById(R.id.floor1);
        floor2 = findViewById(R.id.floor2);
        floor3 = findViewById(R.id.floor3);
        building = findViewById(R.id.imgBuilding);
        btnGround = findViewById(R.id.btnGround);
        txtFloorNumber = findViewById(R.id.txtFloorNumber);
    }
}