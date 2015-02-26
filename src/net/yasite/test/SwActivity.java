package net.yasite.test;

import net.yasite.model.Model;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;



public class SwActivity extends BaseNewActivity {
  android.support.v4.app.FragmentManager fm;
  FragmentTransaction ft;
  Model model;
	@Override
	public void setupView() {
		// TODO Auto-generated method stub
		fm = getSupportFragmentManager();
	     
	}

	@Override
	public void setContent() {
		// TODO Auto-generated method stub
	  setContentView(R.layout.activity_sw);
	}

	@Override
	public void setModel() {
		// TODO Auto-generated method stub
		ft = fm.beginTransaction();
		ft.replace(R.id.Fragment_sw, new Fragment());
		ft.commit();
	}

	@Override
	public boolean getIntentValue() {
		// TODO Auto-generated method stub
		return false;
	}

	

}
