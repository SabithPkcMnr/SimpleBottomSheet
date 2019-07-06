package com.sabithpkcmnr.bottomsheet;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ActivityHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button bt_show = findViewById(R.id.btShow);
        bt_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyBottomSheet myBottomSheet = new MyBottomSheet();
                myBottomSheet.show(getSupportFragmentManager(), myBottomSheet.getTag());
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.item_shop) {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.instamojo.com/sabithpkcmnr")));
        }
        return super.onOptionsItemSelected(item);
    }
}