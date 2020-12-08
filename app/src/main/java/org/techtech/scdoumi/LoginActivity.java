package org.techtech.scdoumi;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    EditText txt_email;
    EditText txt_password;
    ImageView img_google, img_instagram, img_facebook;
    Button btn_login, btn_signup;
    String emailOK = "30900", passwordOK = "12345";
    String inputEmail = "0", inputPassword = "0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txt_email = findViewById(R.id.txt_id);
        txt_password = findViewById(R.id.txt_password);
        img_google = findViewById(R.id.img_google);
        img_instagram = findViewById(R.id.img_instagram);
        img_facebook = findViewById(R.id.img_facebook);
        btn_login = findViewById(R.id.btn_login);
        btn_signup = findViewById(R.id.btn_signup);

        btn_login.setClickable(false);

        txt_email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s!=null){
                    inputEmail = s.toString();
                    btn_login.setClickable(validation());
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        txt_password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s!=null){
                    inputPassword = s.toString();
                    btn_login.setClickable(validation());
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        img_facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.facebook.com/"));
                startActivity(intent);
            }
        });
        img_instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.instagram.com/"));
                startActivity(intent);
            }
        });
        img_google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.google.com/"));
                startActivity(intent);
            }
        });

        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, SignupActivity.class);
                startActivity(intent);
            }
        });
    }

    public boolean validation(){
        return inputEmail.equals(emailOK)&&inputPassword.equals(passwordOK);
    }

    public void btn_click(View v){
        String email = txt_email.getText().toString(); //email 변수에 txt_email에 담긴 문자열을 저장시킵니다.
        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        intent.putExtra("email", email); //email 주소가 담긴 email변수를 "email"이라는 이름표를 달고 짐을 실어놓습니다.
        startActivity(intent);
        Toast.makeText(this,inputEmail+"님 반갑습니다.",Toast.LENGTH_SHORT).show();
    }


}