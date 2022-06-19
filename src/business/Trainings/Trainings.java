/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Trainings;

import business.Projects.Projects;
import business.UserAccount.UserAccount;

/**
 *
 * @author Saamu
 */
@SuppressWarnings("unchecked")
public class Trainings {
    private String name,description,status;
    private UserAccount projectmanager;
    private Projects project;
    private int id;
    private static int count = 1;

   
    public Trainings() {
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

    public Projects getProject() {
        return project;
    }

    public void setProject(Projects project) {
        this.project = project;
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