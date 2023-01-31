package nomaddot.androiddev.base_e_commerce.present.main

import android.app.Activity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import nomaddot.androiddev.base_e_commerce.R
import nomaddot.androiddev.base_e_commerce.components.base.BaseBindModelActivity
import nomaddot.androiddev.base_e_commerce.databinding.ActivityMainBinding

class MainActivity: BaseBindModelActivity<ActivityMainBinding, MainVM>()  {

    override fun getLayoutResId(): Int = R.layout.activity_main

    override fun setupActivity(): Activity = this

    override fun getFragments(): List<Fragment> = supportFragmentManager.fragments
}