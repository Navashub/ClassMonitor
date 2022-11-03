package com.example.classmonitor.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.classmonitor.R;

public class LoginFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        /*Button button = (Button)

        button.setOnClickListener(Navigation.
                createNavigateOnClickListener(R.id.action_LoginFragment_to_homeFragment2, null));*/

        return inflater.inflate(R.layout.fragment_login, container, false);
    }
}
