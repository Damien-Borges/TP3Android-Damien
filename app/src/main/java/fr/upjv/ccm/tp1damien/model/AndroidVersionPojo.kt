package fr.upjv.ccm.tp1damien.model

import androidx.room.Entity
import androidx.room.PrimaryKey

sealed class MyObjectForRecyclerView(label: String)


data class ObjectDataHeaderSample(
    val header: String
) : MyObjectForRecyclerView(label = header)


data class ObjectDataSample(
    val versionName: String,
    val versionCode: Int,
    val versionImage: String
) : MyObjectForRecyclerView(label = versionName)

@Entity(tableName = "android_version_object_table")
data class LocalDataSourceSample(
    val name: String,
    val code: Int,
    val image: String
) {
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0
}