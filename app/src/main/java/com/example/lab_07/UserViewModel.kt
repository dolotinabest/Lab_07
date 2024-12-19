package com.example.lab_07

import User
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UserViewModel : ViewModel() {
    private val _userList: MutableLiveData<List<User>> = MutableLiveData(UserData.getUsers())
    val userList: LiveData<List<User>> get() = _userList
    fun updateListUsers() {
        _userList.value = UserData.getAnotherUsers()
    }
    fun getListUsers() = userList
}
