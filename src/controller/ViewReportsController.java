// src/controller/ViewReportsController.java
package controller;

import model.Report;
import model.ReportModel;

import java.util.List;

public class ViewReportsController {

    /** Returns all report rows for the view to display */
    public List<Report> getReports() {
        return ReportModel.fetchReports();
    }
}
