package org.techtech.scdoumi;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {

    Button btn_signup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        btn_signup = findViewById(R.id.btn_signup2);
    }

    public void Signup_Clicked(View v){
        Intent intent = new Intent(SignupActivity.this,LoginActivity.class);
        startActivity(intent);
        Toast.makeText(this,"회원가입 되었습니다.", Toast.LENGTH_SHORT).show();
    }
}