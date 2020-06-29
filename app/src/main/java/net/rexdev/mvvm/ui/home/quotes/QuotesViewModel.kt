package net.rexdev.mvvm.ui.home.quotes

import androidx.lifecycle.ViewModel;
import net.rexdev.mvvm.data.repositories.QuotesRepository
import net.rexdev.mvvm.util.lazyDeferred

class QuotesViewModel(
    repository: QuotesRepository
) : ViewModel() {

    val quotes by lazyDeferred {
        repository.getQuotes()
    }
}
