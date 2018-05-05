package com.example.sharanya.MyPassbook;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Sharanya on 14/04/2018.
 */

public class FragmentExplore extends Fragment {
    View view;
    public FragmentExplore() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.careerprep_fragment, container, false);
        return view;

    }
}
