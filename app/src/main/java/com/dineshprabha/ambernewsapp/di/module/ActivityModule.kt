package com.dineshprabha.ambernewsapp.di.component

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.dineshprabha.ambernewsapp.data.repository.TopHeadlineRepository
import com.dineshprabha.ambernewsapp.di.ActivityContext
import com.dineshprabha.ambernewsapp.ui.base.ViewModelProviderFactory
import com.dineshprabha.ambernewsapp.ui.topheadline.TopHeadlineAdapter
import com.dineshprabha.ambernewsapp.ui.topheadline.TopHeadlineViewModel
import dagger.Module
import dagger.Provides



@Module
class ActivityModule(private val activity: AppCompatActivity) {

    @ActivityContext
    @Provides
    fun provideContext(): Context {
        return activity
    }

    @Provides
    fun provideNewsListViewModel(topHeadlineRepository: TopHeadlineRepository): TopHeadlineViewModel {
        return ViewModelProvider(activity,
            ViewModelProviderFactory(TopHeadlineViewModel::class) {
                TopHeadlineViewModel(topHeadlineRepository)
            })[TopHeadlineViewModel::class.java]
    }

    @Provides
    fun provideTopHeadlineAdapter() = TopHeadlineAdapter(ArrayList())

}