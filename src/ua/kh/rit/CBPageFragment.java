package ua.kh.rit;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Random;

/**
 * Created by dimkas on 26.06.13.
 */
public class CBPageFragment extends Fragment{
    static final String ARGUMENT_PAGE_NUMBER = "arg_page_number";
    static final String LOG_TAG = "myLogs";

    int pageNumber;
    int bgColor;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.d(LOG_TAG, "create fragment");
        super.onCreate(savedInstanceState);
        pageNumber = getArguments().getInt(ARGUMENT_PAGE_NUMBER);
        Random rnd = new Random();
        bgColor = Color.argb(40, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view;
        switch (pageNumber) {
            case 0:
                Log.d(LOG_TAG, "fragment " + pageNumber);
                view = inflater.inflate(R.layout.cb0, null);
                Log.d(LOG_TAG, "get listview id on fragment " + pageNumber);
                ListView naListView = (ListView) view.findViewById(R.id.naListView);
                Log.d(LOG_TAG, "set multiply choice mode on list view");
                naListView.setChoiceMode(naListView.CHOICE_MODE_MULTIPLE);

                Log.d(LOG_TAG, "Create arayadapter on fragment " + pageNumber);
                ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity().getApplicationContext(), R.array.acessNumber, android.R.layout.simple_list_item_multiple_choice);

                naListView.setAdapter(adapter);
                Log.d(LOG_TAG, "fragment " + pageNumber + " created");
                return view;
            case 1:
                Log.d(LOG_TAG, "fragment " + pageNumber);
                view = inflater.inflate(R.layout.cb1, null);
                return view;
            case 2:
                Log.d(LOG_TAG, "fragment " + pageNumber);
                view = inflater.inflate(R.layout.cb2, null);
                return view;
            case 3:
                Log.d(LOG_TAG, "fragment " + pageNumber);
                view = inflater.inflate(R.layout.cb3, null);
                return view;
            case 4:
                Log.d(LOG_TAG, "fragment " + pageNumber);
                view = inflater.inflate(R.layout.cb4, null);
                return view;
            default:
                return null;

        }
        /*
        view = inflater.inflate(R.layout.ul0, null);
        Log.d(LOG_TAG, "textvewul0");
        TextView tv = (TextView)view.findViewById(R.id.textViewUL0);
        tv.setText("Page " + pageNumber);
        tv.setBackgroundColor(bgColor);
        return view;
        */
    }

    public CBPageFragment(){
        super();
    }

    static CBPageFragment newInstance(int page) {
        Log.d(LOG_TAG, "new instance fragment");
        CBPageFragment cbPageFragment = new CBPageFragment();
        Bundle arguments = new Bundle();
        arguments.putInt(ARGUMENT_PAGE_NUMBER, page);
        cbPageFragment.setArguments(arguments);
        return cbPageFragment;
    }
}
