package hu.bme.dszenasi.circleandroid.vmlist.ui;

/**
 * Created by mszenasi on 2016-04-28.
 */
public interface VmListPresenter {
     void setView(VmListView view);
     void destroyView();
     void getAllCompute();
}
