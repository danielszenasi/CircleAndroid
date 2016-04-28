package hu.bme.dszenasi.circleandroid.vmlist.ui;

import java.util.List;

import cz.cesnet.cloud.occi.core.Entity;

/**
 * Created by mszenasi on 2016-04-28.
 */
public interface VmListView {
    void computeLoaded(List<Entity> entities);
}
