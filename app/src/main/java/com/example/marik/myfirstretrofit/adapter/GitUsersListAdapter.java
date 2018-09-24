package com.example.marik.myfirstretrofit.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.marik.myfirstretrofit.R;
import com.example.marik.myfirstretrofit.client.GitUser;

import java.util.ArrayList;
import java.util.List;

public class GitUsersListAdapter extends RecyclerView.Adapter<GitUserViewHolder> {
    List<GitUser> gitUsers = new ArrayList<>();

    public GitUsersListAdapter(List<GitUser> gitUsers) {
        this.gitUsers = gitUsers;
    }

    @NonNull
    @Override
    public GitUserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.git_user_layout,parent);
        return new GitUserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GitUserViewHolder holder, int position) {
        GitUser gitUser = gitUsers.get(position);
        holder.mName.setText(gitUser.getLogin());
        holder.mUrl.setText(gitUser.getUrl());
        holder.mOrganization.setText(gitUser.getOrganizations_url());
    }

    @Override
    public int getItemCount() {
        return gitUsers.size();
    }
}
