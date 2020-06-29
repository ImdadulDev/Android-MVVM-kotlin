package net.simplifiedcoding.mvvmsampleapp.data.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ!\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J)\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lnet/simplifiedcoding/mvvmsampleapp/data/repositories/UserRepository;", "Lnet/simplifiedcoding/mvvmsampleapp/data/network/SafeApiRequest;", "api", "Lnet/simplifiedcoding/mvvmsampleapp/data/network/MyApi;", "db", "Lnet/simplifiedcoding/mvvmsampleapp/data/db/AppDatabase;", "(Lnet/simplifiedcoding/mvvmsampleapp/data/network/MyApi;Lnet/simplifiedcoding/mvvmsampleapp/data/db/AppDatabase;)V", "getUser", "Landroidx/lifecycle/LiveData;", "Lnet/simplifiedcoding/mvvmsampleapp/data/db/entities/User;", "saveUser", "", "user", "(Lnet/simplifiedcoding/mvvmsampleapp/data/db/entities/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "userLogin", "Lnet/simplifiedcoding/mvvmsampleapp/data/network/responses/AuthResponse;", "email", "", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "userSignup", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class UserRepository extends net.simplifiedcoding.mvvmsampleapp.data.network.SafeApiRequest {
    private final net.simplifiedcoding.mvvmsampleapp.data.network.MyApi api = null;
    private final net.simplifiedcoding.mvvmsampleapp.data.db.AppDatabase db = null;
    
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
    public final java.lang.Object saveUser(@org.jetbrains.annotations.NotNull()
    net.simplifiedcoding.mvvmsampleapp.data.db.entities.User user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<net.simplifiedcoding.mvvmsampleapp.data.db.entities.User> getUser() {
        return null;
    }
    
    public UserRepository(@org.jetbrains.annotations.NotNull()
    net.simplifiedcoding.mvvmsampleapp.data.network.MyApi api, @org.jetbrains.annotations.NotNull()
    net.simplifiedcoding.mvvmsampleapp.data.db.AppDatabase db) {
        super();
    }
}