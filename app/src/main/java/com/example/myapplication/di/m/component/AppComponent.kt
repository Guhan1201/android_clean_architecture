package com.example.myapplication.di.m.component

import com.example.myapplication.view.GitHubRepoListActivity
import com.example.myapplication.di.m.modules.GitHubRepoModule
import com.example.myapplication.di.m.modules.GitHubRepoViewModelModule
import com.example.myapplication.di.m.modules.NetworkModule
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

