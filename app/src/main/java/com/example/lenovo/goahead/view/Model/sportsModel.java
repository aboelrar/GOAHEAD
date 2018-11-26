package com.example.lenovo.goahead.view.Model;

import com.example.lenovo.goahead.R;
import com.example.lenovo.goahead.view.interfaces.interfaceMVP;
import com.example.lenovo.goahead.view.list.catList;

import java.util.ArrayList;

public class sportsModel implements interfaceMVP.interfaces.Model  {
    @Override
    public ArrayList getdata() {
        ArrayList<catList>arrayList=new ArrayList<catList>();
        arrayList.add(new catList(R.drawable.alkebar,"https://www.alkebar.com/"));
        arrayList.add(new catList(R.drawable.spotrtsksa,"http://www.sportksa.net/main/"));
        arrayList.add(new catList(R.drawable.reyadya,"http://arriyadiyah.com/"));
        arrayList.add(new catList(R.drawable.alkebar,"https://www.alkebar.com/"));
        arrayList.add(new catList(R.drawable.spotrtsksa,"http://www.sportksa.net/main/"));
        arrayList.add(new catList(R.drawable.reyadya,"http://arriyadiyah.com/"));

        return arrayList;
    }
}
