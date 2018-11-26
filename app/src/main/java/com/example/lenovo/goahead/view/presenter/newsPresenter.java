package com.example.lenovo.goahead.view.presenter;

import com.example.lenovo.goahead.view.Model.catModel;
import com.example.lenovo.goahead.view.Model.newsModel;
import com.example.lenovo.goahead.view.interfaces.interfaceMVP;

import java.util.ArrayList;

public class newsPresenter implements interfaceMVP.interfaces.presenter {

    private interfaceMVP.interfaces.Model model;
    private interfaceMVP.interfaces.View views;


    public newsPresenter(interfaceMVP.interfaces.View view) {
        this.views = view;
        initPresenter();
    }
    private void initPresenter() {
        model = new newsModel();
        views.element();
    }

    @Override
    public void getData() {
        ArrayList data=model.getdata();
        views.setviewdata(data);
    }
}
