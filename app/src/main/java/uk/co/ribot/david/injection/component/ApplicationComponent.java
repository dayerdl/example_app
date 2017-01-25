package uk.co.ribot.david.injection.component;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import uk.co.ribot.david.data.DataManager;
import uk.co.ribot.david.data.SyncService;
import uk.co.ribot.david.data.local.DatabaseHelper;
import uk.co.ribot.david.data.local.PreferencesHelper;
import uk.co.ribot.david.data.remote.RibotsService;
import uk.co.ribot.david.injection.ApplicationContext;
import uk.co.ribot.david.injection.module.ApplicationModule;
import uk.co.ribot.david.util.RxEventBus;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(SyncService syncService);

    @ApplicationContext
    Context context();
    Application application();
    RibotsService ribotsService();
    PreferencesHelper preferencesHelper();
    DatabaseHelper databaseHelper();
    DataManager dataManager();
    RxEventBus eventBus();

}
