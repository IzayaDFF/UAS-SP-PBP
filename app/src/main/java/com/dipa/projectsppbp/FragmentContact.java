package com.dipa.projectsppbp;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentContact extends Fragment {

    private static final String TAG = "FragmentContact";

    private EditText username, password, name;
    private Button button_login;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_contact,container,false);

        username = view.findViewById(R.id.reg_username);
        password = view.findViewById(R.id.reg_password);
        name = view.findViewById(R.id.et_nama);
        button_login = view.findViewById(R.id.btnDaftar);

        button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = username.getText().toString().trim();
                String pass = password.getText().toString().trim();

                if(TextUtils.isEmpty(user) && TextUtils.isEmpty(pass))
                {
                    Toast.makeText(getActivity(), "Isi Data Diri Kamu",
                            Toast.LENGTH_SHORT).show();
                }else
                {
                    Toast.makeText(getActivity(), "Kontak Kamu Telah Kami Terima",
                            Toast.LENGTH_SHORT).show();

                }
            }
        });

        return view;
    }
}
