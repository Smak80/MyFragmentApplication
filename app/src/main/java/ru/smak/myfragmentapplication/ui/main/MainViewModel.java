package ru.smak.myfragmentapplication.ui.main;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import ru.smak.myfragmentapplication.Factorial;

// Model-View-ViewModel
public class MainViewModel extends ViewModel {
    private int n = 0;
    private Factorial f = new Factorial();
    public final MutableLiveData<Double> result = new MutableLiveData<>();

    public void setN(String value){
        try {
            n = Integer.parseInt(value);
            result.postValue(f.calc(n));
        } catch (NumberFormatException e){
            n = 0;
        }
    }
}