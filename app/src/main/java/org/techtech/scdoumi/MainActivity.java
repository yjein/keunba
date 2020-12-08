package org.techtech.scdoumi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txt_name, txt_main;
    ImageView img_left1, img_left2, img_right1, img_right2, img_food1, img_food2, img_food3, img_time1, img_time2, img_time3;
    LinearLayout btn_food, btn_time, btn_school, btn_call, btn_zoom, btn_medicine;
    private int CURRENT_INDEX;
    private ImageView[] foodViews;
    private ImageView[] timeViews;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_name = findViewById(R.id.txt_id);
        txt_main = findViewById(R.id.txt_main);
        btn_food = findViewById(R.id.btn_food);
        btn_time = findViewById(R.id.btn_time);
        btn_school = findViewById(R.id.btn_school);
        btn_call = findViewById(R.id.btn_call);
        btn_zoom = findViewById(R.id.btn_zoom);
        btn_medicine = findViewById(R.id.btn_medicine);
        img_left1 = findViewById(R.id.img_left1);
        img_left2 = findViewById(R.id.img_left2);
        img_right1 = findViewById(R.id.img_right1);
        img_right2 = findViewById(R.id.img_right2);
        img_food1 = findViewById(R.id.img_food1);
        img_food2 = findViewById(R.id.img_food2);
        img_food3 = findViewById(R.id.img_food3);
        img_time1 = findViewById(R.id.img_time1);
        img_time2 = findViewById(R.id.img_time2);
        img_time3 = findViewById(R.id.img_time3);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String email = bundle.getString("email");
        txt_name.setText(email + "님이 접속하셨습니다.");

        btn_food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                foodViews = new ImageView[]{ img_food1, img_food2, img_food3 };

                txt_main.setVisibility(View.INVISIBLE);
                img_time2.setVisibility(View.INVISIBLE);
                img_left2.setVisibility(View.INVISIBLE);
                img_right2.setVisibility(View.INVISIBLE);
                img_food2.setVisibility(View.VISIBLE);
                img_left1.setVisibility(View.VISIBLE);
                img_right1.setVisibility(View.VISIBLE);

                CURRENT_INDEX = 1;
            }


        });

        btn_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timeViews = new ImageView[]{ img_time1, img_time2, img_time3 };

                txt_main.setVisibility(View.INVISIBLE);
                img_food2.setVisibility(View.INVISIBLE);
                img_left1.setVisibility(View.INVISIBLE);
                img_right1.setVisibility(View.INVISIBLE);
                img_time2.setVisibility(View.VISIBLE);
                img_left2.setVisibility(View.VISIBLE);
                img_right2.setVisibility(View.VISIBLE);

                CURRENT_INDEX = 1;
            }
        });


        btn_school.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://kmh.hs.kr/"));
                startActivity(intent);
            }
        });

        btn_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:031-446-1201"));
                startActivity(intent);
            }
        });

        btn_zoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://zoom.us/j/4908529918?pwd=SG5BZU1GWnBEZ3VCM21OWUZ5YnU5QT09"));
                startActivity(intent);
            }
        });

        btn_medicine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://hcs.eduro.go.kr/#/loginHome"));
                startActivity(intent);
            }
        });

        img_right1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(++CURRENT_INDEX > 2) {
                    Toast toast = Toast.makeText(MainActivity.this, "마지막 이미지 입니다.", Toast.LENGTH_SHORT );
                    toast.show();

                    CURRENT_INDEX--;
                }
                else{
                    for(int i = 0; i < foodViews.length; i++){
                        if(i == CURRENT_INDEX){
                            foodViews[i].setVisibility(View.VISIBLE);
                        }
                        else{
                            foodViews[i].setVisibility(View.INVISIBLE);
                        }
                    }
                }
            }
        });

        img_left1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(--CURRENT_INDEX < 0) {
                    Toast toast = Toast.makeText(MainActivity.this, "첫번째 이미지 입니다.", Toast.LENGTH_SHORT );
                    toast.show();

                    CURRENT_INDEX++;
                }
                else{
                    for(int i = 0; i < foodViews.length; i++){
                        if(i == CURRENT_INDEX){
                            foodViews[i].setVisibility(View.VISIBLE);
                        }
                        else{
                            foodViews[i].setVisibility(View.INVISIBLE);
                        }
                    }
                }
            }
        });

        img_right2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(++CURRENT_INDEX > 2) {
                    Toast toast = Toast.makeText(MainActivity.this, "마지막 이미지 입니다.", Toast.LENGTH_SHORT );
                    toast.show();

                    CURRENT_INDEX--;
                }
                else{
                    for(int i = 0; i < timeViews.length; i++){
                        if(i == CURRENT_INDEX){
                            timeViews[i].setVisibility(View.VISIBLE);
                        }
                        else{
                            timeViews[i].setVisibility(View.INVISIBLE);
                        }
                    }
                }
            }
        });

        img_left2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(--CURRENT_INDEX < 0) {
                    Toast toast = Toast.makeText(MainActivity.this, "첫번째 이미지 입니다.", Toast.LENGTH_SHORT );
                    toast.show();

                    CURRENT_INDEX++;
                }
                else{
                    for(int i = 0; i < timeViews.length; i++){
                        if(i == CURRENT_INDEX){
                            timeViews[i].setVisibility(View.VISIBLE);
                        }
                        else{
                            timeViews[i].setVisibility(View.INVISIBLE);
                        }
                    }
                }
            }
        });
    }
}