package ua.kh.rit;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

/**
 * Created by dimkas on 26.06.13.
 */
public class CBSectionsPageAdapter extends FragmentPagerAdapter {
    int pageCount;
    final String LOG_TAG = "myLogs";

    public CBSectionsPageAdapter(FragmentManager fm) {
        super(fm);
        Log.d(LOG_TAG, "sectionpageadapter constructor");
    }

    public CBSectionsPageAdapter(FragmentManager fm, int pageCount) {
        this(fm);
        Log.d(LOG_TAG, "sectionpageadapter constructor with pagecount");
        this.setCount(pageCount);
    }

    @Override
    public Fragment getItem(int position) {
        Log.d(LOG_TAG, "get fragment instance");
        return CBPageFragment.newInstance(position);
    }

    @Override
    public int getCount() {
        return pageCount;
    }

    public void setCount(int count) {
        pageCount = count;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Номера доступа";

            case 1:
                return "Пороги и гистерезисы";

            case 2:
                return "Электосчетчики и напряжения";

            case 3:
                return "Номера DATA и SMS";

            case 4:
                return "Времена, таймауты . АСКУЭ";

            default:
                return null;

        }

    }

}

