package net.simplifiedcoding.mvvmsampleapp.data.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lnet/simplifiedcoding/mvvmsampleapp/data/db/UserDao;", "", "getuser", "Landroidx/lifecycle/LiveData;", "Lnet/simplifiedcoding/mvvmsampleapp/data/db/entities/User;", "upsert", "", "user", "(Lnet/simplifiedcoding/mvvmsampleapp/data/db/entities/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface UserDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object upsert(@org.jetbrains.annotations.NotNull()
    net.simplifiedcoding.mvvmsampleapp.data.db.entities.User user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> p1);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM user WHERE uid = 0")
    public abstract androidx.lifecycle.LiveData<net.simplifiedcoding.mvvmsampleapp.data.db.entities.User> getuser();
}