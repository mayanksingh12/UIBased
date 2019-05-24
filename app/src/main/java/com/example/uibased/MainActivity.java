package com.example.uibased;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.LayerDrawable;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

 /*   TextView textView;
    SeekBar seekBar1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.txtview);
        seekBar1=findViewById(R.id.seekbar);

        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textView.setTextSize(progress+40);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }*/

//---------------------------------------------------------------------=

//    RatingBar ratingBar;
//    TextView textView;
//    Button button;
//    LayerDrawable layerDrawable;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        ratingBar=findViewById(R.id.ratingBar1);
//
//        button=findViewById(R.id.btn1);
//
//      layerDrawable= (LayerDrawable) ratingBar.getProgressDrawable();
//
//
//        layerDrawable.getDrawable(2).setColorFilter(Color.YELLOW, PorterDuff.Mode.SRC_ATOP);
//
//
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                textView=findViewById(R.id.txtView1);
//                textView.setText("You rated"+String.valueOf(ratingBar.getRating()));
//                int i= layerDrawable.getNumberOfLayers();
//                Toast.makeText(MainActivity.this,"hello"+i,Toast.LENGTH_SHORT).show();
//            }
//        });

   // -----------------------------------------------------------------------


   RadioGroup radioGroup1;
    Button submit1,clear1;
    RadioButton radioButton;
   // int checkedIdOfRadioButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       radioGroup1=findViewById(R.id.radioGroup);
       submit1=findViewById(R.id.button);
       clear1=findViewById(R.id.button2);
       radioGroup1.clearCheck();

//
//         radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                checkedIdOfRadioButton=checkedId;
//            }
//        });
//
//
//        submit1.setOnClickListener(new View.OnClickListener() {
//    @Override
//    public void onClick(View v) {
//        if(checkedIdOfRadioButton==R.id.radioButton2)
//        {
//            radioButton = findViewById(checkedIdOfRadioButton);
//            Toast.makeText(MainActivity.this, radioButton.getText(), Toast.LENGTH_LONG).show();
//        }
//        if(checkedIdOfRadioButton==R.id.radioButton3)
//        {
//            radioButton = findViewById(checkedIdOfRadioButton);
//            Toast.makeText(MainActivity.this, radioButton.getText(), Toast.LENGTH_LONG).show();
//        }
//        if(checkedIdOfRadioButton==R.id.radioButton4)
//        {
//            radioButton = findViewById(checkedIdOfRadioButton);
//            Toast.makeText(MainActivity.this, radioButton.getText(), Toast.LENGTH_LONG).show();
//        }
//        if(checkedIdOfRadioButton==R.id.radioButton5)
//        {
//            radioButton = findViewById(checkedIdOfRadioButton);
//            Toast.makeText(MainActivity.this, radioButton.getText(), Toast.LENGTH_LONG).show();
//        }
//    }
//});
//
//


















//         radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//             @Override
//             public void onCheckedChanged(RadioGroup group, int checkedId) {
//                 radioButton = group.findViewById(checkedId);
//             }
//         });


         submit1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 int selectedItem = radioGroup1.getCheckedRadioButtonId();

                 if (selectedItem == -1) {
                     Toast.makeText(MainActivity.this, "No content is here", Toast.LENGTH_LONG).show();
                 } else {
                     RadioButton radioButton = radioGroup1.findViewById(selectedItem);
                     Toast.makeText(MainActivity.this, radioButton.getText(), Toast.LENGTH_LONG).show();
                 }
             }
         });


         clear1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 radioGroup1.clearCheck();
             }
         });

     }

 }
