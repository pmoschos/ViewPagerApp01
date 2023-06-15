package gr.aueb.cf.viewpagerapp01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialize our ViewPager
        viewPager = findViewById(R.id.viewPager);


        // we are setting our Adapter
        viewPager.setAdapter(new MyPagerAdapter(this));

    }
}