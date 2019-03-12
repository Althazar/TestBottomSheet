package com.android.althazar.testbottomsheet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Toast;

import com.github.rubensousa.bottomsheetbuilder.BottomSheetBuilder;
import com.github.rubensousa.bottomsheetbuilder.BottomSheetMenuDialog;
import com.github.rubensousa.bottomsheetbuilder.adapter.BottomSheetItemClickListener;
import com.kcode.bottomlib.BottomDialog;

import de.mrapp.android.bottomsheet.BottomSheet;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button mainButton = findViewById(R.id.main_button);
        mainButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        BottomSheet.Builder builder = new BottomSheet.Builder(MainActivity.this);
        builder.setCustomTitle(R.layout.item_data);
        builder.addItem(1, R.string.app_name, R.drawable.ic_accessibility);
        builder.addItem(2, R.string.app_name, R.drawable.ic_accessibility);
        builder.addDivider();
        builder.addItem(3, R.string.app_name, R.drawable.ic_accessibility);
        builder.addDivider();
        builder.addItem(4, R.string.app_name, R.drawable.ic_accessibility);
        builder.addDivider();
        builder.addItem(4, R.string.app_name, R.drawable.ic_accessibility);
        builder.addDivider();
        builder.addItem(4, R.string.app_name, R.drawable.ic_accessibility);
        builder.addDivider();
        builder.addItem(4, R.string.app_name, R.drawable.ic_accessibility);
        builder.addDivider();
        builder.addItem(4, R.string.app_name, R.drawable.ic_accessibility);
        builder.addDivider();
        builder.addItem(4, R.string.app_name, R.drawable.ic_accessibility);
        builder.addDivider();
        builder.addItem(4, R.string.app_name, R.drawable.ic_accessibility);
        builder.addDivider();
        builder.addItem(4, R.string.app_name, R.drawable.ic_accessibility);
        builder.addDivider();

        BottomSheet bottomSheet = builder.create();
        bottomSheet.show();

        bottomSheet.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d("alif", "bottom Sheetid: "+id);
                Log.d("alif", "bottomSheet position: "+position);
            }
        });

        builder.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d("alif", "builder id: "+id);
                Log.d("alif", "builder position: "+position);
            }
        });
    }
}
