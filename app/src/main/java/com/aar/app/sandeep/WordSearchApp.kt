package com.aar.app.sandeep

import android.app.Application
import com.aar.app.sandeep.di.component.AppComponent
import com.aar.app.sandeep.di.component.DaggerAppComponent
import com.aar.app.sandeep.di.modules.AppModule

/**
 * Created by sandeep on 17/04/22.
 */
class WordSearchApp : Application() {
    lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }

}