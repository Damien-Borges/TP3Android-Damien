package fr.upjv.ccm.tp1damien.yourFeature.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import fr.upjv.ccm.tp1damien.yourFeature.model.LocalDataSourceSample

@Dao
interface AndroidVersionDao {

    @Query("SELECT * FROM android_version_object_table ORDER BY name ASC")
    fun selectAll(): LiveData<List<LocalDataSourceSample>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(androidVersion: LocalDataSourceSample)

    @Query("DELETE FROM android_version_object_table")
    fun deleteAll()
}