package com.example.androidCleanArchitecture.di.m.component

import com.example.androidCleanArchitecture.view.GitHubRepoListActivity
import com.example.androidCleanArchitecture.di.m.modules.GitHubRepoModule
import com.example.androidCleanArchitecture.di.m.modules.GitHubRepoViewModelModule
import com.example.androidCleanArchitecture.di.m.modules.NetworkModule
import dagger.Component
import dagger.Module
import javax.inject.Singleton


@Singleton
@Component(
    modules = [
        AppModule::class,
        GitHubRepoModule::class,
        GitHubRepoViewModelModule::class,
        NetworkModule::class
    ]
)
interface AppComponent {

    fun inject(activity: GitHubRepoListActivity)

}


@Module
class AppModule() {

}

