package com.cain.appsui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn01;
    private Button btn02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn01 = (Button) findViewById(R.id.btn01);
        btn02 = (Button) findViewById(R.id.btn02);

        btn01.setOnClickListener(this);
        btn02.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()) {
            case R.id.btn01:
                intent.putExtra("weburl","file:///android_asset/sui03.html");
                intent.setClass(this,WebActivity.class);
                startActivity(intent);
                break;
            case R.id.btn02:
                intent.putExtra("weburl","file:///android_asset/sui04.html");
                intent.setClass(this,WebActivity.class);
                startActivity(intent);
                break;

        }
    }
}
