package com.dipa.projectsppbp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class FragmentPortofolio extends Fragment {

    ListView listView;
    ArrayList<Card> cardArrayList = new ArrayList<>();
    CustomCardAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_portofolio,container,false);

        cardArrayList.clear();
        listView = view.findViewById(R.id.listView);

        cardArrayList.add(new Card(R.drawable.portofolio1, "Portofolio 1"));
        cardArrayList.add(new Card(R.drawable.portofolio2, "Portofolio 2"));
        cardArrayList.add(new Card(R.drawable.portofolio3, "Portofolio 3"));
        cardArrayList.add(new Card(R.drawable.portofolio4, "Portofolio 4"));
        cardArrayList.add(new Card(R.drawable.portofolio5, "Portofolio 5"));
        cardArrayList.add(new Card(R.drawable.portofolio6, "Portofolio 6"));


        adapter = new CustomCardAdapter(getActivity(), R.layout.single_portofolio,cardArrayList);
        listView.setAdapter(adapter);

        return view;
    }
}
