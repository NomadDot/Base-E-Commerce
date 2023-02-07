package nomaddot.androiddev.base_e_commerce.components

import nomaddot.androiddev.base_e_commerce.components.network.BookingApi
import nomaddot.androiddev.base_e_commerce.components.network.RestApi
import nomaddot.androiddev.base_e_commerce.components.database.Database
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//object DataProvider {
//    private lateinit var db: Database
//    private lateinit var api: RestApi
//
//    fun setup() {
//        db = object : Database { }
//        api = RestModule()
//    }
//
//    fun database() = db
//    fun getApi() = api
//}

class RestModule() : RestApi {

    private var retrofit: Retrofit

    init { retrofit = getRetrofit() }

    companion object {
        private const val BASE_URL = "http://"
    }

    private fun getRetrofit(): Retrofit =
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()


    override fun bookingApi(): BookingApi = retrofit.create(BookingApi::class.java)
    override fun clinicApi() { }
}
