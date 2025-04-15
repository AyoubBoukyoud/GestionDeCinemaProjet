// src/model/Report.java
package model;

public class Report {
    private final String title;
    private final double revenue;

    public Report(String title, double revenue) {
        this.title   = title;
        this.revenue = revenue;
    }

    public String getTitle()   { return title; }
    public double getRevenue() { return revenue; }
}
