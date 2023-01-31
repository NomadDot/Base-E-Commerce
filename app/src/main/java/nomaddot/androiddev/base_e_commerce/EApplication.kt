package nomaddot.androiddev.base_e_commerce

import android.app.Application
import nomaddot.androiddev.base_e_commerce.components.DataProvider

class EApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        DataProvider.setup()
    }
}