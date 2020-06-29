package net.rexdev.mvvm

import android.app.Application
import net.rexdev.mvvm.data.db.AppDatabase
import net.rexdev.mvvm.data.network.MyApi
import net.rexdev.mvvm.data.network.NetworkConnectionInterceptor
import net.rexdev.mvvm.data.preferences.PreferenceProvider
import net.rexdev.mvvm.data.repositories.QuotesRepository
import net.rexdev.mvvm.data.repositories.UserRepository
import net.rexdev.mvvm.ui.auth.AuthViewModelFactory
import net.rexdev.mvvm.ui.home.profile.ProfileViewModelFactory
import net.rexdev.mvvm.ui.home.quotes.QuotesViewModelFactory
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.androidXModule
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton

class BaseApplication : Application(), KodeinAware {

    override val kodein = Kodein.lazy {
        import(androidXModule(this@BaseApplication))

        bind() from singleton { NetworkConnectionInterceptor(instance()) }
        bind() from singleton { MyApi(instance()) }
        bind() from singleton { AppDatabase(instance()) }
        bind() from singleton { PreferenceProvider(instance()) }
        bind() from singleton { UserRepository(instance(), instance()) }
        bind() from singleton { QuotesRepository(instance(), instance(), instance()) }
        bind() from provider { AuthViewModelFactory(instance()) }
        bind() from provider { ProfileViewModelFactory(instance()) }
        bind() from provider{ QuotesViewModelFactory(instance())}


    }

}