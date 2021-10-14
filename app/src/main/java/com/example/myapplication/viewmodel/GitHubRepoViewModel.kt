package com.example.myapplication.viewmodel

import android.util.Log
import androidx.lifecycle.*
import com.example.myapplication.model.Item
import com.example.myapplication.usecase.GitHubRepoUseCase
import kotlinx.coroutines.launch

class GitHubRepoViewModel constructor(val gitHubRepoUseCase: GitHubRepoUseCase) :
    ViewModel() {

    private val _githubList = MutableLiveData<List<Item>>()
    val githubList: LiveData<List<Item>> = _githubList

    init {
        viewModelScope.launch {
            try {
                _githubList.value = gitHubRepoUseCase.getRepoList()
            } catch (exception: Exception) {
                Log.e("Guhan", exception.toString())
            }
        }
    }
}

class GitHubRepoViewModelFactory(
    private val gitHubRepoUseCase: GitHubRepoUseCase
) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return GitHubRepoViewModel(gitHubRepoUseCase) as T
    }
}