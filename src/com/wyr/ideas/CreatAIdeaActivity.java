package com.wyr.ideas;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class CreatAIdeaActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_a_idea);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.create_a_idea, menu);
        return true;
    }
    
}
