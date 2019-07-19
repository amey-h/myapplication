package com.example.mylibrary;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyLibImpl {

    private Context context;

    public MyLibImpl(Context c) {
        this.context = c;
    }

    public void printLog(String message) {
        Log.d("MyLibImpl", message);
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public void startLibActivity(Context context) {
        Log.d("MyLibImpl", "starting Library Activity");
        Intent intent = new Intent(context, MyLibActivity.class);
        context.startActivity(intent);
    }
}
