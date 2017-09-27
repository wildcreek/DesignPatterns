package com.wildcreek.designpatterns;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

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
        //strategy
        Fisherman fisherman = new Fisherman(new SpearStrategy());
        fisherman.startFishing();
        //observer
        ClassBell classBell = new ClassBell();
        classBell.registerObserver(new Student());
        classBell.registerObserver(new Teacher());
        classBell.setChanged();
        classBell.timePasses();
    }
}
