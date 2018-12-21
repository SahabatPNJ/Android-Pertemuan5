package com.aha.navigasidrawer;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    ActionBarDrawerToggle ab;
    DrawerLayout draw;
    NavigationView navigasi;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        draw = (DrawerLayout)findViewById(R.id.drawerLayout);
        ab = new ActionBarDrawerToggle(this,draw,toolbar,R.string.open,R.string.close);

        navigasi = (NavigationView) findViewById(R.id.navigasi);

        draw.addDrawerListener(ab);
        ab.syncState();
        navigasi.setNavigationItemSelectedListener(this);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.Home :

                Intent a = new Intent(this, Main2Activity.class);
                startActivity(a);

                break;
            case R.id.Profile :

                Toast.makeText(this, "Menu Profile Dipilih", Toast.LENGTH_SHORT).show();

                break;
            case R.id.About :

                Toast.makeText(this, "Menu About Dipilih", Toast.LENGTH_SHORT).show();

                break;
            case R.id.Exit :

                Toast.makeText(this, "Menu Exit Dipilih", Toast.LENGTH_SHORT).show();

                break;
        }

        return true;
    }
}
