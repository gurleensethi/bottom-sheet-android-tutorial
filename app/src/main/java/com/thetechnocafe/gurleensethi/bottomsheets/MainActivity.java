package com.thetechnocafe.gurleensethi.bottomsheets;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bottomSheetsCoordinatorLayout = (Button) findViewById(R.id.bottomSheetsButton);
        Button bottomSheetsDialogFragment = (Button) findViewById(R.id.bottomSheetsDialogFragmentButton);

        bottomSheetsCoordinatorLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BottomSheetActivity.class);
                startActivity(intent);
            }
        });

        bottomSheetsDialogFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BottomSheetFragmentActivity.class);
                startActivity(intent);
            }
        });
    }
}
