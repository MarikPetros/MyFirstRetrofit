package com.example.marik.myfirstretrofit.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.marik.myfirstretrofit.R;

class GitUserViewHolder extends RecyclerView.ViewHolder{
    TextView mName;
    TextView mUrl;
    TextView mOrganization;

    public GitUserViewHolder(View itemView) {
        super(itemView);
        mName = itemView.findViewById(R.id.user_name);
        mUrl = itemView.findViewById(R.id.user_url);
        mOrganization = itemView.findViewById(R.id.user_organization);
    }
}
