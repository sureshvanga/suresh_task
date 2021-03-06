// Generated by Dagger (https://dagger.dev).
package com.demo.suresh;

import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.hilt.work.HiltWorkerFactory;
import androidx.hilt.work.HiltWrapper_WorkerFactoryModule;
import androidx.hilt.work.WorkerAssistedFactory;
import androidx.hilt.work.WorkerFactoryModule_ProvideFactoryFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.demo.suresh.db.AppDao;
import com.demo.suresh.db.AppDatabase;
import com.demo.suresh.di.AppModule;
import com.demo.suresh.di.AppModule_GetAppDaoFactory;
import com.demo.suresh.di.AppModule_GetAppDatabaseFactory;
import com.demo.suresh.di.AppModule_GetRetroInstanceFactory;
import com.demo.suresh.di.AppModule_GetRetroServiceInstanceFactory;
import com.demo.suresh.di.AppModule_ProvidesHttpLoggingInterceptorFactory;
import com.demo.suresh.di.AppModule_ProvidesOkHttpClientFactory;
import com.demo.suresh.network.RetroRepository;
import com.demo.suresh.network.RetroServiceInterface;
import com.demo.suresh.viewmodel.MainActivityViewModel;
import com.demo.suresh.viewmodel.MainActivityViewModel_HiltModules_KeyModule_ProvideFactory;
import com.demo.suresh.workmanger.MyWorkManger;
import com.demo.suresh.workmanger.MyWorkManger_AssistedFactory;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_Lifecycle_Factory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerMyApplication_HiltComponents_SingletonC extends MyApplication_HiltComponents.SingletonC {
  private final AppModule appModule;

  private final ApplicationContextModule applicationContextModule;

  private volatile Object httpLoggingInterceptor = new MemoizedSentinel();

  private volatile Object okHttpClient = new MemoizedSentinel();

  private volatile Object retrofit = new MemoizedSentinel();

  private volatile Object retroServiceInterface = new MemoizedSentinel();

  private volatile Object appDatabase = new MemoizedSentinel();

  private volatile Object appDao = new MemoizedSentinel();

  private volatile Provider<MyWorkManger_AssistedFactory> myWorkManger_AssistedFactoryProvider;

  private DaggerMyApplication_HiltComponents_SingletonC(AppModule appModuleParam,
      ApplicationContextModule applicationContextModuleParam) {
    this.appModule = appModuleParam;
    this.applicationContextModule = applicationContextModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private HttpLoggingInterceptor httpLoggingInterceptor() {
    Object local = httpLoggingInterceptor;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = httpLoggingInterceptor;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvidesHttpLoggingInterceptorFactory.providesHttpLoggingInterceptor(appModule);
          httpLoggingInterceptor = DoubleCheck.reentrantCheck(httpLoggingInterceptor, local);
        }
      }
    }
    return (HttpLoggingInterceptor) local;
  }

  private OkHttpClient okHttpClient() {
    Object local = okHttpClient;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = okHttpClient;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvidesOkHttpClientFactory.providesOkHttpClient(appModule, httpLoggingInterceptor());
          okHttpClient = DoubleCheck.reentrantCheck(okHttpClient, local);
        }
      }
    }
    return (OkHttpClient) local;
  }

  private Retrofit retrofit() {
    Object local = retrofit;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = retrofit;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_GetRetroInstanceFactory.getRetroInstance(appModule, okHttpClient());
          retrofit = DoubleCheck.reentrantCheck(retrofit, local);
        }
      }
    }
    return (Retrofit) local;
  }

  private RetroServiceInterface retroServiceInterface() {
    Object local = retroServiceInterface;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = retroServiceInterface;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_GetRetroServiceInstanceFactory.getRetroServiceInstance(appModule, retrofit());
          retroServiceInterface = DoubleCheck.reentrantCheck(retroServiceInterface, local);
        }
      }
    }
    return (RetroServiceInterface) local;
  }

  private AppDatabase appDatabase() {
    Object local = appDatabase;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = appDatabase;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_GetAppDatabaseFactory.getAppDatabase(appModule, ApplicationContextModule_ProvideApplicationFactory.provideApplication(applicationContextModule));
          appDatabase = DoubleCheck.reentrantCheck(appDatabase, local);
        }
      }
    }
    return (AppDatabase) local;
  }

  private AppDao appDao() {
    Object local = appDao;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = appDao;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_GetAppDaoFactory.getAppDao(appModule, appDatabase());
          appDao = DoubleCheck.reentrantCheck(appDao, local);
        }
      }
    }
    return (AppDao) local;
  }

  private RetroRepository retroRepository() {
    return new RetroRepository(retroServiceInterface(), appDao());
  }

  private MyWorkManger myWorkManger(Context appContext, WorkerParameters params) {
    return new MyWorkManger(appContext, params, retroRepository());
  }

  private MyWorkManger_AssistedFactory myWorkManger_AssistedFactory() {
    return new MyWorkManger_AssistedFactory() {
      @Override
      public MyWorkManger create(Context appContext, WorkerParameters params) {
        return DaggerMyApplication_HiltComponents_SingletonC.this.myWorkManger(appContext, params);
      }
    };
  }

  private Provider<MyWorkManger_AssistedFactory> myWorkManger_AssistedFactoryProvider() {
    Object local = myWorkManger_AssistedFactoryProvider;
    if (local == null) {
      local = new SwitchingProvider<>(0);
      myWorkManger_AssistedFactoryProvider = (Provider<MyWorkManger_AssistedFactory>) local;
    }
    return (Provider<MyWorkManger_AssistedFactory>) local;
  }

  private Map<String, Provider<WorkerAssistedFactory<? extends ListenableWorker>>> mapOfStringAndProviderOfWorkerAssistedFactoryOf(
      ) {
    return Collections.<String, Provider<WorkerAssistedFactory<? extends ListenableWorker>>>singletonMap("com.demo.suresh.workmanger.MyWorkManger", (Provider) myWorkManger_AssistedFactoryProvider());
  }

  private HiltWorkerFactory hiltWorkerFactory() {
    return WorkerFactoryModule_ProvideFactoryFactory.provideFactory(mapOfStringAndProviderOfWorkerAssistedFactoryOf());
  }

  @Override
  public void injectMyApplication(MyApplication myApplication) {
    injectMyApplication2(myApplication);
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();
  }

  private MyApplication injectMyApplication2(MyApplication instance) {
    MyApplication_MembersInjector.injectWorkerFactory(instance, hiltWorkerFactory());
    return instance;
  }

  public static final class Builder {
    private AppModule appModule;

    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    public Builder appModule(AppModule appModule) {
      this.appModule = Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder hiltWrapper_WorkerFactoryModule(
        HiltWrapper_WorkerFactoryModule hiltWrapper_WorkerFactoryModule) {
      Preconditions.checkNotNull(hiltWrapper_WorkerFactoryModule);
      return this;
    }

    public MyApplication_HiltComponents.SingletonC build() {
      if (appModule == null) {
        this.appModule = new AppModule();
      }
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new DaggerMyApplication_HiltComponents_SingletonC(appModule, applicationContextModule);
    }
  }

  private final class ActivityRetainedCBuilder implements MyApplication_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public MyApplication_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends MyApplication_HiltComponents.ActivityRetainedC {
    private volatile Object lifecycle = new MemoizedSentinel();

    private ActivityRetainedCImpl() {

    }

    private Object lifecycle() {
      Object local = lifecycle;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = lifecycle;
          if (local instanceof MemoizedSentinel) {
            local = ActivityRetainedComponentManager_Lifecycle_Factory.newInstance();
            lifecycle = DoubleCheck.reentrantCheck(lifecycle, local);
          }
        }
      }
      return (Object) local;
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return (ActivityRetainedLifecycle) lifecycle();
    }

    private final class ActivityCBuilder implements MyApplication_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity activity) {
        this.activity = Preconditions.checkNotNull(activity);
        return this;
      }

      @Override
      public MyApplication_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends MyApplication_HiltComponents.ActivityC {
      private ActivityCImpl(Activity activity) {

      }

      @Override
      public void injectMainActivity(MainActivity mainActivity) {
      }

      @Override
      public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
        return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerMyApplication_HiltComponents_SingletonC.this.applicationContextModule), getViewModelKeys(), new ViewModelCBuilder());
      }

      @Override
      public Set<String> getViewModelKeys() {
        return Collections.<String>singleton(MainActivityViewModel_HiltModules_KeyModule_ProvideFactory.provide());
      }

      @Override
      public ViewModelComponentBuilder getViewModelComponentBuilder() {
        return new ViewModelCBuilder();
      }

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();
      }

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();
      }

      private final class FragmentCBuilder implements MyApplication_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment fragment) {
          this.fragment = Preconditions.checkNotNull(fragment);
          return this;
        }

        @Override
        public MyApplication_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCI(fragment);
        }
      }

      private final class FragmentCI extends MyApplication_HiltComponents.FragmentC {
        private FragmentCI(Fragment fragment) {

        }

        @Override
        public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
          return ActivityCImpl.this.getHiltInternalFactoryFactory();
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();
        }

        private final class ViewWithFragmentCBuilder implements MyApplication_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View view) {
            this.view = Preconditions.checkNotNull(view);
            return this;
          }

          @Override
          public MyApplication_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCI(view);
          }
        }

        private final class ViewWithFragmentCI extends MyApplication_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCI(View view) {

          }
        }
      }

      private final class ViewCBuilder implements MyApplication_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View view) {
          this.view = Preconditions.checkNotNull(view);
          return this;
        }

        @Override
        public MyApplication_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCI(view);
        }
      }

      private final class ViewCI extends MyApplication_HiltComponents.ViewC {
        private ViewCI(View view) {

        }
      }
    }

    private final class ViewModelCBuilder implements MyApplication_HiltComponents.ViewModelC.Builder {
      private SavedStateHandle savedStateHandle;

      @Override
      public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
        this.savedStateHandle = Preconditions.checkNotNull(handle);
        return this;
      }

      @Override
      public MyApplication_HiltComponents.ViewModelC build() {
        Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
        return new ViewModelCImpl(savedStateHandle);
      }
    }

    private final class ViewModelCImpl extends MyApplication_HiltComponents.ViewModelC {
      private volatile Provider<MainActivityViewModel> mainActivityViewModelProvider;

      private ViewModelCImpl(SavedStateHandle savedStateHandle) {

      }

      private MainActivityViewModel mainActivityViewModel() {
        return new MainActivityViewModel(DaggerMyApplication_HiltComponents_SingletonC.this.retroRepository());
      }

      private Provider<MainActivityViewModel> mainActivityViewModelProvider() {
        Object local = mainActivityViewModelProvider;
        if (local == null) {
          local = new SwitchingProvider<>(0);
          mainActivityViewModelProvider = (Provider<MainActivityViewModel>) local;
        }
        return (Provider<MainActivityViewModel>) local;
      }

      @Override
      public Map<String, Provider<ViewModel>> getHiltViewModelMap() {
        return Collections.<String, Provider<ViewModel>>singletonMap("com.demo.suresh.viewmodel.MainActivityViewModel", (Provider) mainActivityViewModelProvider());
      }

      private final class SwitchingProvider<T> implements Provider<T> {
        private final int id;

        SwitchingProvider(int id) {
          this.id = id;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T get() {
          switch (id) {
            case 0: // com.demo.suresh.viewmodel.MainActivityViewModel 
            return (T) ViewModelCImpl.this.mainActivityViewModel();

            default: throw new AssertionError(id);
          }
        }
      }
    }
  }

  private final class ServiceCBuilder implements MyApplication_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public MyApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends MyApplication_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }
  }

  private final class SwitchingProvider<T> implements Provider<T> {
    private final int id;

    SwitchingProvider(int id) {
      this.id = id;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get() {
      switch (id) {
        case 0: // com.demo.suresh.workmanger.MyWorkManger_AssistedFactory 
        return (T) DaggerMyApplication_HiltComponents_SingletonC.this.myWorkManger_AssistedFactory();

        default: throw new AssertionError(id);
      }
    }
  }
}
