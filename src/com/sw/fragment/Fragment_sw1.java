package com.sw.fragment;

import net.yasite.test.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

public class Fragment_sw1 extends Fragment{
   public int[] imageid =new int[]{R.id.btn_add_addresslist,R.id.btn_cancel_orderlist_item,
		   R.id.btn_car_confirm,R.id.btn_car_del,R.id.btn_checkout,R.id.btn_delete_addressinfo,
		   R.id.btn_exit,R.id.btn_login};
   GridView gv;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.fragment_image, null);
		return view;
	}
  
}
