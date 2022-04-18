package com.aar.app.sandeep.data.room

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.aar.app.sandeep.features.gamethemeselector.GameThemeItem
import com.aar.app.sandeep.model.GameTheme

@Dao
interface GameThemeDataSource {
    @Query("SELECT * FROM game_themes")
    suspend fun getThemeList(): List<GameTheme>

    @Query("SELECT *, (SELECT COUNT(*) FROM words WHERE game_theme_id=game_themes.id) as words_count FROM game_themes")
    fun getThemeItemList(): LiveData<List<GameThemeItem>>

    @Insert
    fun insertAll(gameThemes: List<GameTheme>)

    @Query("DELETE FROM game_themes")
    fun deleteAll()
}