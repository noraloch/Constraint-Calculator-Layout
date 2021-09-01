package com.example.calculator.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import org.mariuszgromada.math.mxparser.Expression;

public class MainViewModel extends ViewModel {
    private final MutableLiveData<String> displayString = new MutableLiveData<>();

    public LiveData<String> getDisplayString() {
        return displayString;
    }

    public void equal(String userExpression) {
        userExpression = userExpression.replaceAll("×", "*");
        userExpression = userExpression.replaceAll("÷", "/");

        Expression exp = new Expression((userExpression));
        String result = String.valueOf(exp.calculate());

        displayString.setValue(result);

    }
}
