package uk.co.ribot.androidtest.test.common.injection.component;

import javax.inject.Singleton;

import dagger.Component;
import uk.co.ribot.androidtest.injection.component.ApplicationComponent;
import uk.co.ribot.androidtest.test.common.injection.module.ApplicationTestModule;

@Singleton
@Component(modules = ApplicationTestModule.class)
public interface TestComponent extends ApplicationComponent {

}
