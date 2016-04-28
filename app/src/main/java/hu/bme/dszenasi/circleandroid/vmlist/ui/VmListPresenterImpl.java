package hu.bme.dszenasi.circleandroid.vmlist.ui;

import android.view.View;

import java.net.URI;
import java.util.List;

import cz.cesnet.cloud.occi.api.exception.CommunicationException;
import cz.cesnet.cloud.occi.core.Entity;
import hu.bme.dszenasi.circleandroid.vmlist.repository.IVmListRepository;

/**
 * Created by danielszenasi on 28/04/16.
 */
public class VmListPresenterImpl implements VmListPresenter{
    VmListView view;
    IVmListRepository vmListRepository;

    public VmListPresenterImpl(IVmListRepository vmListRepository) {
        this.vmListRepository = vmListRepository;
    }

    public void destroyView() {
        view=null;
    }

    public void setView(VmListView view) {
        this.view = view;
    }

    public void getAllCompute() {
        try {
            List<Entity> entities = vmListRepository.getAllCompute();
            view.computeLoaded(entities);
        } catch (CommunicationException e) {
            e.printStackTrace();
        }

    }

}
