package com.example.ch4connect3game;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class Enemy {
    List enemyStack = new ArrayList();
    int enemyRandom;
    boolean winning;
    public void checkEnemyStack()
    {
        if (enemyStack.contains(1))
        {
            if (enemyStack.contains(2)&&enemyStack.contains(3))
            {
                Log.i("Status","Winning");
                winning=true;
            }
            if (enemyStack.contains(4)&&enemyStack.contains(7))
            {
                Log.i("Status","Winning");
                winning=true;
            }
            if (enemyStack.contains(5)&&enemyStack.contains(9))
            {
                Log.i("Status","Winning");
                winning=true;
            }
        }
        if (enemyStack.contains(2))
        {
            if (enemyStack.contains(5)&&enemyStack.contains(8))
            {
                Log.i("Status","Winning");
                winning=true;
            }
        }
        if (enemyStack.contains(3))
        {
            if (enemyStack.contains(5)&&enemyStack.contains(7))
            {
                Log.i("Status","Winning");
                winning=true;
            }
            if (enemyStack.contains(6)&&enemyStack.contains(9))
            {
                Log.i("Status","Winning");
                winning=true;
            }

        }
        if (enemyStack.contains(4)&&enemyStack.contains(5)&&enemyStack.contains(6))
        {
            Log.i("Status","Winning");
            winning=true;

        }
        if (enemyStack.contains(7)&&enemyStack.contains(8)&&enemyStack.contains(9))
        {
            Log.i("Status","Winning");
            winning=true;

        }


    }
}
