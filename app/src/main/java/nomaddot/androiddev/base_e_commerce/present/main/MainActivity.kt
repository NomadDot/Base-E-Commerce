package nomaddot.androiddev.base_e_commerce.present.main

import android.app.Activity
import androidx.fragment.app.Fragment
import nomaddot.androiddev.base_e_commerce.R
import nomaddot.androiddev.base_e_commerce.components.base.BaseBindModelActivity

class MainActivity: BaseBindModelActivity<MainActivityNavigator, MainVM>()  {

    override fun getLayoutResId(): Int = R.layout.activity_main

    override fun setupActivity(): Activity = this

    override fun getFragments(): List<Fragment> = supportFragmentManager.fragments
}