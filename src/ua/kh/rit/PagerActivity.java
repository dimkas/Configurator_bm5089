package ua.kh.rit;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

/**
 * Created by dimkas on 26.06.13.
 */
public abstract class PagerActivity extends FragmentActivity implements ActionBar.OnNavigationListener {

    final String LOG_TAG = "myLogs";
    String[] tabs = new String[]{"UL", "Register modules", "Config Blocks"};
    Intent intent;
    ViewPager mViewPager;
    CBSectionsPageAdapter mSectionPageAdapter;

//    public abstract void onCreate(Bundle savedInstanceState);

    @Override
    public abstract boolean onNavigationItemSelected(int itemPosition, long itemId);
}
