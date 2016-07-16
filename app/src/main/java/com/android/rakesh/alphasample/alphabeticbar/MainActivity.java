package com.android.rakesh.alphasample.alphabeticbar;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.android.rakesh.alphasample.alphabeticbar.R;
import com.android.rakesh.custviews.carousel.Carousel;
import com.android.rakesh.custviews.carousel.CarouselAdapter;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);
        Carousel carousel = (Carousel)findViewById(R.id.carousel);
        carousel.setOnItemClickListener(new CarouselAdapter.OnItemClickListener(){

            public void onItemClick(CarouselAdapter<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(MainActivity.this, "Position=" + position, Toast.LENGTH_SHORT).show();
            }

        });

    }
}
