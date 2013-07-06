package ua.kh.rit;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.widget.ArrayAdapter;

/**
 * Created by dimkas on 18.06.13.
 */
public class ConfiguratorActivity extends PagerActivity implements ActionBar.OnNavigationListener{
    final int PAGE_COUNT = 5;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cb);

        ActionBar bar = getActionBar();
        bar.setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, tabs);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        bar.setListNavigationCallbacks(adapter, this);
        Log.d("myLogs", "Setup select conf(2)");
        bar.setSelectedNavigationItem(2);
        mSectionPageAdapter = new CBSectionsPageAdapter(getSupportFragmentManager(), PAGE_COUNT);
        Log.d(LOG_TAG, "setup view pager");
        mViewPager = (ViewPager) findViewById(R.id.cb);
        Log.d(LOG_TAG, "set adapter for viewpager");
        mViewPager.setAdapter(mSectionPageAdapter);
        Log.d(LOG_TAG, "set lisenner for viewpager");
        mViewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i2) {

            }

            @Override
            public void onPageSelected(int position) {
                Log.d(LOG_TAG, "onPageSelected, position = " + position);
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
        Log.d(LOG_TAG, "end method onCreate");
    }

    @Override
    public boolean onNavigationItemSelected(int itemPosition, long itemId) {
        Log.d("myLogs", "selected position = " + itemPosition + " , id = " + itemId + ", " + tabs[itemPosition]);


        switch (itemPosition) {
            case 0:
                intent = new Intent(this, ULActivity.class);
                startActivity(intent);
                break;

            case 1:
//                intent = new Intent(this, ULActivity.class);
//                startActivity(intent);
                break;

            case 2:
//                intent = new Intent(this, ConfiguratorActivity.class);
//                startActivity(intent);
                break;

            case 3:
//                intent = new Intent(this, ULActivity.class);
//                startActivity(intent);
                break;

            case 4:
//                intent = new Intent(this, ULActivity.class);
//                startActivity(intent);
                break;

            case 5:
//                intent = new Intent(this, ULActivity.class);
//                startActivity(intent);
                break;

            case 6:
//                intent = new Intent(this, ULActivity.class);
//                startActivity(intent);
                break;

            case 7:
//                intent = new Intent(this, ULActivity.class);
//               startActivity(intent);
                break;

            default:
                break;
        }

        return false;
    }
}