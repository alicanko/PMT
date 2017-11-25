/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Date;

/**
 *
 * @author lenovo
 */
public class Project {
    String name;
    String description;
    int projectId;
    double determinedBudget;
    double estimatedCost;
    Date startDate;
    Date endDate;
    
    public String getName(){
        return name;
    }
   
    public String getDescription(){
        return description;
    }
    
    public int getProjectId(){
        return projectId;
    }
          
    public double getDeterminedBudget(){
        return determinedBudget;
    }
    
    public double getEstimatedCost(){
        return estimatedCost;
    }
    
    public Date getStartDate(){
        return startDate;
    }
    
    public Date getEndDate(){
        return endDate;
    }
}
