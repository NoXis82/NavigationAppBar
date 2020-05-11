package com.example.navigationappbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        selectionMenuId(id);
        return super.onOptionsItemSelected(item);
    }

    public void selectionMenuId(@MenuIntDef int id) {
        switch (id) {
            case MenuIntDef.NOTES:
                Intent intentNotes = new Intent(MainActivity.this,
                        NotesActivity.class);
                startActivity(intentNotes);
                Toast.makeText(MainActivity.this,
                        R.string.toast_open_notes,
                        Toast.LENGTH_LONG).show();
                break;
            case MenuIntDef.PAY:
                Intent intentPays = new Intent(MainActivity.this,
                        PayActivity.class);
                startActivity(intentPays);
                Toast.makeText(MainActivity.this,
                        R.string.toast_open_pay,
                        Toast.LENGTH_LONG).show();
                break;
            case MenuIntDef.TASK:
                Intent intentTasks = new Intent(MainActivity.this,
                        TasksActivity.class);
                startActivity(intentTasks);
                Toast.makeText(MainActivity.this,
                        R.string.toast_open_tasks,
                        Toast.LENGTH_LONG).show();
                break;
            case MenuIntDef.DELIVERY:
                Intent intentDelivery = new Intent(MainActivity.this,
                        DeliveryActivity.class);
                startActivity(intentDelivery);
                Toast.makeText(MainActivity.this,
                        R.string.toast_open_delivery,
                        Toast.LENGTH_LONG).show();
                break;
        }
    }
}
