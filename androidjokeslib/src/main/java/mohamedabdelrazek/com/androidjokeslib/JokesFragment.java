package mohamedabdelrazek.com.androidjokeslib;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class JokesFragment extends Fragment {
    TextView mJokesTextView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_jokes, container, false);
        mJokesTextView = (TextView) view.findViewById(R.id.joke_txt_view_id);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mJokesTextView.setText(getArguments().getString(Intent.EXTRA_TEXT, "Some thing went wrong :("));
    }
}
