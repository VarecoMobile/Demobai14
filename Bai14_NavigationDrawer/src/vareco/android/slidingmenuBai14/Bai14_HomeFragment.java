package vareco.android.slidingmenuBai14;

import info.androidhive.slidingmenu.R;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Bai14_HomeFragment extends Fragment {
	
	public Bai14_HomeFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.bai14_fragment_home, container, false);
         
        return rootView;
    }
}
