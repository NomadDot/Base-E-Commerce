package nomaddot.androiddev.base_e_commerce.components.di

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.components.SingletonComponent
import nomaddot.androiddev.base_e_commerce.components.base.MainRepository
import nomaddot.androiddev.base_e_commerce.components.database.Database
import nomaddot.androiddev.base_e_commerce.components.network.RestApi
import nomaddot.androiddev.base_e_commerce.present.main.IMainRepository

@Module
@InstallIn(ViewModelComponent::class)

object RepositoryModule {
    @Provides
    fun provideMainRepository(api: RestApi, db: Database): IMainRepository {
        return MainRepository(api, db)
    }
}