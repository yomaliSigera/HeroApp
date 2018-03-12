package com.example1c.user.heroapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click(View v) {
        Intent intent = new Intent();
        switch(v.getId()) {
            case R.id.txtHero1:
                intent = new Intent(this, HeroCharacter1.class);
                break;
           // case R.id.albertB: // R.id.textView2
             //   intent = new Intent(this, ThirdClass.class);
            //    break;
        }
        startActivity(intent);


    }
}
