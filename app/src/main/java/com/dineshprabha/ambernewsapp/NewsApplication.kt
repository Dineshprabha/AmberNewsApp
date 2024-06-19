package com.dineshprabha.ambernewsapp

import android.app.Application
import com.dineshprabha.ambernewsapp.di.component.ApplicationComponent
import com.dineshprabha.ambernewsapp.di.component.DaggerApplicationComponent
import com.dineshprabha.ambernewsapp.di.module.ApplicationModule

class NewsApplication : Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        injectDependencies()
    }


    private fun injectDependencies(){
        applicationComponent = DaggerApplicationComponent
            .builder()
            .applicationModule(ApplicationModule(this))
            .build()
        applicationComponent.inject(this)
    }
}