package nomaddot.androiddev.base_e_commerce.components.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import java.lang.ref.WeakReference

abstract class BaseViewModel<N : BaseNavigator?> : ViewModel() {

    var navigator: WeakReference<N>? = null

    fun getNavigator(): N? =
        navigator?.get()

    fun setNavigator(_navigator: N) {
        navigator = WeakReference(_navigator)
    }

    fun ViewModel.execute(action: suspend () -> Unit): Job {
        return viewModelScope.launch(Dispatchers.Main) {
            action()
        }
    }
}