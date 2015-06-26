package edu.ucuccs.ucufreshmenguide;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.alexjlockwood.*;

public class FragmentUCUHymn extends Fragment {
    public static final String TAG = "hymn";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.ucuhymn, container, false);

        /*Intent i = new Intent(getActivity(), ViewingHymn.class);
        int index = 2;
        i.putExtra("index_key", index);
        startActivity(i);*/
        final PlayPauseView view = (PlayPauseView) rootView.findViewById(R.id.play_pause_view);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.toggle();
            }
        });


        return rootView;
    }

}
