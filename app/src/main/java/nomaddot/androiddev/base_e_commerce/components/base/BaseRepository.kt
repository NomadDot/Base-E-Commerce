package nomaddot.androiddev.base_e_commerce.components.base

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import nomaddot.androiddev.base_e_commerce.network.Data
import nomaddot.androiddev.base_e_commerce.database.Database
import nomaddot.androiddev.base_e_commerce.network.RestApi
import nomaddot.androiddev.base_e_commerce.components.DataProvider

open class BaseRepository(
    private val repositoryApi: RestApi = DataProvider.getApi(),
    private val repositoryDb: Database = DataProvider.database()
): Repository {
    override fun getApi() = repositoryApi
    override fun getDatabase() = repositoryDb

    suspend fun <T> Data<T>.flowable() =
        flow { emit(withoutDataWrapper()) }
            .flowOn(Dispatchers.Default)
}

interface Repository {
    fun getApi(): RestApi
    fun getDatabase(): Database
}