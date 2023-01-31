package nomaddot.androiddev.base_e_commerce.present.main

import kotlinx.coroutines.flow.Flow
import nomaddot.androiddev.base_e_commerce.network.BookingApi
import nomaddot.androiddev.base_e_commerce.components.base.BaseRepository

class MainActivityRepository(): BaseRepository(), MainRepository {
    private val restApi = getApi()
    private val db = getDatabase()

    private val bookingApi: BookingApi = restApi.bookingApi()

    override suspend fun fetchBookings(): Flow<Boolean> {
        return bookingApi.fetchBookings().flowable()
    }
}