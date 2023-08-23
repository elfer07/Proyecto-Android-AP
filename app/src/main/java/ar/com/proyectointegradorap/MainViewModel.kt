package ar.com.proyectointegradorap

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    private var _textOne = MutableLiveData<String>()
    private var _textTwo = MutableLiveData<String>()

    fun isTextSame(one: String, two: String): Boolean {
        _textOne.value = one
        _textTwo.value = two
        return _textOne.value == _textTwo.value
    }
}