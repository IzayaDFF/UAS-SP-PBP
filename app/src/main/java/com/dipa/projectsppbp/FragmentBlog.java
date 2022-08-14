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

public class FragmentBlog extends Fragment {

    ListView customListView;
    CustomListAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blog,container,false);

        customListView = view.findViewById(R.id.customListView);
        ArrayList<Konten> ar_konten = new ArrayList<>();
        ar_konten.add(new Konten(R.drawable.logoz, "Harga kurma di pasaran naik drastis",
                "Diffa Rahmanda", "08/08/2022"));
        ar_konten.add(new Konten(R.drawable.logoz, "Jual nasi kotak Rp. 25.000 per pack",
                "Diffa Rahmanda", "09/08/2022"));
        ar_konten.add(new Konten(R.drawable.logoz, "Sarung cap Gajah Duduk terkenal dengan kualitasnya",
                "Diffa Rahmanda", "10/08/2022"));
        ar_konten.add(new Konten(R.drawable.logoz, "Grosir sendal untuk hibah mesjid",
                "Diffa Rahmanda", "11/08/2022"));
        ar_konten.add(new Konten(R.drawable.logoz, "Masyarakat menyukai tajil yang manis untuk berbuka",
                "Diffa Rahmanda", "12/08/2022"));

        adapter = new CustomListAdapter(getActivity(), R.layout.single_layout_list, ar_konten);
        customListView.setAdapter(adapter);

        return view;
    }
}
