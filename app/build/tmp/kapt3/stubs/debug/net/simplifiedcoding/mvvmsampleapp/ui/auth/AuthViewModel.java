package net.simplifiedcoding.mvvmsampleapp.ui.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ!\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J)\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lnet/simplifiedcoding/mvvmsampleapp/ui/auth/AuthViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lnet/simplifiedcoding/mvvmsampleapp/data/repositories/UserRepository;", "(Lnet/simplifiedcoding/mvvmsampleapp/data/repositories/UserRepository;)V", "getLoggedInUser", "Landroidx/lifecycle/LiveData;", "Lnet/simplifiedcoding/mvvmsampleapp/data/db/entities/User;", "saveLoggedInUser", "", "user", "(Lnet/simplifiedcoding/mvvmsampleapp/data/db/entities/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "userLogin", "Lnet/simplifiedcoding/mvvmsampleapp/data/network/responses/AuthResponse;", "email", "", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "userSignup", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class AuthViewModel extends androidx.lifecycle.ViewModel {
    private final net.simplifiedcoding.mvvmsampleapp.data.repositories.UserRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<net.simplifiedcoding.mvvmsampleapp.data.db.entities.User> getLoggedInUser() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object userLogin(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super net.simplifiedcoding.mvvmsampleapp.data.network.responses.AuthResponse> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object userSignup(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super net.simplifiedcoding.mvvmsampleapp.data.network.responses.AuthResponse> p3) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveLoggedInUser(@org.jetbrains.annotations.NotNull()
    net.simplifiedcoding.mvvmsampleapp.data.db.entities.User user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> p1) {
        return null;
    }
    
    public AuthViewModel(@org.jetbrains.annotations.NotNull()
    net.simplifiedcoding.mvvmsampleapp.data.repositories.UserRepository repository) {
        super();
    }
}