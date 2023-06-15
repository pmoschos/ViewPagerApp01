package gr.aueb.cf.viewpagerapp01;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.PagerAdapter;

public class MyPagerAdapter extends PagerAdapter {


    private Context context;

    public MyPagerAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        //return super.instantiateItem(container, position);
        MyModel myModel = MyModel.values()[position];
        LayoutInflater layoutInflater = LayoutInflater.from(context);

        ViewGroup viewGroup = (ViewGroup) layoutInflater.inflate(myModel.getmLayoutID(), container, false);

        container.addView(viewGroup);

        return viewGroup;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

    @Override
    public int getCount() {
        return MyModel.values().length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        MyModel customPagerEnum = MyModel.values()[position];
        return context.getString(customPagerEnum.getmTitleID());
    }
}
