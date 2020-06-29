package net.rexdev.mvvm.ui.home.profile

import androidx.lifecycle.ViewModel;
import net.rexdev.mvvm.data.repositories.UserRepository

class ProfileViewModel(
    repository: UserRepository
) : ViewModel() {

    val user = repository.getUser()

}
