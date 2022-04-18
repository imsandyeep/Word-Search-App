package com.aar.app.sandeep.di.component

import com.aar.app.sandeep.di.modules.AppModule
import com.aar.app.sandeep.di.modules.DataSourceModule
import com.aar.app.sandeep.di.modules.ViewModelModule
import com.aar.app.sandeep.features.FullscreenActivity
import com.aar.app.sandeep.features.gamehistory.GameHistoryActivity
import com.aar.app.sandeep.features.gameover.GameOverActivity
import com.aar.app.sandeep.features.gameplay.GamePlayActivity
import com.aar.app.sandeep.features.gamethemeselector.ThemeSelectorActivity
import com.aar.app.sandeep.features.mainmenu.MainMenuActivity
import dagger.Component
import javax.inject.Singleton

/**
 * Created by abdularis on 18/07/17.
 */
@Singleton
@Component(modules = [AppModule::class, DataSourceModule::class, ViewModelModule::class])
interface AppComponent {
    fun inject(activity: GamePlayActivity)
    fun inject(activity: MainMenuActivity)
    fun inject(activity: GameOverActivity)
    fun inject(activity: FullscreenActivity)
    fun inject(activity: GameHistoryActivity)
    fun inject(activity: ThemeSelectorActivity)
}