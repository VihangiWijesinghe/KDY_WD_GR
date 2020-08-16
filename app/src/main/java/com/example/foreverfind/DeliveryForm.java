package com.example.foreverfind;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class DeliveryForm extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_form);

        button = findViewById(R.id.btnDelCon);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(DeliveryForm.this,summary.class);
                startActivity(intent);
            }
        });


    }

    public boolean onCreateOptionsMenu(Menu menu){

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.drawer_menu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        Intent intent;
        switch(item.getItemId()){

            case R.id.nav_home:
                intent = new Intent(DeliveryForm.this,getStarted.class);
                startActivity(intent);
                return true;

            case R.id.nav_profile:
                intent = new Intent(DeliveryForm.this,PersonalProfile.class);
                startActivity(intent);
                return true;

            case R.id.nav_shopcart:
                intent = new Intent(DeliveryForm.this,shoppingCart.class);
                startActivity(intent);
                return true;

            case R.id.nav_orders:
                intent = new Intent(DeliveryForm.this,Orders.class);
                startActivity(intent);
                return true;

            case R.id.nav_message:
                intent = new Intent(DeliveryForm.this,Messages.class);
                startActivity(intent);
                return true;

            default:
                return super.onOptionsItemSelected(item);

        }
    }
}