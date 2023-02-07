package nomaddot.androiddev.base_e_commerce.components.base

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import nomaddot.androiddev.base_e_commerce.components.network.Data
import nomaddot.androiddev.base_e_commerce.components.database.Database
import nomaddot.androiddev.base_e_commerce.components.network.RestApi
import nomaddot.androiddev.base_e_commerce.present.main.IMainRepository

interface Repository {
    suspend fun <T> Data<T>.flowable() =
        flow { emit(withoutDataWrapper()) }
            .flowOn(Dispatchers.Default)
}
class MainRepository(
    private val api: RestApi,
    private val db: Database
): IMainRepository  {

}