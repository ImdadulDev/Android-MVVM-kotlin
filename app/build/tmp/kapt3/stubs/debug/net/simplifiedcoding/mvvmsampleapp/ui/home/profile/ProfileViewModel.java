package net.simplifiedcoding.mvvmsampleapp.ui.home.profile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lnet/simplifiedcoding/mvvmsampleapp/ui/home/profile/ProfileViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lnet/simplifiedcoding/mvvmsampleapp/data/repositories/UserRepository;", "(Lnet/simplifiedcoding/mvvmsampleapp/data/repositories/UserRepository;)V", "user", "Landroidx/lifecycle/LiveData;", "Lnet/simplifiedcoding/mvvmsampleapp/data/db/entities/User;", "getUser", "()Landroidx/lifecycle/LiveData;", "app_debug"})
public final class ProfileViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<net.simplifiedcoding.mvvmsampleapp.data.db.entities.User> user = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<net.simplifiedcoding.mvvmsampleapp.data.db.entities.User> getUser() {
        return null;
    }
    
    public ProfileViewModel(@org.jetbrains.annotations.NotNull()
    net.simplifiedcoding.mvvmsampleapp.data.repositories.UserRepository repository) {
        super();
    }
}