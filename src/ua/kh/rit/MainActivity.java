package ua.kh.rit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity implements View.OnClickListener {

    Button butConf;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        butConf = (Button) findViewById(R.id.butConfActiviry);
        butConf.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
           switch (v.getId()) {
               case R.id.butConfActiviry:
                   Intent intent = new Intent(this, ConfiguratorActivity.class);
                   startActivity(intent);
                   break;
               default:
                   break;
           }
    }
}
