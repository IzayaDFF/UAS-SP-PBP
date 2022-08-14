package com.dipa.projectsppbp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomListAdapter extends ArrayAdapter<Konten> {

    private Context mContext;
    int mResource;

    public CustomListAdapter(@NonNull Context context, int resource, ArrayList<Konten> ar) {
        super(context, resource, ar);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        String judul = getItem(position).getJudul();
        String penulis = getItem(position).getPenulis();
        String tanggal = getItem(position).getTanggal();
        int gambar = getItem(position).getGambar();

        //Konten konten = new Konten(gambar, judul, penulis, tanggal);

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);

        TextView tvJudul = convertView.findViewById(R.id.judul);
        TextView tvPenulis = convertView.findViewById(R.id.penulis);
        TextView tvTanggal = convertView.findViewById(R.id.tanggal);
        ImageView ivGambar = convertView.findViewById(R.id.gambar);

        tvJudul.setText(judul);
        tvPenulis.setText(penulis);
        tvTanggal.setText(tanggal);
        ivGambar.setImageResource(gambar);

        return convertView;
    }
}
