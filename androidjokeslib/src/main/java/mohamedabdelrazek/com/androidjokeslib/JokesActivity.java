package mohamedabdelrazek.com.androidjokeslib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class JokesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes);
        if (savedInstanceState == null) {
            JokesFragment firstFragment = new JokesFragment();
            firstFragment.setArguments(getIntent().getExtras());
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.activity_jokes, firstFragment).commit();
        }
    }
}
