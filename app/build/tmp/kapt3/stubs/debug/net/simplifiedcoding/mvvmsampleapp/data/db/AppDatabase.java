package net.simplifiedcoding.mvvmsampleapp.data.db;

import java.lang.System;

@androidx.room.Database(entities = {net.simplifiedcoding.mvvmsampleapp.data.db.entities.User.class, net.simplifiedcoding.mvvmsampleapp.data.db.entities.Quote.class}, version = 1)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lnet/simplifiedcoding/mvvmsampleapp/data/db/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "getQuoteDao", "Lnet/simplifiedcoding/mvvmsampleapp/data/db/QuoteDao;", "getUserDao", "Lnet/simplifiedcoding/mvvmsampleapp/data/db/UserDao;", "Companion", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    private static volatile net.simplifiedcoding.mvvmsampleapp.data.db.AppDatabase instance;
    private static final java.lang.Object LOCK = null;
    public static final net.simplifiedcoding.mvvmsampleapp.data.db.AppDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract net.simplifiedcoding.mvvmsampleapp.data.db.UserDao getUserDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract net.simplifiedcoding.mvvmsampleapp.data.db.QuoteDao getQuoteDao();
    
    public AppDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0011\u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0086\u0002R\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lnet/simplifiedcoding/mvvmsampleapp/data/db/AppDatabase$Companion;", "", "()V", "LOCK", "instance", "Lnet/simplifiedcoding/mvvmsampleapp/data/db/AppDatabase;", "buildDatabase", "context", "Landroid/content/Context;", "invoke", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final net.simplifiedcoding.mvvmsampleapp.data.db.AppDatabase invoke(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private final net.simplifiedcoding.mvvmsampleapp.data.db.AppDatabase buildDatabase(android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}