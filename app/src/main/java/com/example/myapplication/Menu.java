package com.example.myapplication;

import android.view.MenuItem;

public interface Menu extends android.view.Menu {
    int onCreateOptionMenu(Menu menu);

    boolean onOptionItemSelected(MenuItem item);

}
