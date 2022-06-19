/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Projects;

import business.UserAccount.UserAccount;

/**
 *
 * @author Saamu
 */
@SuppressWarnings("unchecked")
public class Projects {
    private String name,description,startdate,enddate,status,skills;
    private UserAccount projectmanager;
    private double budget;
    private int id;
    private static int count = 1;

   
    public Projects() {
        id = count;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
     public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UserAccount getProjectManager() {
        return projectmanager;
    }

    public void setProjectManager(UserAccount projectmanager) {
        this.projectmanager = projectmanager;
    }

    public String getStartDate() {
        return startdate;
    }

    public void setStartDate(String startdate) {
        this.startdate = startdate;
    }

    public String getEndDate() {
        return enddate;
    }

    public void setEndDate(String enddate) {
        this.enddate = enddate;
    }
    
    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
    
    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return name;
    }
}