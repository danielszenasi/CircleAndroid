package hu.bme.dszenasi.circleandroid.vmlist.repository;

import java.net.URI;
import java.util.List;

import cz.cesnet.cloud.occi.api.Client;
import cz.cesnet.cloud.occi.api.exception.CommunicationException;
import cz.cesnet.cloud.occi.core.Entity;

/**
 * Created by danielszenasi on 28/04/16.
 */
public class VmListRepository implements IVmListRepository {

    private Client client;

    public List<Entity> getAllCompute() throws CommunicationException {
        return client.describe(URI.create("http://schemas.ogf.org/occi/infrastructure#compute"));
    }
}
