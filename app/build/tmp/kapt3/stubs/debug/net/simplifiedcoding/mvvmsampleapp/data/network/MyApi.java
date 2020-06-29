package net.simplifiedcoding.mvvmsampleapp.data.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J+\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ5\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\b\b\u0001\u0010\r\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lnet/simplifiedcoding/mvvmsampleapp/data/network/MyApi;", "", "getQuotes", "Lretrofit2/Response;", "Lnet/simplifiedcoding/mvvmsampleapp/data/network/responses/QuotesResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "userLogin", "Lnet/simplifiedcoding/mvvmsampleapp/data/network/responses/AuthResponse;", "email", "", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "userSignup", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public abstract interface MyApi {
    public static final net.simplifiedcoding.mvvmsampleapp.data.network.MyApi.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "login")
    @retrofit2.http.FormUrlEncoded()
    public abstract java.lang.Object userLogin(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "email")
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "password")
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<net.simplifiedcoding.mvvmsampleapp.data.network.responses.AuthResponse>> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "signup")
    @retrofit2.http.FormUrlEncoded()
    public abstract java.lang.Object userSignup(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "name")
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "email")
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "password")
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<net.simplifiedcoding.mvvmsampleapp.data.network.responses.AuthResponse>> p3);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "quotes")
    public abstract java.lang.Object getQuotes(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<net.simplifiedcoding.mvvmsampleapp.data.network.responses.QuotesResponse>> p0);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0086\u0002\u00a8\u0006\u0007"}, d2 = {"Lnet/simplifiedcoding/mvvmsampleapp/data/network/MyApi$Companion;", "", "()V", "invoke", "Lnet/simplifiedcoding/mvvmsampleapp/data/network/MyApi;", "networkConnectionInterceptor", "Lnet/simplifiedcoding/mvvmsampleapp/data/network/NetworkConnectionInterceptor;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final net.simplifiedcoding.mvvmsampleapp.data.network.MyApi invoke(@org.jetbrains.annotations.NotNull()
        net.simplifiedcoding.mvvmsampleapp.data.network.NetworkConnectionInterceptor networkConnectionInterceptor) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}