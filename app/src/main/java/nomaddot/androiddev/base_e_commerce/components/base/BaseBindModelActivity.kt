package nomaddot.androiddev.base_e_commerce.components.base

import android.app.Activity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel

abstract class BaseBindModelActivity<T : ViewDataBinding, M : BaseViewModel<*>> : BaseActivity(),
    BaseNavigator {

    private lateinit var binding: T
    private lateinit var viewModel: M
    private fun performDataBinding() {
        binding = DataBindingUtil.setContentView(this, getLayoutResId(), LifecycleComponent(lifecycle))

        binding.lifecycleOwner = this
        binding.setVariable(BR.viewModel, viewModel)
        binding.executePendingBindings()
    }
    open fun initViewModel() {
    }

    open fun onResumeActivity() { }

    open fun onStopActivity() { }

    open fun onDestroyActivity() { }

    abstract fun setupActivity(): Activity

    abstract fun getFragments(): List<Fragment>

    abstract fun getLayoutResId(): Int

    override fun openTokenExpiredAlert() {
        TODO("Not yet implemented")
    }
}