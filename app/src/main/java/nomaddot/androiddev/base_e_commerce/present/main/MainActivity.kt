package nomaddot.androiddev.base_e_commerce.present.main

import android.app.Activity
import androidx.activity.viewModels
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import nomaddot.androiddev.base_e_commerce.R
import nomaddot.androiddev.base_e_commerce.components.base.BaseBindModelActivity
import nomaddot.androiddev.base_e_commerce.components.prepareViewModel
import nomaddot.androiddev.base_e_commerce.databinding.ActivityMainBinding
@AndroidEntryPoint
class MainActivity: BaseBindModelActivity<ActivityMainBinding, MainViewModel.MainVM>()  {

    override fun getLayoutResId(): Int = R.layout.activity_main
    override fun initViewModel(): MainViewModel.MainVM = prepareViewModel {

    }


    override fun setupActivity(): Activity = this

    override fun getFragments(): List<Fragment> = supportFragmentManager.fragments

    override fun onResume() {
        super.onResume()
    }
}