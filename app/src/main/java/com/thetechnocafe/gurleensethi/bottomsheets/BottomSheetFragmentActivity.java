package com.thetechnocafe.gurleensethi.bottomsheets;

import android.support.design.widget.BottomSheetDialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BottomSheetFragmentActivity extends AppCompatActivity {

    public static final String TAG = "bottom_sheet";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_sheet_fragment);

        Button showBottomSheet = (Button) findViewById(R.id.showSheetButton);

        showBottomSheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BottomSheetFragment fragment = new BottomSheetFragment();
                fragment.show(getSupportFragmentManager(), TAG);
            }
        });
    }
}
