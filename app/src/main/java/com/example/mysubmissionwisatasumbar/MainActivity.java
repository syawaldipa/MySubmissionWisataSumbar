package com.example.mysubmissionwisatasumbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvWisataSumbar;
    private ArrayList<WisataSumbar> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvWisataSumbar = findViewById(R.id.rv_WisataSumbar);
        rvWisataSumbar.setHasFixedSize(true);

        list.addAll(WisataSumbarData.getListData());
        showRecyclerList();
    }
    private void showRecyclerList(){
        rvWisataSumbar.setLayoutManager(new LinearLayoutManager(this));
        ListWisataSumbarAdapter listWisataSumbarAdapter = new ListWisataSumbarAdapter(list);
        rvWisataSumbar.setAdapter(listWisataSumbarAdapter);
    }
    private void showRecyclerGrid(){
        rvWisataSumbar.setLayoutManager(new GridLayoutManager(this, 2));
        GridWisataSumbarAdapter gridWisataSumbarAdapter = new GridWisataSumbarAdapter(list);
        rvWisataSumbar.setAdapter(gridWisataSumbarAdapter);
    }

    private void showRecyclerCardView(){
        rvWisataSumbar.setLayoutManager(new LinearLayoutManager(this));
        CardViewWisataSumbarAdapter cardViewWisataSumbarAdapter = new CardViewWisataSumbarAdapter(list);
        rvWisataSumbar.setAdapter(cardViewWisataSumbarAdapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }
    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_list:
                showRecyclerList();
                break;
            case R.id.action_grid:
                showRecyclerGrid();
                break;
            case R.id.action_cardview:
                showRecyclerCardView();
                break;
            case R.id.About_me:

                break;
        }
    }
}
