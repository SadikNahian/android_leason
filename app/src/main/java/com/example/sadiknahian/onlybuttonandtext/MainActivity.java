package com.example.sadiknahian.onlybuttonandtext;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public abstract class MainActivity extends AppCompatActivity {
    TextView Tv;
    Button Bt;
    ConstraintLayout Parent_layout;
    Messege msg = new Messege();

    public String tipType = "random";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Tv = findViewById(R.id.textView);
        Bt = findViewById(R.id.button);
        Parent_layout = findViewById(R.id.parent_layout);

        changeTextandColor(tipType);
        getSupportActionBar().setTitle("Tips for You");

        Bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeTextandColor(tipType);
            }
        });

        Bt.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                changeText(tipType);
                return true;
            }
        });
    }


    public void changeTextandColor(String tipType){
        String s;
        s = msg.getMsg(tipType);
        Tv.setText(s);
        Parent_layout.setBackgroundColor(Color.parseColor(msg.getBackgroundColor()));
    }

    public void changeText(String tipType){
        String s;
        s = msg.getMsg(this.tipType);
        Tv.setText(s);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.tips_type, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.tech_tips:
                Toast.makeText(MainActivity.this,"Tech tips selected", Toast.LENGTH_SHORT).show();
                tipType = "tech";
                getSupportActionBar().setTitle("Tech Tips");
                break;
            case R.id.food_tips:
                Toast.makeText(MainActivity.this,"Food tips selected", Toast.LENGTH_SHORT).show();
                getSupportActionBar().setTitle("Food Tips");
                tipType = "food";
                break;
            case R.id.fitness_tips:
                Toast.makeText(MainActivity.this,"Fitness tips selected", Toast.LENGTH_SHORT).show();
                getSupportActionBar().setTitle("Fitness Tips");
                tipType = "fitness";
                break;
            default:
                Toast.makeText(MainActivity.this,"Random tips selected", Toast.LENGTH_SHORT).show();
                getSupportActionBar().setTitle("Random Tips");
                tipType = "random";
                break;
        }
        changeTextandColor(tipType);
        return super.onOptionsItemSelected(item);
    }
}
