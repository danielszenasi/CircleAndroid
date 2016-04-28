package hu.bme.dszenasi.circleandroid.vmlist.repository;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import cz.cesnet.cloud.occi.core.Entity;
import cz.cesnet.cloud.occi.core.Kind;
import cz.cesnet.cloud.occi.exception.InvalidAttributeValueException;
import cz.cesnet.cloud.occi.infrastructure.Compute;
import cz.cesnet.cloud.occi.infrastructure.enumeration.Architecture;
import cz.cesnet.cloud.occi.infrastructure.enumeration.ComputeState;

/**
 * Created by danielszenasi on 28/04/16.
 */
public class MockVmListRepository implements IVmListRepository {
    public List<Entity> getAllCompute() {
        List<Entity> entities = new ArrayList<>();
        try {

            Kind kind = new Kind(new URI("http://schemas.ogf.org/occi/infrastructure#"), "compute");
            Compute compute1 = new Compute("0953b280-28ac-5d77-abe7-5fb67118c01c", kind);
            compute1.setHostname("Ubuntu 14.04 v8");
            compute1.setArchitecture(Architecture.X_64);
            compute1.setCores(1);
            compute1.setMemory(1024);
            compute1.setSpeed("normal");
            compute1.setState(ComputeState.INACTIVE);
            entities.add(compute1);
            Compute compute2 = new Compute("2750b280-28ac-5d77-abe7-5fb67118c01c", kind);
            compute2.setHostname("Ubuntu 14.04 v7");
            compute2.setArchitecture(Architecture.X_64);
            compute2.setCores(1);
            compute2.setMemory(1024);
            compute2.setSpeed("normal");
            compute2.setState(ComputeState.SUSPENDED);
            entities.add(compute2);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (InvalidAttributeValueException e) {
            e.printStackTrace();
        }
        return entities;
    }
}
