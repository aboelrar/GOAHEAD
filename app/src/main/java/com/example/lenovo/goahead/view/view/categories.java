package com.example.lenovo.goahead.view.view;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.lenovo.goahead.R;

public class categories extends AppCompatActivity {
LinearLayout goToLogin,resturants,news,Sports,GeneralService,shoppings;
    Intent intent;
    DrawerLayout drawerLayout;
    ImageView menu;
    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        intent=new Intent(categories.this,cat.class);
        pass();
        menu();
    }

    public void pass()
    {
     resturants=(LinearLayout)findViewById(R.id.resturants);
     resturants.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             intent.putExtra("position",1);
             startActivity(intent);

         }
     });
      news=(LinearLayout)findViewById(R.id.news);
      news.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              intent.putExtra("position",0);
              startActivity(intent);
          }
      });
      Sports=(LinearLayout)findViewById(R.id.sports);
      Sports.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              intent.putExtra("position",3);
              startActivity(intent);
          }
      });
        shoppings=(LinearLayout)findViewById(R.id.shoppings);
        shoppings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("position",2);
                startActivity(intent);
            }
        });
        GeneralService=(LinearLayout)findViewById(R.id.generalservice);
        GeneralService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("position",4);
                startActivity(intent);
            }
        });
        goToLogin=(LinearLayout)findViewById(R.id.goToLogin);
        goToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(categories.this,login.class));
            }
        });
    }
    public void menu()
    {
        drawerLayout=(DrawerLayout)findViewById(R.id.drawer);
        menu=(ImageView)findViewById(R.id.menu);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (drawerLayout.isDrawerOpen(Gravity.LEFT)) {
                    drawerLayout.closeDrawer(Gravity.LEFT);

                } else {
                    drawerLayout.openDrawer(Gravity.LEFT);
                }
            }
        });
    }

    public void passnav()
    {


        resturants=(LinearLayout)findViewById(R.id.resturantnav);
        resturants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("position",1);
                startActivity(intent);

            }
        });
        news=(LinearLayout)findViewById(R.id.newsnav);
        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("position",0);
                startActivity(intent);
            }
        });
        Sports=(LinearLayout)findViewById(R.id.sportsnav);
        Sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("position",3);
                startActivity(intent);
            }
        });
        shoppings=(LinearLayout)findViewById(R.id.shoppingnav);
        shoppings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("position",2);
                startActivity(intent);
            }
        });
        GeneralService=(LinearLayout)findViewById(R.id.generalnav);
        GeneralService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("position",4);
                startActivity(intent);
            }
        });

    }
}
