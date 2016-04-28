package hu.bme.dszenasi.circleandroid.vmlist.ui;

import java.net.URI;
import java.util.List;

import cz.cesnet.cloud.occi.api.exception.CommunicationException;
import cz.cesnet.cloud.occi.core.Entity;
import hu.bme.dszenasi.circleandroid.vmlist.repository.IVmListRepository;

/**
 * Created by danielszenasi on 28/04/16.
 */
public class VmListPresenterImpl {
    IVmListRepository vmListRepository;
    public void login() {
        try {
            List<Entity> entities = vmListRepository.getAllCompute();
        } catch (CommunicationException e) {
            e.printStackTrace();
        }

    }

}
