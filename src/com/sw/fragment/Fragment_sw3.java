package com.sw.fragment;

import net.yasite.test.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;

public class Fragment_sw3 extends Fragment implements OnClickListener{
  ImageView sy,fl,fx,car,my;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.fragment_imagebutton, null);
		sy = (ImageView) view.findViewById(R.id.sw_iv1);
		fl = (ImageView) view.findViewById(R.id.sw_iv2);
		fx = (ImageView) view.findViewById(R.id.sw_iv3);
		car = (ImageView) view.findViewById(R.id.sw_iv4);
		my = (ImageView) view.findViewById(R.id.sw_iv5);
		sy.setOnClickListener(this);
		fl.setOnClickListener(this);
		fx.setOnClickListener(this);
		car.setOnClickListener(this);
		my.setOnClickListener(this);
		return view;
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.sw_iv1:
			
			break;
        case R.id.sw_iv2:
			
			break;
        case R.id.sw_iv3:
	
	        break;
        case R.id.sw_iv4:
	
	        break;
        case R.id.sw_iv5:
	
	        break;
		}
	}
	
}
