package nomaddot.androiddev.base_e_commerce.components.network

interface RestApi {
    fun bookingApi(): BookingApi
    fun clinicApi()
}

interface BookingApi {
    fun fetchBookings(): Data<Boolean>
}

data class Data<T>(val result: T) {
    fun withoutDataWrapper(): T = result
}