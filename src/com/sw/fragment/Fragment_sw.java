package com.sw.fragment;

import net.yasite.test.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.ImageButton;

public class Fragment_sw extends Fragment implements OnClickListener{
  ImageButton fl,yay;
  AutoCompleteTextView shou;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.fragment_viewparger, null);
		fl = (ImageButton) view.findViewById(R.id.button1);
		yay = (ImageButton) view.findViewById(R.id.button2);
		shou = (AutoCompleteTextView) view.findViewById(R.id.autoCompleteTextView1);
		fl.setOnClickListener(this);
		yay.setOnClickListener(this);
		return view;
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.button1:
			
			break;

        case R.id.button2:
			
			break;
		}
	}
  
}
