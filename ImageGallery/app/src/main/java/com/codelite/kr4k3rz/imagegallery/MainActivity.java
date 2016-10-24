package com.codelite.kr4k3rz.imagegallery;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Image> images = new ArrayList<>();
    RecyclerView recyclerView;

    int[] image = {R.drawable.neplaflag,
            R.drawable.neplaflag,
            R.drawable.ons,
            R.drawable.img2,
            R.drawable.img1,
            R.drawable.neplaflag,
            R.drawable.neplaflag,
            R.drawable.neplaflag,
            R.drawable.neplaflag,
            R.drawable.neplaflag,
            R.drawable.neplaflag,
            R.drawable.neplaflag};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.setHasFixedSize(true);
        for (int i = 0; i < image.length; i++) {
            Image image1 = new Image();
            image1.setName("Image" + i);
            image1.setRes(image[i]);
            images.add(image1);
        }
        recyclerView.setAdapter(new ImageAdapter(MainActivity.this, images));
    }
}
