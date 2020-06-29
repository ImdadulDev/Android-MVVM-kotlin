package net.simplifiedcoding.mvvmsampleapp.ui.home.quotes;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0016\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002J\u0012\u0010\u0018\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J&\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0018\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016*\b\u0012\u0004\u0012\u00020\"0\u0016H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lnet/simplifiedcoding/mvvmsampleapp/ui/home/quotes/QuotesFragment;", "Landroidx/fragment/app/Fragment;", "Lorg/kodein/di/KodeinAware;", "()V", "factory", "Lnet/simplifiedcoding/mvvmsampleapp/ui/home/quotes/QuotesViewModelFactory;", "getFactory", "()Lnet/simplifiedcoding/mvvmsampleapp/ui/home/quotes/QuotesViewModelFactory;", "factory$delegate", "Lkotlin/Lazy;", "kodein", "Lorg/kodein/di/Kodein;", "getKodein", "()Lorg/kodein/di/Kodein;", "kodein$delegate", "viewModel", "Lnet/simplifiedcoding/mvvmsampleapp/ui/home/quotes/QuotesViewModel;", "bindUI", "Lkotlinx/coroutines/Job;", "initRecyclerView", "", "quoteItem", "", "Lnet/simplifiedcoding/mvvmsampleapp/ui/home/quotes/QuoteItem;", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "toQuoteItem", "Lnet/simplifiedcoding/mvvmsampleapp/data/db/entities/Quote;", "app_debug"})
public final class QuotesFragment extends androidx.fragment.app.Fragment implements org.kodein.di.KodeinAware {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy kodein$delegate = null;
    private final kotlin.Lazy factory$delegate = null;
    private net.simplifiedcoding.mvvmsampleapp.ui.home.quotes.QuotesViewModel viewModel;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.kodein.di.Kodein getKodein() {
        return null;
    }
    
    private final net.simplifiedcoding.mvvmsampleapp.ui.home.quotes.QuotesViewModelFactory getFactory() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final kotlinx.coroutines.Job bindUI() {
        return null;
    }
    
    private final void initRecyclerView(java.util.List<net.simplifiedcoding.mvvmsampleapp.ui.home.quotes.QuoteItem> quoteItem) {
    }
    
    private final java.util.List<net.simplifiedcoding.mvvmsampleapp.ui.home.quotes.QuoteItem> toQuoteItem(@org.jetbrains.annotations.NotNull()
    java.util.List<net.simplifiedcoding.mvvmsampleapp.data.db.entities.Quote> $this$toQuoteItem) {
        return null;
    }
    
    public QuotesFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.kodein.di.KodeinContext<?> getKodeinContext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public org.kodein.di.KodeinTrigger getKodeinTrigger() {
        return null;
    }
}