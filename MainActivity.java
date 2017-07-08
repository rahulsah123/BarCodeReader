package com.example.rahulkumar.animal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<AndroidFlavor> androidFlavors = new ArrayList<AndroidFlavor>();
        androidFlavors.add(new AndroidFlavor("Donut", "1.6", R.drawable.donut));
        androidFlavors.add(new AndroidFlavor("Eclair", "2.0-2.1", R.drawable.eclair));
        androidFlavors.add(new AndroidFlavor("Froyo", "2.2-2.2.3", R.drawable.froyo));
        androidFlavors.add(new AndroidFlavor("GingerBread", "2.3-2.3.7", R.drawable.gingerbread));
        androidFlavors.add(new AndroidFlavor("Honeycomb", "3.0-3.2.6", R.drawable.honeycomb));
        androidFlavors.add(new AndroidFlavor("Ice Cream Sandwich", "4.0-4.0.4", R.drawable.icecream));
        androidFlavors.add(new AndroidFlavor("Jelly Bean", "4.1-4.3.1", R.drawable.jellybean));
        androidFlavors.add(new AndroidFlavor("KitKat", "4.4-4.4.4", R.drawable.kitkat));
        androidFlavors.add(new AndroidFlavor("Lollipop", "5.0-5.1.1", R.drawable.lollipop));
        androidFlavors.add(new AndroidFlavor("Marshmallow", "6.0-6.0.1", R.drawable.marshmallow));
        androidFlavors.add(new AndroidFlavor("Duck","Beautifull",R.drawable.duck));
        androidFlavors.add(new AndroidFlavor("Fish","Kolkata Zoo",R.drawable.fish));
        androidFlavors.add(new AndroidFlavor("Kingkong","Kolkata Zoo",R.drawable.kingkong));
        androidFlavors.add(new AndroidFlavor("Rabit","Kolkata Zoo",R.drawable.rabit));
        androidFlavors.add(new AndroidFlavor("Monkey","Kolkata Zoo",R.drawable.monkey));
        androidFlavors.add(new AndroidFlavor("Acron","Kolkata Zoo",R.drawable.mehron));
        androidFlavors.add(new AndroidFlavor("Conch","Kolkata Zoo",R.drawable.coch));
        androidFlavors.add(new AndroidFlavor("Conch","Kolkata Zoo",R.drawable.conch));
        androidFlavors.add(new AndroidFlavor("Conch","Kolkata Zoo",R.drawable.conchh));


        // Create an {@link AndroidFlavorAdapter}, whose data source is a list of
        // {@link AndroidFlavor}s. The adapter knows how to create list item views for each item
        // in the list.
        AndroidFlavorAdapter flavorAdapter = new AndroidFlavorAdapter(this, androidFlavors);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.listview_flavor);
        listView.setAdapter(flavorAdapter);
    }
    }

