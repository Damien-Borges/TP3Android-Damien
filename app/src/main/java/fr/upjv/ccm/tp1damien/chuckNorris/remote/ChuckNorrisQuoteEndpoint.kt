package fr.upjv.ccm.tp1damien.chuckNorris.remote

import fr.upjv.ccm.tp1damien.chuckNorris.model.ChuckNorrisRetrofit
import retrofit2.http.GET

interface ChuckNorrisQuoteEndpoint {

    @GET("random")
    suspend fun getRandomQuote() : ChuckNorrisRetrofit
}