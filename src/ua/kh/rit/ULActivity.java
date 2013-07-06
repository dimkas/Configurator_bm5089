package ua.kh.rit;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;

import android.support.v4.view.ViewPager;
import android.util.Log;
import android.widget.ArrayAdapter;

/**
 * Created by dimkas on 24.06.13.
 */
public class ULActivity extends PagerActivity {
    final int PAGE_COUNT = 5;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ul);

        ActionBar bar = getActionBar();
        bar.setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, tabs);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        bar.setListNavigationCallbacks(adapter, this);
        Log.d("myLogs","setup select UL(0)");
        bar.setSelectedNavigationItem(0);

        mSectionPageAdapter = new CBSectionsPageAdapter(getSupportFragmentManager(), PAGE_COUNT);

        mViewPager = (ViewPager) findViewById(R.id.ul);
        mViewPager.setAdapter(mSectionPageAdapter);
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
    }

    @Override
    public boolean onNavigationItemSelected(int itemPosition, long itemId) {
        Log.d("myLogs", "selected position = " + itemPosition + " , id = " + itemId + ", " + tabs[itemPosition]);

        switch (itemPosition) {
            case 0:
                break;

            case 1:
//                intent = new Intent(this, ULActivity.class);
//                startActivity(intent);
                break;

            case 2:
                intent = new Intent(this, ConfiguratorActivity.class);
                startActivity(intent);
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
//                startActivity(intent);
                break;

            default:
                break;
        }
        return false;
    }
}