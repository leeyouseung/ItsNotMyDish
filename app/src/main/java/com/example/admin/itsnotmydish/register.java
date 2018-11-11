package com.example.admin.itsnotmydish;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URLDecoder;
import java.util.ArrayList;

import cz.msebera.android.httpclient.HttpResponse;
import cz.msebera.android.httpclient.NameValuePair;
import cz.msebera.android.httpclient.client.ClientProtocolException;
import cz.msebera.android.httpclient.client.HttpClient;
import cz.msebera.android.httpclient.client.entity.UrlEncodedFormEntity;
import cz.msebera.android.httpclient.client.methods.HttpPost;
import cz.msebera.android.httpclient.impl.client.DefaultHttpClient;
import cz.msebera.android.httpclient.message.BasicNameValuePair;

public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button sign_up = findViewById(R.id.sign_up);
        sign_up.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //Intent registerIntent = new Intent (register.this, login.class);
                //register.this.startActivity(registerIntent);
                //new RegisterTask().execute("") ;

            }
        });
    }
//    class RegisterTask extends AsyncTask<String, String, String>{
//        String url = Const.SERVER +"register";
//
//        @Override
//        protected String doInBackground(String... strings) {
//            HttpClient client = new DefaultHttpClient();
//            HttpPost post = new HttpPost(url);
//            ArrayList<NameValuePair> nameValues =
//                    new ArrayList<NameValuePair>();
//
//            try {
//                //Post방식으로 넘길 값들을 각각 지정을 해주어야 한다.
//
//                /*
//                    id(유저 아이디),
//                    password(유저 패스워드),
//                    name(유저 이름),
//                    email(유저 이메일),
//                    lat(회원가입 유저 지역 lat),
//                    lng(회원가입 유저 지역 lng)
//                 */
//                nameValues.add(new BasicNameValuePair(
//                        "id", URLDecoder.decode("test1234", "UTF-8")));
//                nameValues.add(new BasicNameValuePair(
//                        "password", URLDecoder.decode("1234", "UTF-8")));
//                nameValues.add(new BasicNameValuePair(
//                        "email", URLDecoder.decode("sss@nnnn.com", "UTF-8")));
//                nameValues.add(new BasicNameValuePair(
//                        "lat", URLDecoder.decode("21.1313", "UTF-8")));
//                nameValues.add(new BasicNameValuePair(
//                        "lng", URLDecoder.decode("12.1313", "UTF-8")));
//
//                //HttpPost에 넘길 값을들 Set해주기
//                post.setEntity(
//                        new UrlEncodedFormEntity(
//                                nameValues, "UTF-8"));
//            } catch (UnsupportedEncodingException ex) {
//                Log.e("Insert Log", ex.toString());
//            }
//
//            try {
//                //설정한 URL을 실행시키기
//                HttpResponse response = client.execute(post);
//                //통신 값을 받은 Log 생성. (200이 나오는지 확인할 것~) 200이 나오면 통신이 잘 되었다는 뜻!
//                Log.i("Insert Log", "response.getStatusCode:" + response.getStatusLine().getStatusCode());
//
//            } catch (ClientProtocolException e) {
//                e.printStackTrace();
//            } catch (MalformedURLException e) {
//                e.printStackTrace();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }

//            return null;

}