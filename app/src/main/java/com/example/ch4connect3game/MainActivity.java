package com.example.ch4connect3game;


import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Activity statusActivity;
    User user = new User();
    Enemy enemy = new Enemy();
    List imageViewList = new ArrayList<>();


    public ImageView imageViewUniversal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        statusActivity = MainActivity.this;
        Collections.addAll(imageViewList,R.id.r1c1, R.id.r1c2, R.id.r1c3, R.id.r2c1, R.id.r2c2,
                R.id.r2c3,R.id.r3c1,R.id.r3c2,R.id.r3c3);
        Random random = new Random();
        int startNumber = random.nextInt(2);
        if(startNumber==1)
        { enemyAI();}
    }

    public void enemyAI()
    {
        Random random = new Random();
        enemy.enemyRandom = random.nextInt(9)+1;
        while (enemy.enemyStack.contains(enemy.enemyRandom)||user.userStack.contains(enemy.enemyRandom))
        {
            enemy.enemyRandom = random.nextInt(9)+1;
        }
        enemy.enemyStack.add(enemy.enemyRandom);
        enemyFinder();

    }

    public void enemyFinder()
    {
        imageViewUniversal = findViewById(Integer.parseInt(imageViewList.get(enemy.enemyRandom-1).toString()));
        imageViewUniversal.setImageResource(R.drawable.o);
        imageViewUniversal.animate().alpha(1f).setDuration(500).setStartDelay(200);
        imageViewUniversal.setClickable(false);
        checkWin();
        enemy.checkEnemyStack();
    }

    public void finder(View view)
    {
        imageViewUniversal = findViewById(view.getId());
        imageViewUniversal.setImageResource(R.drawable.x);
        imageViewUniversal.animate().alpha(1f).setDuration(500);
        user.userStack.add(Integer.parseInt(imageViewUniversal.getTag().toString()));
        user.userStep++;
        imageViewUniversal.setClickable(false);
        user.checkUserStack();
        if (user.userStack.size()<5)
        {
            enemyAI();
        }
        checkWin();
    }

    public void checkWin()
    {
        if (user.winning)
            {
                Toast.makeText(this,"Victory!",Toast.LENGTH_SHORT).show();
            }
        else if (enemy.winning)
            {
                Toast.makeText(this,"Defeat",Toast.LENGTH_SHORT).show();
            }
        else if ((enemy.enemyStack.size()==5||user.userStack.size()==5)&&(!user.winning&&!enemy.winning))
            {
                Toast.makeText(this, "Truce", Toast.LENGTH_SHORT).show();
            }

    }

    public void reset(View view)
    {
     statusActivity.recreate();
    }


}
