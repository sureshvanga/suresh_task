package com.demo.suresh.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/demo/suresh/viewmodel/MainActivityViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/demo/suresh/network/RetroRepository;", "(Lcom/demo/suresh/network/RetroRepository;)V", "getAllRepositoryList", "Landroidx/lifecycle/LiveData;", "", "Lcom/demo/suresh/model/RepositoryData;", "makeApiCall", "", "app_debug"})
public final class MainActivityViewModel extends androidx.lifecycle.ViewModel {
    private final com.demo.suresh.network.RetroRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.demo.suresh.model.RepositoryData>> getAllRepositoryList() {
        return null;
    }
    
    public final void makeApiCall() {
    }
    
    @javax.inject.Inject()
    public MainActivityViewModel(@org.jetbrains.annotations.NotNull()
    com.demo.suresh.network.RetroRepository repository) {
        super();
    }
}