package nomaddot.androiddev.base_e_commerce.present.main

import kotlinx.coroutines.flow.Flow

interface MainRepository {
    suspend fun fetchBookings(): Flow<Boolean>
}