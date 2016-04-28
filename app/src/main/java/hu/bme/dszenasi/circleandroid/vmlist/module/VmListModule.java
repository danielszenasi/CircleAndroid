package hu.bme.dszenasi.circleandroid.vmlist.module;

import dagger.Module;
import dagger.Provides;
import hu.bme.dszenasi.circleandroid.login.repository.ILoginRepository;
import hu.bme.dszenasi.circleandroid.login.repository.MockLoginRepository;
import hu.bme.dszenasi.circleandroid.login.ui.LoginPresenter;
import hu.bme.dszenasi.circleandroid.login.ui.LoginPresenterImpl;
import hu.bme.dszenasi.circleandroid.vmlist.repository.IVmListRepository;
import hu.bme.dszenasi.circleandroid.vmlist.repository.MockVmListRepository;
import hu.bme.dszenasi.circleandroid.vmlist.ui.VmListPresenter;
import hu.bme.dszenasi.circleandroid.vmlist.ui.VmListPresenterImpl;

/**
 * Created by mszenasi on 2016-04-28.
 */
@Module
public class VmListModule {

    @Provides
    public IVmListRepository providesVmListRepository() {
        return new MockVmListRepository();
    }
    @Provides
    public VmListPresenter providesVmListPresenter(IVmListRepository repository) {
        return new VmListPresenterImpl(repository);
    }

}
