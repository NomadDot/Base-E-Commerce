package nomaddot.androiddev.base_e_commerce.components.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import nomaddot.androiddev.base_e_commerce.components.RestModule
import nomaddot.androiddev.base_e_commerce.components.base.Repository
import nomaddot.androiddev.base_e_commerce.components.database.Database
import nomaddot.androiddev.base_e_commerce.components.network.RestApi
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideRestApi(): RestApi {
        return RestModule()
    }

    @Provides
    @Singleton
    fun provideDatabase(): Database {
        return object : Database {

        }
    }
}