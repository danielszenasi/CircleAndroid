package hu.bme.dszenasi.circleandroid.login.repository;

import java.net.URI;
import java.util.List;

import cz.cesnet.cloud.occi.api.Authentication;
import cz.cesnet.cloud.occi.api.Client;
import cz.cesnet.cloud.occi.api.exception.CommunicationException;
import cz.cesnet.cloud.occi.api.http.HTTPClient;
import cz.cesnet.cloud.occi.api.http.auth.BasicAuthentication;
import cz.cesnet.cloud.occi.core.Entity;

/**
 * Created by mszenasi on 2016-04-26.
 */
public class LoginRepository implements ILoginRepository{

    public boolean isConnect() throws CommunicationException {

            Authentication authentication = new BasicAuthentication("admin", "retekretek");
            Client client = new HTTPClient(URI.create("https://vm.ik.bme.hu:15766/occi/"), authentication);
            return client.isConnected();

    }
}
