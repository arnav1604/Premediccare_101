package com.example.premediccare_101;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

import static com.example.premediccare_101.R.id.drawer_layout;
import static com.example.premediccare_101.R.id.toolbar;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //DrawerLayout drawer;
        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new HomeFragment()).commit();
    }
    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.home:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new HomeFragment()).commit();
                drawer.closeDrawers();
                break;
            case R.id.diabetes:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new Diabetes()).commit();
                drawer.closeDrawers();
                break;
            case R.id.heart:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new HeartDisease()).commit();
                drawer.closeDrawers();
                break;
            case R.id.breastcancer:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new BreastCancer()).commit();
                drawer.closeDrawers();
                break;
            case R.id.liver:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new LiverDisease()).commit();
                drawer.closeDrawers();
                break;
            case R.id.malaria:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new Malaria()).commit();
                drawer.closeDrawers();
                break;
            case R.id.pneumonia:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new Pnemonia()).commit();
                drawer.closeDrawers();
                break;
            case R.id.reinopathy:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new Reinopathy()).commit();
                drawer.closeDrawers();
                break;
            case R.id.chronickidney:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new ChronicKidney()).commit();
                drawer.closeDrawers();
                break;
            case R.id.header:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new HomeFragment()).commit();
        }
        return true;
    }
}
