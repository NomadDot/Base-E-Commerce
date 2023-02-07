package nomaddot.androiddev.base_e_commerce.present.main

import androidx.lifecycle.MutableLiveData
import dagger.hilt.android.lifecycle.HiltViewModel
import nomaddot.androiddev.base_e_commerce.components.base.BaseViewModel
import javax.inject.Inject

interface MainViewModel {

    @HiltViewModel
    class MainVM @Inject constructor(
        private val repository: IMainRepository
    ) : BaseViewModel<MainActivityNavigator>(), MainViewModel {

        private val liveData = MutableLiveData<Boolean>()


    }
}