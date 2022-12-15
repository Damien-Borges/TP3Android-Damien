package fr.upjv.ccm.tp1damien.chuckNorris.repository

import androidx.lifecycle.LiveData
import fr.upjv.ccm.tp1damien.architecture.CustomApplication
import fr.upjv.ccm.tp1damien.architecture.RetrofitBuilder
import fr.upjv.ccm.tp1damien.chuckNorris.model.ChuckNorrisRetrofit
import fr.upjv.ccm.tp1damien.chuckNorris.model.ChuckNorrisRoom
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ChuckNorrisQuoteRepository {


    private val mChuckNorrisDao = CustomApplication.instance.mApplicationDatabase.chuckNorrisDao()


    fun selectAllChuckNorrisQuote(): LiveData<List<ChuckNorrisRoom>> {
        return mChuckNorrisDao.selectAll()
    }


    private suspend fun insertChuckNorrisQuote(chuckNorrisQuote: ChuckNorrisRoom) =
        withContext(Dispatchers.IO) {
            mChuckNorrisDao.insert(chuckNorrisQuote)
        }


    suspend fun deleteAllChuckNorrisQuote() = withContext(Dispatchers.IO) {
        mChuckNorrisDao.deleteAll()
    }


    suspend fun fetchData() {
        insertChuckNorrisQuote(RetrofitBuilder.getChuckNorrisQuote().getRandomQuote().toRoom())
    }
}

private fun ChuckNorrisRetrofit.toRoom(): ChuckNorrisRoom {
    return ChuckNorrisRoom(
        quote = quote,
        iconUrl = iconUrl
    )
}