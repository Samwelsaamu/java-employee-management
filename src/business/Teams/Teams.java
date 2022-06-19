/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Teams;

import business.UserAccount.UserAccount;
import business.Projects.Projects;
import java.util.Date;

/**
 *
 * @author Saamu
 */
@SuppressWarnings("unchecked")
public class Teams {
    private String status;
    private Projects project;
    private UserAccount team;
    private Date assignedOn;
    private int id;
    private static int count = 1;
   
    public Teams() {
        id = count;
        count++;
        assignedOn=new Date();
    }

    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public Projects getProject() {
        return project;
    }

    public void setProject(Projects project) {
        this.project = project;
    }

    public UserAccount getTeam() {
        return team;
    }

    public void setTeam(UserAccount team) {
        this.team = team;
    }

    public Date getAssignedOn() {
        return assignedOn;
    }

    public void setAssignedOn(Date assignedOn) {
        this.assignedOn = assignedOn;
    }

    @Override
    public String toString() {
        return team.getUsername();
    }
}