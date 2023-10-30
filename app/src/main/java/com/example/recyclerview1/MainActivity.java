package com.example.recyclerview1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerview1.Adapter.MycustomAdapter;
import com.example.recyclerview1.Model.listmodel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<listmodel> listmodelList;
    RecyclerView recyclerView;
    MycustomAdapter myCustomAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycleview);
        listmodelList=new ArrayList<>();
                listmodel c1= new listmodel( "Roman ",7,R.drawable.bike);
        listmodel c2= new listmodel( "Roman ",7,R.drawable.bike);
        listmodel c3= new listmodel( "Roman ",7,R.drawable.bike);
        listmodel c4= new listmodel( "Roman ",7,R.drawable.bike);
        listmodel c5= new listmodel( "Roman ",7,R.drawable.bike);
        listmodelList.add(c1);
        listmodelList.add(c2);
        listmodelList.add(c3);
        listmodelList.add(c4);
        listmodelList.add(c5);
        myCustomAdapter=new MycustomAdapter(listmodelList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myCustomAdapter);

    }
}