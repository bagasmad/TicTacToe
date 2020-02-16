package com.example.ch4connect3game;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class User {
    List userStack = new ArrayList();
    int userStep = 0;
    boolean winning;
    public void checkUserStack()
    {
        if (userStack.contains(1))
        {
            if (userStack.contains(2)&&userStack.contains(3))
            {
                Log.i("Status","Winning");
                winning=true;
            }
            if (userStack.contains(4)&&userStack.contains(7))
            {
                Log.i("Status","Winning");
                winning=true;
            }
            if (userStack.contains(5)&&userStack.contains(9))
            {
                Log.i("Status","Winning");
                winning=true;
            }
        }
        if (userStack.contains(2))
        {
            if (userStack.contains(5)&&userStack.contains(8))
            {
                Log.i("Status","Winning");
                winning=true;
            }
        }
        if (userStack.contains(3))
        {
            if (userStack.contains(5)&&userStack.contains(7))
            {
                Log.i("Status","Winning");
                winning=true;
            }
            if (userStack.contains(6)&&userStack.contains(9))
            {
                Log.i("Status","Winning");
                winning=true;
            }

        }
        if (userStack.contains(4)&&userStack.contains(5)&&userStack.contains(6))
        {
            Log.i("Status","Winning");
            winning=true;

        }
        if (userStack.contains(7)&&userStack.contains(8)&&userStack.contains(9))
        {
            Log.i("Status","Winning");
            winning=true;

        }


    }

}
