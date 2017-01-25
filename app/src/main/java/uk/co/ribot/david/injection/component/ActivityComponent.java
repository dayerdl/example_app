package uk.co.ribot.david.injection.component;

import dagger.Subcomponent;
import uk.co.ribot.david.injection.PerActivity;
import uk.co.ribot.david.injection.module.ActivityModule;
import uk.co.ribot.david.ui.main.MainActivity;

/**
 * This component inject dependencies to all Activities across the application
 */
@PerActivity
@Subcomponent(modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

}
