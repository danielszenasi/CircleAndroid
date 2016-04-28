package hu.bme.dszenasi.circleandroid.vmlist.repository;

import java.net.URI;
import java.util.List;

import cz.cesnet.cloud.occi.api.exception.CommunicationException;
import cz.cesnet.cloud.occi.core.Entity;

/**
 * Created by danielszenasi on 28/04/16.
 */
public interface IVmListRepository {
    public List<Entity> getAllCompute() throws CommunicationException;
}
