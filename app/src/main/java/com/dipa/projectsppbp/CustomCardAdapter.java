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

public class CustomCardAdapter extends ArrayAdapter<Card> {

    private static final  String Tag = "CustomCardAdapter";

    private Context mContext;
    private int mResource;

    public CustomCardAdapter(@NonNull Context context, int resource, ArrayList<Card> cardArrayList) {
        super(context, resource, cardArrayList);
        this.mContext = context;
        this.mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        String judul = getItem(position).getJudul();
        int gambar = getItem(position).getImage();

        View result;
        ViewHolder holder;

        if (convertView == null){
            LayoutInflater inflater = LayoutInflater.from(mContext);
            convertView = inflater.inflate(mResource, parent, false);
            holder = new ViewHolder();
            holder.title = convertView.findViewById(R.id.judul);
            holder.image = convertView.findViewById(R.id.image);
            result = convertView;
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
            result = convertView;
        }

        holder.image.setImageResource(gambar);
        holder.title.setText(judul);

        return result;
    }

    private static class ViewHolder{
        ImageView image;
        TextView title;
    }
}
