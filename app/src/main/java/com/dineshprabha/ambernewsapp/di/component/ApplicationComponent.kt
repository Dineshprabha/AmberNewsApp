package com.dineshprabha.ambernewsapp.di.component

import android.content.Context
import com.dineshprabha.ambernewsapp.NewsApplication
import com.dineshprabha.ambernewsapp.data.api.NetworkService
import com.dineshprabha.ambernewsapp.data.repository.TopHeadlineRepository
import com.dineshprabha.ambernewsapp.di.ApplicationContext
import com.dineshprabha.ambernewsapp.di.module.ApplicationModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun inject(application: NewsApplication)

    @ApplicationContext
    fun getContext(): Context

    fun getNetworkService(): NetworkService

    fun getTopHeadlineRepository(): TopHeadlineRepository
}