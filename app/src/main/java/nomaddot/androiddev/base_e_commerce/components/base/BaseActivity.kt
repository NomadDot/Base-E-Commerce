package nomaddot.androiddev.base_e_commerce.components.base

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity: AppCompatActivity() {
    abstract fun getLayoutResId(): Int
}

