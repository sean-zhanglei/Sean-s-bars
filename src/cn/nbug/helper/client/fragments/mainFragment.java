package cn.nbug.helper.client.fragments;

import android.os.Bundle;
import cn.nbug.helper.client.R;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class mainFragment extends Fragment {
    //三个一般必须重载的方法    @Override   
	public void onCreate(Bundle savedInstanceState)   
	{ 
		// TODO Auto-generated method stub      
		super.onCreate(savedInstanceState);    
		}   
	@Override   
	public View onCreateView(LayoutInflater inflater, ViewGroup container,    
			Bundle savedInstanceState)   
	{        
		return inflater.inflate(R.layout.mainfragment, container, false);   
		}   
	@Override   
	public void onPause()  
	{      
		// TODO Auto-generated method stub       
		super.onPause();       
		}
}
	

