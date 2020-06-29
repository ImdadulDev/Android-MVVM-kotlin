package net.simplifiedcoding.mvvmsampleapp.ui.home.quotes;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R-\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u000e"}, d2 = {"Lnet/simplifiedcoding/mvvmsampleapp/ui/home/quotes/QuotesViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lnet/simplifiedcoding/mvvmsampleapp/data/repositories/QuotesRepository;", "(Lnet/simplifiedcoding/mvvmsampleapp/data/repositories/QuotesRepository;)V", "quotes", "Lkotlinx/coroutines/Deferred;", "Landroidx/lifecycle/LiveData;", "", "Lnet/simplifiedcoding/mvvmsampleapp/data/db/entities/Quote;", "getQuotes", "()Lkotlinx/coroutines/Deferred;", "quotes$delegate", "Lkotlin/Lazy;", "app_debug"})
public final class QuotesViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy quotes$delegate = null;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Deferred<androidx.lifecycle.LiveData<java.util.List<net.simplifiedcoding.mvvmsampleapp.data.db.entities.Quote>>> getQuotes() {
        return null;
    }
    
    public QuotesViewModel(@org.jetbrains.annotations.NotNull()
    net.simplifiedcoding.mvvmsampleapp.data.repositories.QuotesRepository repository) {
        super();
    }
}