package net.simplifiedcoding.mvvmsampleapp.data.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0011\u0010\r\u001a\u00020\u000eH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0016\u0010\u0016\u001a\u00020\u000e2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lnet/simplifiedcoding/mvvmsampleapp/data/repositories/QuotesRepository;", "Lnet/simplifiedcoding/mvvmsampleapp/data/network/SafeApiRequest;", "api", "Lnet/simplifiedcoding/mvvmsampleapp/data/network/MyApi;", "db", "Lnet/simplifiedcoding/mvvmsampleapp/data/db/AppDatabase;", "prefs", "Lnet/simplifiedcoding/mvvmsampleapp/data/preferences/PreferenceProvider;", "(Lnet/simplifiedcoding/mvvmsampleapp/data/network/MyApi;Lnet/simplifiedcoding/mvvmsampleapp/data/db/AppDatabase;Lnet/simplifiedcoding/mvvmsampleapp/data/preferences/PreferenceProvider;)V", "quotes", "Landroidx/lifecycle/MutableLiveData;", "", "Lnet/simplifiedcoding/mvvmsampleapp/data/db/entities/Quote;", "fetchQuotes", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getQuotes", "Landroidx/lifecycle/LiveData;", "isFetchNeeded", "", "savedAt", "Ljava/time/LocalDateTime;", "saveQuotes", "app_debug"})
public final class QuotesRepository extends net.simplifiedcoding.mvvmsampleapp.data.network.SafeApiRequest {
    private final androidx.lifecycle.MutableLiveData<java.util.List<net.simplifiedcoding.mvvmsampleapp.data.db.entities.Quote>> quotes = null;
    private final net.simplifiedcoding.mvvmsampleapp.data.network.MyApi api = null;
    private final net.simplifiedcoding.mvvmsampleapp.data.db.AppDatabase db = null;
    private final net.simplifiedcoding.mvvmsampleapp.data.preferences.PreferenceProvider prefs = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getQuotes(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<java.util.List<net.simplifiedcoding.mvvmsampleapp.data.db.entities.Quote>>> p0) {
        return null;
    }
    
    private final boolean isFetchNeeded(java.time.LocalDateTime savedAt) {
        return false;
    }
    
    private final void saveQuotes(java.util.List<net.simplifiedcoding.mvvmsampleapp.data.db.entities.Quote> quotes) {
    }
    
    public QuotesRepository(@org.jetbrains.annotations.NotNull()
    net.simplifiedcoding.mvvmsampleapp.data.network.MyApi api, @org.jetbrains.annotations.NotNull()
    net.simplifiedcoding.mvvmsampleapp.data.db.AppDatabase db, @org.jetbrains.annotations.NotNull()
    net.simplifiedcoding.mvvmsampleapp.data.preferences.PreferenceProvider prefs) {
        super();
    }
}