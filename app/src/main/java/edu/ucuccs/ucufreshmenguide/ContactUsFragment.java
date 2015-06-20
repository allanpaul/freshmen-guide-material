package edu.ucuccs.ucufreshmenguide;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ContactUsFragment extends Fragment {
    public static final String TAG = "handbook";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_contactus, container, false);
    }

/*    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        List<String> content = new ArrayList<>();
        content.add("list");
        content.add("list");
        content.add("list");
        content.add("list");
        content.add("list");
        content.add("list");
        content.add("list");
        ListView listView = (ListView) getActivity().findViewById(R.id.listView);
        listView.setAdapter(new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, content));
    }*/
}
