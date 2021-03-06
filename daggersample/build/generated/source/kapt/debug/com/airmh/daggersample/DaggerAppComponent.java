// Generated by Dagger (https://google.github.io/dagger).
package com.airmh.daggersample;

import android.app.Activity;
import android.app.Fragment;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.support.v4.app.FragmentManager;
import com.airmh.anakin.daggertest.test4.Test4Fragment;
import com.airmh.anakin.daggertest.test4.Test4Fragment_Factory;
import com.airmh.anakin.daggertest.test4.Test4Fragment_MembersInjector;
import com.airmh.anakin.daggertest.test4.Test4InjectClass;
import com.airmh.anakin.daggertest.test4.di.Test4ActivityModule;
import com.airmh.anakin.daggertest.test4.di.Test4ActivityModule_FragmentManagerFactory;
import com.airmh.anakin.daggertest.test4.di.Test4FragmentModule;
import com.airmh.anakin.daggertest.test4.di.Test4FragmentModule_CreateTestClassFactory;
import com.airmh.anakin.daggertest.test4.di.Test4FragmentProvider_BindTest4Fragment;
import com.airmh.daggersample.test2.Test2Activity;
import com.airmh.daggersample.test2.Test2Activity_MembersInjector;
import com.airmh.daggersample.test2.di.Test2SubComponent;
import com.airmh.daggersample.test2.di.Test2SubModule;
import com.airmh.daggersample.test2.di.Test2SubModule_CreateTestClassFactory;
import com.airmh.daggersample.test3.Test3Activity;
import com.airmh.daggersample.test3.Test3Activity_MembersInjector;
import com.airmh.daggersample.test3.di.Test3InjectorModule;
import com.airmh.daggersample.test3.di.Test3InjectorModule_CreateTestClassFactory;
import com.airmh.daggersample.test3.di.Test3Module_BindTest3Activity;
import com.airmh.daggersample.test4.Test4Activity;
import com.airmh.daggersample.test4.Test4Activity_MembersInjector;
import com.airmh.daggersample.test4.di.Test4Module_BindTest4Activity;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import dagger.android.DaggerApplication_MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.DispatchingAndroidInjector_Factory;
import dagger.android.support.DaggerAppCompatActivity_MembersInjector;
import dagger.android.support.DaggerFragment_MembersInjector;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import javax.inject.Provider;

public final class DaggerAppComponent implements AppComponent {
  private Provider<Test2SubComponent.Builder> test2SubComponentBuilderProvider;

  private Provider<Test3Module_BindTest3Activity.Test3ActivitySubcomponent.Builder>
      test3ActivitySubcomponentBuilderProvider;

  private Provider<Test4Module_BindTest4Activity.Test4ActivitySubcomponent.Builder>
      test4ActivitySubcomponentBuilderProvider;

  private DaggerAppComponent(Builder builder) {

    initialize(builder);
  }

  public static AppComponent.Builder builder() {
    return new Builder();
  }

  private Map<Class<?>, Provider<AndroidInjector.Factory<?>>>
      getMapOfClassOfAndProviderOfFactoryOf() {
    return MapBuilder.<Class<?>, Provider<AndroidInjector.Factory<?>>>newMapBuilder(3)
        .put(Test2Activity.class, (Provider) test2SubComponentBuilderProvider)
        .put(Test3Activity.class, (Provider) test3ActivitySubcomponentBuilderProvider)
        .put(Test4Activity.class, (Provider) test4ActivitySubcomponentBuilderProvider)
        .build();
  }

  private DispatchingAndroidInjector<Activity> getDispatchingAndroidInjectorOfActivity() {
    return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
        getMapOfClassOfAndProviderOfFactoryOf(),
        Collections.<String, Provider<AndroidInjector.Factory<?>>>emptyMap());
  }

  private DispatchingAndroidInjector<BroadcastReceiver>
      getDispatchingAndroidInjectorOfBroadcastReceiver() {
    return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
        getMapOfClassOfAndProviderOfFactoryOf(),
        Collections.<String, Provider<AndroidInjector.Factory<?>>>emptyMap());
  }

  private DispatchingAndroidInjector<Fragment> getDispatchingAndroidInjectorOfFragment() {
    return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
        getMapOfClassOfAndProviderOfFactoryOf(),
        Collections.<String, Provider<AndroidInjector.Factory<?>>>emptyMap());
  }

  private DispatchingAndroidInjector<Service> getDispatchingAndroidInjectorOfService() {
    return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
        getMapOfClassOfAndProviderOfFactoryOf(),
        Collections.<String, Provider<AndroidInjector.Factory<?>>>emptyMap());
  }

  private DispatchingAndroidInjector<ContentProvider>
      getDispatchingAndroidInjectorOfContentProvider() {
    return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
        getMapOfClassOfAndProviderOfFactoryOf(),
        Collections.<String, Provider<AndroidInjector.Factory<?>>>emptyMap());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.test2SubComponentBuilderProvider =
        new Provider<Test2SubComponent.Builder>() {
          @Override
          public Test2SubComponent.Builder get() {
            return new Test2SubComponentBuilder();
          }
        };
    this.test3ActivitySubcomponentBuilderProvider =
        new Provider<Test3Module_BindTest3Activity.Test3ActivitySubcomponent.Builder>() {
          @Override
          public Test3Module_BindTest3Activity.Test3ActivitySubcomponent.Builder get() {
            return new Test3ActivitySubcomponentBuilder();
          }
        };
    this.test4ActivitySubcomponentBuilderProvider =
        new Provider<Test4Module_BindTest4Activity.Test4ActivitySubcomponent.Builder>() {
          @Override
          public Test4Module_BindTest4Activity.Test4ActivitySubcomponent.Builder get() {
            return new Test4ActivitySubcomponentBuilder();
          }
        };
  }

  @Override
  public void inject(DaggerApplication arg0) {
    injectDaggerApplication(arg0);
  }

  private DaggerApplication injectDaggerApplication(DaggerApplication instance) {
    DaggerApplication_MembersInjector.injectActivityInjector(
        instance, getDispatchingAndroidInjectorOfActivity());
    DaggerApplication_MembersInjector.injectBroadcastReceiverInjector(
        instance, getDispatchingAndroidInjectorOfBroadcastReceiver());
    DaggerApplication_MembersInjector.injectFragmentInjector(
        instance, getDispatchingAndroidInjectorOfFragment());
    DaggerApplication_MembersInjector.injectServiceInjector(
        instance, getDispatchingAndroidInjectorOfService());
    DaggerApplication_MembersInjector.injectContentProviderInjector(
        instance, getDispatchingAndroidInjectorOfContentProvider());
    DaggerApplication_MembersInjector.injectSetInjected(instance);
    return instance;
  }

  private static final class Builder implements AppComponent.Builder {
    private DaggerApplication applicationBind;

    @Override
    public AppComponent build() {
      Preconditions.checkBuilderRequirement(applicationBind, DaggerApplication.class);
      return new DaggerAppComponent(this);
    }

    @Override
    public Builder applicationBind(DaggerApplication application) {
      this.applicationBind = Preconditions.checkNotNull(application);
      return this;
    }
  }

  private final class Test2SubComponentBuilder extends Test2SubComponent.Builder {
    private Test2SubModule test2SubModule;

    private Test2Activity seedInstance;

    @Override
    public Test2SubComponent build() {
      if (test2SubModule == null) {
        this.test2SubModule = new Test2SubModule();
      }
      Preconditions.checkBuilderRequirement(seedInstance, Test2Activity.class);
      return new Test2SubComponentImpl(this);
    }

    @Override
    public void seedInstance(Test2Activity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class Test2SubComponentImpl implements Test2SubComponent {
    private Test2SubModule test2SubModule;

    private Test2SubComponentImpl(Test2SubComponentBuilder builder) {
      this.test2SubModule = builder.test2SubModule;
    }

    @Override
    public void inject(Test2Activity arg0) {
      injectTest2Activity(arg0);
    }

    private Test2Activity injectTest2Activity(Test2Activity instance) {
      Test2Activity_MembersInjector.injectTest2InjectClass(
          instance, Test2SubModule_CreateTestClassFactory.proxyCreateTestClass(test2SubModule));
      return instance;
    }
  }

  private final class Test3ActivitySubcomponentBuilder
      extends Test3Module_BindTest3Activity.Test3ActivitySubcomponent.Builder {
    private Test3InjectorModule test3InjectorModule;

    private Test3Activity seedInstance;

    @Override
    public Test3Module_BindTest3Activity.Test3ActivitySubcomponent build() {
      if (test3InjectorModule == null) {
        this.test3InjectorModule = new Test3InjectorModule();
      }
      Preconditions.checkBuilderRequirement(seedInstance, Test3Activity.class);
      return new Test3ActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(Test3Activity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class Test3ActivitySubcomponentImpl
      implements Test3Module_BindTest3Activity.Test3ActivitySubcomponent {
    private Test3InjectorModule test3InjectorModule;

    private Test3ActivitySubcomponentImpl(Test3ActivitySubcomponentBuilder builder) {
      this.test3InjectorModule = builder.test3InjectorModule;
    }

    private DispatchingAndroidInjector<android.support.v4.app.Fragment>
        getDispatchingAndroidInjectorOfFragment() {
      return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
          DaggerAppComponent.this.getMapOfClassOfAndProviderOfFactoryOf(),
          Collections.<String, Provider<AndroidInjector.Factory<?>>>emptyMap());
    }

    @Override
    public void inject(Test3Activity arg0) {
      injectTest3Activity(arg0);
    }

    private Test3Activity injectTest3Activity(Test3Activity instance) {
      DaggerAppCompatActivity_MembersInjector.injectSupportFragmentInjector(
          instance, getDispatchingAndroidInjectorOfFragment());
      DaggerAppCompatActivity_MembersInjector.injectFrameworkFragmentInjector(
          instance, DaggerAppComponent.this.getDispatchingAndroidInjectorOfFragment());
      Test3Activity_MembersInjector.injectTest3InjectClass(
          instance,
          Test3InjectorModule_CreateTestClassFactory.proxyCreateTestClass(test3InjectorModule));
      return instance;
    }
  }

  private final class Test4ActivitySubcomponentBuilder
      extends Test4Module_BindTest4Activity.Test4ActivitySubcomponent.Builder {
    private Test4ActivityModule test4ActivityModule;

    private Test4Activity seedInstance;

    @Override
    public Test4Module_BindTest4Activity.Test4ActivitySubcomponent build() {
      if (test4ActivityModule == null) {
        this.test4ActivityModule = new Test4ActivityModule();
      }
      Preconditions.checkBuilderRequirement(seedInstance, Test4Activity.class);
      return new Test4ActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(Test4Activity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class Test4ActivitySubcomponentImpl
      implements Test4Module_BindTest4Activity.Test4ActivitySubcomponent {
    private Test4Activity seedInstance;

    private Test4ActivityModule test4ActivityModule;

    private Provider<Test4FragmentProvider_BindTest4Fragment.Test4FragmentSubcomponent.Builder>
        test4FragmentSubcomponentBuilderProvider;

    private Test4ActivitySubcomponentImpl(Test4ActivitySubcomponentBuilder builder) {
      this.seedInstance = builder.seedInstance;
      this.test4ActivityModule = builder.test4ActivityModule;
      initialize(builder);
    }

    private Map<Class<?>, Provider<AndroidInjector.Factory<?>>>
        getMapOfClassOfAndProviderOfFactoryOf() {
      return MapBuilder.<Class<?>, Provider<AndroidInjector.Factory<?>>>newMapBuilder(4)
          .put(
              Test2Activity.class,
              (Provider) DaggerAppComponent.this.test2SubComponentBuilderProvider)
          .put(
              Test3Activity.class,
              (Provider) DaggerAppComponent.this.test3ActivitySubcomponentBuilderProvider)
          .put(
              Test4Activity.class,
              (Provider) DaggerAppComponent.this.test4ActivitySubcomponentBuilderProvider)
          .put(Test4Fragment.class, (Provider) test4FragmentSubcomponentBuilderProvider)
          .build();
    }

    private DispatchingAndroidInjector<android.support.v4.app.Fragment>
        getDispatchingAndroidInjectorOfFragment() {
      return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
          getMapOfClassOfAndProviderOfFactoryOf(),
          Collections.<String, Provider<AndroidInjector.Factory<?>>>emptyMap());
    }

    private DispatchingAndroidInjector<Fragment> getDispatchingAndroidInjectorOfFragment2() {
      return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
          getMapOfClassOfAndProviderOfFactoryOf(),
          Collections.<String, Provider<AndroidInjector.Factory<?>>>emptyMap());
    }

    private FragmentManager getFragmentManager() {
      return Test4ActivityModule_FragmentManagerFactory.proxyFragmentManager(
          test4ActivityModule, seedInstance);
    }

    private Test4Fragment getTest4Fragment() {
      return injectTest4Fragment(Test4Fragment_Factory.newTest4Fragment());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final Test4ActivitySubcomponentBuilder builder) {
      this.test4FragmentSubcomponentBuilderProvider =
          new Provider<
              Test4FragmentProvider_BindTest4Fragment.Test4FragmentSubcomponent.Builder>() {
            @Override
            public Test4FragmentProvider_BindTest4Fragment.Test4FragmentSubcomponent.Builder get() {
              return new Test4FragmentSubcomponentBuilder();
            }
          };
    }

    @Override
    public void inject(Test4Activity arg0) {
      injectTest4Activity(arg0);
    }

    private Test4Fragment injectTest4Fragment(Test4Fragment instance) {
      DaggerFragment_MembersInjector.injectChildFragmentInjector(
          instance, getDispatchingAndroidInjectorOfFragment());
      Test4Fragment_MembersInjector.injectTest4InjectClass(instance, new Test4InjectClass());
      return instance;
    }

    private Test4Activity injectTest4Activity(Test4Activity instance) {
      DaggerAppCompatActivity_MembersInjector.injectSupportFragmentInjector(
          instance, getDispatchingAndroidInjectorOfFragment());
      DaggerAppCompatActivity_MembersInjector.injectFrameworkFragmentInjector(
          instance, getDispatchingAndroidInjectorOfFragment2());
      Test4Activity_MembersInjector.injectFm(instance, getFragmentManager());
      Test4Activity_MembersInjector.injectTest4Fragment(instance, getTest4Fragment());
      return instance;
    }

    private final class Test4FragmentSubcomponentBuilder
        extends Test4FragmentProvider_BindTest4Fragment.Test4FragmentSubcomponent.Builder {
      private Test4FragmentModule test4FragmentModule;

      private Test4Fragment seedInstance;

      @Override
      public Test4FragmentProvider_BindTest4Fragment.Test4FragmentSubcomponent build() {
        if (test4FragmentModule == null) {
          this.test4FragmentModule = new Test4FragmentModule();
        }
        Preconditions.checkBuilderRequirement(seedInstance, Test4Fragment.class);
        return new Test4FragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(Test4Fragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class Test4FragmentSubcomponentImpl
        implements Test4FragmentProvider_BindTest4Fragment.Test4FragmentSubcomponent {
      private Test4FragmentModule test4FragmentModule;

      private Test4FragmentSubcomponentImpl(Test4FragmentSubcomponentBuilder builder) {
        this.test4FragmentModule = builder.test4FragmentModule;
      }

      @Override
      public void inject(Test4Fragment arg0) {
        injectTest4Fragment(arg0);
      }

      private Test4Fragment injectTest4Fragment(Test4Fragment instance) {
        DaggerFragment_MembersInjector.injectChildFragmentInjector(
            instance, Test4ActivitySubcomponentImpl.this.getDispatchingAndroidInjectorOfFragment());
        Test4Fragment_MembersInjector.injectTest4InjectClass(
            instance,
            Test4FragmentModule_CreateTestClassFactory.proxyCreateTestClass(test4FragmentModule));
        return instance;
      }
    }
  }
}
