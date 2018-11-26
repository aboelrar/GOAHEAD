package com.example.lenovo.goahead.view.list;

public class catList {
    int logo;
    String url;
    boolean fav=false;
    public catList(boolean fav)
    {
        this.fav=fav;

    }
    public catList(int logo,String url) {
        this.logo = logo;
        this.url=url;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isFav() {
        return fav;
    }

    public void setFav(boolean fav) {
        this.fav = fav;
    }
}
