package com.game.customtoolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("My Toolbar");
        }

//        toolbar.setTitle("My ToolBar");

//        yaha ki priority kam hoti hai manifest ke label se
//        isliye title set yaha ka nahi dikhayega isliye
//        getSupportActionBar() ke sath set kar denge
//        to uski priority high rahegi to change dikhayega.
//        isitarh ham subtitle ko bhi set kar sakte hai but uski koi jarurat nahi hai
//        kyonki pahle se koi default subtitle set nahi hai to iski aise hi priotity high rahegi


        toolbar.setSubtitle("Subtitle");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        new MenuInflater(this).inflate(R.menu.opt_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

        @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int item_id = item.getItemId();
        if (item_id==R.id.opt_new){
            Toast.makeText(this, "New File Created", Toast.LENGTH_SHORT).show();
        } else if (item_id == R.id.opt_open) {
            Toast.makeText(this, "File Opened", Toast.LENGTH_SHORT).show();
        } else if (item_id == R.id.opt_Save) {
            Toast.makeText(this, "File Saved", Toast.LENGTH_SHORT).show();
        }
//         else if (item_id==android.R.id.home) {super.onBackPressed();}
         else {
             super.onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}