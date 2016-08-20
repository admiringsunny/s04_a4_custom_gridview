package com.acadgild.s04A4GridViewImageText;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class GridViewActivity extends AppCompatActivity {

    public static String[] versionNames = {
            "CUPCAKE", "DONUT", "ECLAIR", "FROYO",
            "GINGERBREAD", "HONEYCOMB", "ICE CREAM SANDWICH",
            "JELLY BEAN", "KITKAT", "LOLLIPOP" };

    public static int[] versionImageIds = {
            R.drawable.cupcake, R.drawable.donut, R.drawable.eclair, R.drawable.froyo,
            R.drawable.gingerbread, R.drawable.honeycomb, R.drawable.ice_cream_sandwich,
            R.drawable.jelly_bean, R.drawable.kitkat, R.drawable.lollipop };

    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView) findViewById(R.id.grid_view);
        gridView.setAdapter(new GridViewAdapter(this, versionNames, versionImageIds));
    }
}
