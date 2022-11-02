package com.example.classmonitor;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.example.classmonitor.fragments.HomeFragment;
import com.example.classmonitor.fragments.ScheduleFragment;
import com.example.classmonitor.fragments.UnitsFragment;

public class HomeActivity extends AppCompatActivity {
    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
       /* HomeFragment homeFragment = new HomeFragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.flLayout, homeFragment)
                .commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main , menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_units:
                UnitsFragment unitsFragment = new UnitsFragment();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.flLayout, unitsFragment)
                        .commit();
                Toast.makeText(this, "units", Toast.LENGTH_SHORT).show();
                break;

            case R.id.action_schedule:
                ScheduleFragment scheduleFragment = new ScheduleFragment();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.flLayout, scheduleFragment)
                        .commit();
                Toast.makeText(this, "schedule", Toast.LENGTH_SHORT).show();
                break;

            case R.id.action_logout:

                Toast.makeText(this, "logout", Toast.LENGTH_SHORT).show();
                break;

        }
        return super.onOptionsItemSelected(item);*/
    }
}