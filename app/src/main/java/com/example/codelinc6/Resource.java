
package com.example.codelinc6;

class Resource {

    protected String resName;
    protected String url;
    protected String description;
    protected int filterType1;
    protected int filterType2;

    public Resource(String resName, String url, String description, int filterType1, int filterType2) {
        this.resName = resName;
        this.url = url;
        this.description = description;
        this.filterType1 = filterType1;
        this.filterType2 = filterType2;

    }

    public String getResName() {
        return resName;
    }

    public void setResName(String resName) {
        this.resName = resName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getFilterType1() {
        return filterType1;
    }

    public void setFilterType1(int filterType1) {
        this.filterType1 = filterType1;
    }

    public int getFilterType2() {
        return filterType2;
    }

    public void setFilterType2(int filterType2) {
        this.filterType2 = filterType2;
    }

    public static String getURL(Resource _resource) {
        return _resource.getUrl();
    }

    public static String getNAME(Resource _resource) {
        return _resource.getResName();
    }

}

