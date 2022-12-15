package fr.upjv.ccm.tp1damien.architecture

import androidx.room.Database
import androidx.room.RoomDatabase
import fr.upjv.ccm.tp1damien.chuckNorris.dao.ChuckNorrisDao
import fr.upjv.ccm.tp1damien.chuckNorris.model.ChuckNorrisRoom
import fr.upjv.ccm.tp1damien.yourFeature.dao.AndroidVersionDao
import fr.upjv.ccm.tp1damien.yourFeature.model.LocalDataSourceSample

@Database(
    entities = [
        LocalDataSourceSample::class,
        ChuckNorrisRoom::class
    ],
    version = 2,
    exportSchema = false
)
abstract class CustomRoomDatabase : RoomDatabase() {

    abstract fun androidVersionDao(): AndroidVersionDao

    abstract fun chuckNorrisDao() : ChuckNorrisDao
}