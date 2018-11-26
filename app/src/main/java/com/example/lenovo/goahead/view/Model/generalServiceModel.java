package com.example.lenovo.goahead.view.Model;

import com.example.lenovo.goahead.R;
import com.example.lenovo.goahead.view.interfaces.interfaceMVP;
import com.example.lenovo.goahead.view.list.catList;

import java.util.ArrayList;

public class generalServiceModel implements interfaceMVP.interfaces.Model {
    @Override
    public ArrayList getdata() {
        ArrayList<catList>arrayList=new ArrayList<catList>();
        arrayList.add(new catList(R.drawable.careem,"https://www.careemplus.com/"));
        arrayList.add(new catList(R.drawable.uber,"https://www.uber.com/ar/eg/"));
        arrayList.add(new catList(R.drawable.otlob,"https://www.otlob.com/"));
        arrayList.add(new catList(R.drawable.careem,"https://www.careemplus.com/"));
        arrayList.add(new catList(R.drawable.uber,"https://www.uber.com/ar/eg/"));
        arrayList.add(new catList(R.drawable.otlob,"https://www.otlob.com/"));

        return arrayList;
    }
}
