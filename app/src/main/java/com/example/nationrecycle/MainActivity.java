package com.example.nationrecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCategory;
    private ArrayList<Nation> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCategory = findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list.addAll(NationData.getListData());
        setActionBarTitle("Mode List");
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListNationAdapter listNationAdapter = new ListNationAdapter(this);
        listNationAdapter.setListNation(list);
        rvCategory.setAdapter(listNationAdapter);
    }

    private void showRecyclerGrid(){
        rvCategory.setLayoutManager(new GridLayoutManager(this, 2));
        GridNationAdapter gridNationAdapter = new GridNationAdapter(this);
        gridNationAdapter.setListNation(list);
        rvCategory.setAdapter(gridNationAdapter);
    }

    private void showRecyclerCardView(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        CardViewNationAdapter cardViewNationAdapter = new CardViewNationAdapter(this);
        cardViewNationAdapter.setListNation(list);
        rvCategory.setAdapter(cardViewNationAdapter);
    }

    private void setActionBarTitle(String title){
        getSupportActionBar().setTitle(title);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_list:
                setActionBarTitle("Mode List");
                showRecyclerList();
                break;
            case R.id.action_grid:
                setActionBarTitle("Mode Grid");
                showRecyclerGrid();
                break;
            case R.id.action_cardview:
                setActionBarTitle("Mode CardView");
                showRecyclerCardView();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
