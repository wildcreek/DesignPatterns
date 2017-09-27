package com.wildcreek.designpatterns;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.wildcreek.designpatterns.decorator.Candy;
import com.wildcreek.designpatterns.decorator.Light;
import com.wildcreek.designpatterns.decorator.PineChristmasTree;
import com.wildcreek.designpatterns.observer.ClassBell;
import com.wildcreek.designpatterns.observer.Student;
import com.wildcreek.designpatterns.observer.Teacher;
import com.wildcreek.designpatterns.strategy.Fisherman;
import com.wildcreek.designpatterns.strategy.SpearStrategy;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //strategy 渔夫捕鱼的三种策略：钓鱼、网捕、叉鱼
        Fisherman fisherman = new Fisherman(new SpearStrategy());
        fisherman.startFishing();
        //observer 铃声响了，老师走向教室，学生准备上课
        ClassBell classBell = new ClassBell();
        classBell.registerObserver(new Student());
        classBell.registerObserver(new Teacher());
        classBell.setChanged();
        classBell.timePasses();
        //decorator 一棵装饰有 糖果和灯的松木圣诞树
        Light light = new Light(new PineChristmasTree());
        Log.e("decorator" , light.display());
        Log.e("decorator" , light.cost() +"");
        Candy candy = new Candy(light);
        Log.e("decorator" , candy.display());
        Log.e("decorator" , candy.cost() +"");
    }
}
