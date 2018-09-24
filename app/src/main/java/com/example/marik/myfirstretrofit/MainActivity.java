package com.example.marik.myfirstretrofit;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;

import com.example.marik.myfirstretrofit.adapter.GitUsersListAdapter;
import com.example.marik.myfirstretrofit.client.ApiManager;
import com.example.marik.myfirstretrofit.client.GitUser;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private GitUsersListAdapter listAdapter;
    private List<GitUser> gitUsers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        handleIntent(getIntent());
    }

    @Override
    protected void onNewIntent(Intent intent) {
        //  ...
        handleIntent(intent);
    }

    private void handleIntent(Intent intent) {
        if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
            String query = intent.getStringExtra(SearchManager.QUERY);
            int limit = 15;
            //use the query to search your data somehow
            Call<List<GitUser>> gitUserCall = ApiManager.gitClientApi().getUsersByName(query,limit);
            gitUserCall.enqueue(new Callback<List<GitUser>>() {
                @Override
                public void onResponse(Call<List<GitUser>> call, Response<List<GitUser>> response) {
                    gitUsers = response.body();
                }

                @Override
                public void onFailure(Call<List<GitUser>> call, Throwable t) {

                }
            });
            listAdapter = new GitUsersListAdapter(gitUsers);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu, menu);

        // Associate searchable configuration with the SearchView
        SearchManager searchManager =
                (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView =
                (SearchView) menu.findItem(R.id.search).getActionView();
        searchView.setSearchableInfo(
                searchManager != null ? searchManager.getSearchableInfo(getComponentName()) : null);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
