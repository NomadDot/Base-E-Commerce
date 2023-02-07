package nomaddot.androiddev.base_e_commerce.components.base

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint

abstract class BaseBindModelActivity<T : ViewDataBinding, M : BaseViewModel<*>> : AppCompatActivity(),
    BaseNavigator {

    lateinit var binding: T
    lateinit var viewModel: M
    private fun performDataBinding() {
        binding = DataBindingUtil.setContentView(this, getLayoutResId())
        viewModel = initViewModel()
        binding.lifecycleOwner = this
        //binding.setVariable(BR.viewModel, viewModel)
        binding.executePendingBindings()
    }
    abstract fun initViewModel(): M
    abstract fun setupActivity(): Activity

    abstract fun getFragments(): List<Fragment>

    abstract fun getLayoutResId(): Int
}