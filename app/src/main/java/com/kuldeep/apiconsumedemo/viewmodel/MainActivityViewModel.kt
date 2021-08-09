package com.kuldeep.apiconsumedemo.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kuldeep.apiconsumedemo.models.RecyclerList
import com.kuldeep.apiconsumedemo.network.RetrofitInstance
import com.kuldeep.apiconsumedemo.network.RetrofitService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.create

class MainActivityViewModel :ViewModel() {
    lateinit var recyclerListLiveData : MutableLiveData<RecyclerList>

    init {
        recyclerListLiveData=MutableLiveData()
    }

    fun getRecyclerListObservers() : MutableLiveData<RecyclerList>{
        return recyclerListLiveData
    }

    fun makeApiCall(){
        viewModelScope.launch(Dispatchers.IO) {
            val retrofitInstance=RetrofitInstance.getRetrofitInstance().create(RetrofitService::class.java)
            val response=retrofitInstance.getDataFromApi("ny")
            recyclerListLiveData.postValue(response)
        }
    }
}