package com.dineshprabha.ambernewsapp.di.component

import com.dineshprabha.ambernewsapp.di.ActivityScope
import com.dineshprabha.ambernewsapp.di.component.ApplicationComponent
import com.dineshprabha.ambernewsapp.ui.topheadline.TopHeadlineActivity
import dagger.Component


@ActivityScope
@Component(dependencies = [ApplicationComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(activity: TopHeadlineActivity)

}