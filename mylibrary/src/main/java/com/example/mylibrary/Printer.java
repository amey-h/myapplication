package com.example.mylibrary;

import android.content.Context;
import android.util.Log;

public class Printer {

    private Context context;

    public Printer(Context c) {
        context = c;
    }

    public static void d(String tag, String message) {
        Log.d(tag, message);
    }

    public static void e(String tag, String message) {
        Log.d(tag, message);
    }

}
