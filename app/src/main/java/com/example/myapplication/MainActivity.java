package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings1) {
            Intent intent = new Intent(MainActivity.this, AboutActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    public void onButtonClick(View v) {
        EditText Num1 = (EditText) findViewById(R.id.Num1);
        EditText Num2 = (EditText) findViewById(R.id.Num2);
        TextView resText = (TextView) findViewById(R.id.res);

        int number1 = Integer.parseInt(Num1.getText().toString());
        int number2 = Integer.parseInt(Num2.getText().toString());
        int resSum = number1 + number2;
        resText.setText(Integer.toString(resSum));
        Toast.makeText(
                MainActivity.this, "Результатом суммы является число: " + Integer.toString(resSum), Toast.LENGTH_LONG
        ).show();
    }

    public void onButtonClick1(View v) {
        EditText Num1 = (EditText) findViewById(R.id.Num1);
        EditText Num2 = (EditText) findViewById(R.id.Num2);
        TextView resText = (TextView) findViewById(R.id.res);

        int number1 = Integer.parseInt(Num1.getText().toString());
        int number2 = Integer.parseInt(Num2.getText().toString());
        int resSum = number1 - number2;
        resText.setText(Integer.toString(resSum));
        Toast.makeText(
                MainActivity.this, "Результатом вычитания является число: " + Integer.toString(resSum), Toast.LENGTH_LONG
        ).show();
    }

    public void onButtonClick2(View v) {
        EditText Num1 = (EditText) findViewById(R.id.Num1);
        EditText Num2 = (EditText) findViewById(R.id.Num2);
        TextView resText = (TextView) findViewById(R.id.res);

        int number1 = Integer.parseInt(Num1.getText().toString());
        int number2 = Integer.parseInt(Num2.getText().toString());
        int resSum = number1 * number2;
        resText.setText(Integer.toString(resSum));
        Toast.makeText(
                MainActivity.this, "Результатом умножения является число: " + Integer.toString(resSum), Toast.LENGTH_LONG
        ).show();
    }

    public void onButtonClick3(View v) {
        EditText Num1 = (EditText) findViewById(R.id.Num1);
        EditText Num2 = (EditText) findViewById(R.id.Num2);
        TextView resText = (TextView) findViewById(R.id.res);

        int number1 = Integer.parseInt(Num1.getText().toString());
        int number2 = Integer.parseInt(Num2.getText().toString());
        double resSum = number1 / number2;
        resText.setText(Double.toString(resSum));
        Toast.makeText(
                MainActivity.this, "Результатом деления является число: " + Double.toString(resSum), Toast.LENGTH_LONG
        ).show();
    }

}