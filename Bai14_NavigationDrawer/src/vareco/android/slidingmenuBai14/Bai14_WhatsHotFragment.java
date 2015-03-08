package vareco.android.slidingmenuBai14;

import info.androidhive.slidingmenu.R;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Bai14_WhatsHotFragment extends Fragment {
	
	public Bai14_WhatsHotFragment(){}
	
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.bai14_fragment_whats_hot, container, false);
         
        return rootView;
    }
}
