package hu.bme.dszenasi.circleandroid.vmlist;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

import hu.bme.dszenasi.circleandroid.R;

/**
 * Created by mszenasi on 2016-04-26.
 */
public class VmListActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.vmlist_activity);
    }
}
