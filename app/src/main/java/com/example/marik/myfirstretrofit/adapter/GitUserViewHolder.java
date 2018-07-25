package com.example.marik.myfirstretrofit.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.marik.myfirstretrofit.R;

class GitUserViewHolder extends RecyclerView.ViewHolder{
    TextView mName;
    TextView mCompany;
    TextView mLocation;

    public GitUserViewHolder(View itemView) {
        super(itemView);
        mName = itemView.findViewById(R.id.user_name);
        mCompany = itemView.findViewById(R.id.user_company);
        mLocation = itemView.findViewById(R.id.user_location);
    }
}
