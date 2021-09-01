package com.example.calculator.view;

import static android.content.ContentValues.TAG;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.calculator.R;
import com.example.calculator.databinding.ActivityMainBinding;
import com.example.calculator.viewmodel.MainViewModel;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityMainBinding binding;

    private MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String TAG = "zero to appear";
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.display.setText(R.string.zero);

        viewModel = new ViewModelProvider(this).get(MainViewModel.class);
        viewModel.getDisplayString().observe(this, s -> binding.display.setText(s));

        // all the event listeners for each button
        binding.ac.setOnClickListener(this);
        binding.plusMinus.setOnClickListener(this);
        binding.modulo.setOnClickListener(this);
        binding.division.setOnClickListener(this);
        binding.seven.setOnClickListener(this);
        binding.eight.setOnClickListener(this);
        binding.nine.setOnClickListener(this);
        binding.multi.setOnClickListener(this);
        binding.four.setOnClickListener(this);
        binding.five.setOnClickListener(this);
        binding.six.setOnClickListener(this);
        binding.minus.setOnClickListener(this);
        binding.one.setOnClickListener(this);
        binding.two.setOnClickListener(this);
        binding.three.setOnClickListener(this);
        binding.plus.setOnClickListener(this);
        binding.zero.setOnClickListener(this);
        binding.dot.setOnClickListener(this);
        binding.equal.setOnClickListener(view -> viewModel.equal(binding.display.getText().toString()));
    }

    @Override
    public void onClick(View view) {
//        String logg = binding.display.getText().toString();
//        String toPut = "here is the zero " + logg;
//                Log.d(TAG,toPut);
        int id = view.getId();

//        if (binding.display.getText().toString() == "0" ) {
//            binding.display.setText("");
//        };

        if ("0".equals(binding.display.getText().toString())) {
            binding.display.setText("");
        }
        if (id == R.id.ac) binding.display.setText(R.string.zero);
        else if (id == R.id.plusMinus)
            binding.display.append(getResources().getString(R.string.minus));
        else if (id == R.id.modulo)
            binding.display.append(getResources().getString(R.string.modulo));
        else if (id == R.id.division)
            binding.display.append(getResources().getString(R.string.division));
        else if (id == R.id.seven) binding.display.append(getResources().getString(R.string.seven));
        else if (id == R.id.eight) binding.display.append(getResources().getString(R.string.eight));
        else if (id == R.id.nine) binding.display.append(getResources().getString(R.string.nine));
        else if (id == R.id.multi) binding.display.append(getResources().getString(R.string.multi));
        else if (id == R.id.four) binding.display.append(getResources().getString(R.string.four));
        else if (id == R.id.five) binding.display.append(getResources().getString(R.string.five));
        else if (id == R.id.six) binding.display.append(getResources().getString(R.string.six));
        else if (id == R.id.minus) binding.display.append(getResources().getString(R.string.minus));
        else if (id == R.id.one) binding.display.append(getResources().getString(R.string.one));
        else if (id == R.id.two) binding.display.append(getResources().getString(R.string.two));
        else if (id == R.id.three) binding.display.append(getResources().getString(R.string.three));
        else if (id == R.id.plus) binding.display.append(getResources().getString(R.string.plus));
        else if (id == R.id.zero) binding.display.append(getResources().getString(R.string.zero));
        else if (id == R.id.dot) binding.display.append(getResources().getString(R.string.dot));
    }
}