package com.example.lenovo.goahead.view.Model;

import com.example.lenovo.goahead.R;
import com.example.lenovo.goahead.view.interfaces.interfaceMVP;
import com.example.lenovo.goahead.view.list.catList;

import java.util.ArrayList;

public class catModel implements interfaceMVP.interfaces.Model{
    @Override
    public ArrayList getdata() {
        ArrayList<catList>arrayList=new ArrayList<catList>();
        arrayList.add(new catList(R.drawable.cookdoor,"http://www.cookdoor.com.eg/"));
        arrayList.add(new catList(R.drawable.kfc,"https://www.egypt.kfc.me/?gclid=CjwKCAjw39reBRBJEiwAO1m0Odg-uLkPdjHli5m1LqVEq5noayCL66Ac9PJu2K6dhK8u7owja6RgbhoCWY0QAvD_BwE&gclsrc=aw.ds"));
        arrayList.add(new catList(R.drawable.mac,"https://www.mcdonalds.com/us/en-us.html"));
        arrayList.add(new catList(R.drawable.cookdoor,"http://www.cookdoor.com.eg/"));
        arrayList.add(new catList(R.drawable.kfc,"https://www.egypt.kfc.me/?gclid=CjwKCAjw39reBRBJEiwAO1m0Odg-uLkPdjHli5m1LqVEq5noayCL66Ac9PJu2K6dhK8u7owja6RgbhoCWY0QAvD_BwE&gclsrc=aw.ds"));
        arrayList.add(new catList(R.drawable.mac,"https://www.mcdonalds.com/us/en-us.html"));

        return arrayList;
    }
}
