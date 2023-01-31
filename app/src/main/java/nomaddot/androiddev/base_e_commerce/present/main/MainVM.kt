package nomaddot.androiddev.base_e_commerce.present.main

import androidx.lifecycle.MutableLiveData
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.toCollection
import nomaddot.androiddev.base_e_commerce.components.base.BaseViewModel

class MainVM(
    private val repository: MainRepository = MainActivityRepository()
): BaseViewModel<MainActivityNavigator>() {

    private val liveData = MutableLiveData<Boolean>()

    fun fetchBooking() {
        execute {
            repository.fetchBookings()
                .filter { it }
                .collect { liveData.value = it }
        }
    }
}