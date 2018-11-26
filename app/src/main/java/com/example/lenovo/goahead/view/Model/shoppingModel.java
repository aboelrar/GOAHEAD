package com.example.lenovo.goahead.view.Model;

import com.example.lenovo.goahead.R;
import com.example.lenovo.goahead.view.interfaces.interfaceMVP;
import com.example.lenovo.goahead.view.list.catList;

import java.util.ArrayList;

public class shoppingModel implements interfaceMVP.interfaces.Model {
    @Override
    public ArrayList getdata() {
        ArrayList<catList>arrayList=new ArrayList<catList>();
        arrayList.add(new catList(R.drawable.addidas,"https://www.adidas.com/us"));
        arrayList.add(new catList(R.drawable.alexpress,"https://ar.aliexpress.com/"));
        arrayList.add(new catList(R.drawable.nike,"https://www.nike.com/eg/en_gb/"));
        arrayList.add(new catList(R.drawable.addidas,"https://www.adidas.com/us"));
        arrayList.add(new catList(R.drawable.alexpress,"https://ar.aliexpress.com/"));
        arrayList.add(new catList(R.drawable.nike,"https://www.nike.com/eg/en_gb/"));

        return arrayList;
    }
}
