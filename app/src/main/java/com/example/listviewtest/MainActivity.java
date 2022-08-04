package com.example.listviewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
//private String[]data = {"Apple","Banana","Cherries","Grapes","Kiwi","Lemon","Orange","Peach","Strawberry","Watermelon",""};
    private List<Fruit> fruitList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,data);
        initFruit();//初始化水果
        FruitAdapter adapter = new FruitAdapter(MainActivity.this,R.layout.fruit_item,fruitList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
    private void initFruit(){
        for (int i= 0;i<2;i++){
            Fruit apple = new Fruit("Apple",R.drawable.apple);
            fruitList.add(apple);
            Fruit banana = new Fruit("Banana",R.drawable.banana);
            fruitList.add(banana);
            Fruit cherries = new Fruit("Cherries",R.drawable.cherries);
            fruitList.add(cherries);
            Fruit grapes = new Fruit("Grapes",R.drawable.grapes);
            fruitList.add(grapes);
            Fruit kiwi = new Fruit("Kiwi",R.drawable.kiwi);
            fruitList.add(kiwi);
            Fruit lemon = new Fruit("Lemon",R.drawable.lemon);
            fruitList.add(lemon);
            Fruit Orange = new Fruit("Orange",R.drawable.orange);
            fruitList.add(Orange);
            Fruit Peach = new Fruit("Peach",R.drawable.peach);
            fruitList.add(Peach);
            Fruit Strawberry = new Fruit("Strawberry",R.drawable.strawberry);
            fruitList.add(Strawberry);
            Fruit Watermelon = new Fruit("Watermelon",R.drawable.watermelon);
            fruitList.add(Watermelon);
        }
    }
}