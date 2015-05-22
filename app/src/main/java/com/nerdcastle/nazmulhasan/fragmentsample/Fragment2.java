package com.nerdcastle.nazmulhasan.fragmentsample;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by nazmulHasan on 5/22/2015.
 */
public class Fragment2 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstance){
        return inflater.inflate(R.layout.fragment_2,container,false);
    }

}
