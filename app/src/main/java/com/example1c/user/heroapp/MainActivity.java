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
        setTitle("Heroes From Past");
    }
    public void click(View v) {
        Intent intent = new Intent();
        switch(v.getId()) {
            case R.id.txtHero1:
                intent = new Intent(this, HeroCharacter1.class);
                break;
            case R.id.txtHero2: // R.id.textView2
                intent = new Intent(this, HeroCharacter2.class);
               break;
            case R.id.txtHero3: // R.id.textView3
                intent = new Intent(this, HeroCharacter3.class);
                break;
            case R.id.txtHero4: // R.id.textView4
                intent = new Intent(this, HeroCharacter4.class);
                break;
        }
        startActivity(intent);


    }
}
