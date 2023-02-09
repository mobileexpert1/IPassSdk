package com.ipasssdk.apis

import android.os.Build
import androidx.annotation.RequiresApi
import com.ipasssdk.utils.ServerUrls

import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

// ApiClient
@RequiresApi(Build.VERSION_CODES.O)
fun ApiClient(x_api_key: String): Retrofit? {
    val interceptor = HttpLoggingInterceptor()
    interceptor.level = HttpLoggingInterceptor.Level.BODY
    return Retrofit.Builder().baseUrl(ServerUrls.base_url)
        .addCallAdapterFactory(ResultCallAdapterFactory())
        .addConverterFactory(GsonConverterFactory.create()).client(
            OkHttpClient.Builder()
                .connectTimeout(60, TimeUnit.SECONDS)
                .writeTimeout(60, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .addInterceptor(interceptor)
                .addNetworkInterceptor { chain ->
                    val original: Request = chain.request()
                   val requestBuilder = build(original).addHeader("Authorization",x_api_key)// Header Request Builder
                    chain.proceed(requestBuilder.build())}
               .build()
        ).build()
}
