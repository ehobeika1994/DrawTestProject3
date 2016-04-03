package org.me.myandroidstuff;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class DrawTestProject3Activity extends Activity 
{
	private LinearLayout aviewgroup;
	private GPView aview;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        aviewgroup = (LinearLayout)findViewById(R.id.topView);
        aview = new GPView(this);
        
        aviewgroup.addView(aview);
    }
}