package com.stmik.retrofit

import android.telecom.Call
import retrofit2.http.GET

interface ApiService {
    @GET ("character")
    fun getRick(): retrofit2.Call<ResponseRick>
}