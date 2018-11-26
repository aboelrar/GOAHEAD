package com.example.lenovo.goahead.view.Model;

import com.example.lenovo.goahead.R;
import com.example.lenovo.goahead.view.interfaces.interfaceMVP;
import com.example.lenovo.goahead.view.list.catList;

import java.util.ArrayList;

public class newsModel implements interfaceMVP.interfaces.Model{
    @Override
    public ArrayList getdata() {
        ArrayList<catList>arrayList=new ArrayList<catList>();
        arrayList.add(new catList(R.drawable.sabaa,"https://www.okaz.com.sa/"));
        arrayList.add(new catList(R.drawable.aggel,"https://ajel.sa/"));
        arrayList.add(new catList(R.drawable.anbaa,"https://www.spa.gov.sa/"));
        arrayList.add(new catList(R.drawable.sabaa,"https://www.okaz.com.sa/"));
        arrayList.add(new catList(R.drawable.aggel,"https://ajel.sa/"));
        arrayList.add(new catList(R.drawable.anbaa,"https://www.spa.gov.sa/"));

        return arrayList;
    }
}
