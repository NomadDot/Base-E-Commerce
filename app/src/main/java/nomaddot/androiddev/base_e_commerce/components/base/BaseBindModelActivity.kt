package nomaddot.androiddev.base_e_commerce.components.base

import android.app.Activity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel

abstract class BaseBindModelActivity<T : BaseNavigator, M : BaseViewModel<*>> : BaseActivity(),
    BaseNavigator {
    private lateinit var viewModel: ViewModel

    open fun initViewModel() {

    }

    open fun onResumeActivity() { }

    open fun onStopActivity() { }

    open fun onDestroyActivity() { }

    abstract fun setupActivity(): Activity

    abstract fun getFragments(): List<Fragment>

    override fun getLayoutResId(): Int {
        TODO("Not yet implemented")
    }

    override fun openTokenExpiredAlert() {
        TODO("Not yet implemented")
    }
}