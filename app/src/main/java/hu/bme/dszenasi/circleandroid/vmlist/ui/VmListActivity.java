package hu.bme.dszenasi.circleandroid.vmlist.ui;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.List;

import javax.inject.Inject;

import cz.cesnet.cloud.occi.core.Entity;
import hu.bme.dszenasi.circleandroid.MyApplication;
import hu.bme.dszenasi.circleandroid.R;
import hu.bme.dszenasi.circleandroid.vmlist.adapter.VmAdapter;

/**
 * Created by mszenasi on 2016-04-26.
 */
public class VmListActivity extends AppCompatActivity implements VmListView{

    ListView listView;
    VmAdapter vmAdapter;
    @Inject
    VmListPresenter vmListPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vmlist_activity);
        injectDependencies();
        vmListPresenter.setView(this);
        listView=(ListView) findViewById(R.id.listView);
        vmListPresenter.getAllCompute();
    }

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);


    }

    @Override
    protected void onDestroy() {
        vmListPresenter.destroyView();
        super.onDestroy();
    }

    @Override
    public void computeLoaded(List<Entity> entities) {
        vmAdapter=new VmAdapter(this,R.layout.vmlist_item,entities);
        listView.setAdapter(vmAdapter);
    }
    protected void injectDependencies() {
        ((MyApplication) getApplication()).getVmListComponent().inject(this);
    }
}
