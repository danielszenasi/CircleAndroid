package hu.bme.dszenasi.circleandroid.login.repository;

import java.net.URI;
import java.util.List;

import cz.cesnet.cloud.occi.api.Client;
import cz.cesnet.cloud.occi.api.exception.CommunicationException;
import cz.cesnet.cloud.occi.core.Entity;

/**
 * Created by danielszenasi on 27/04/16.
 */
public interface ILoginRepository {
    boolean isConnect() throws CommunicationException;
}
