/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Trainees;

import business.UserAccount.UserAccount;
import business.Projects.Projects;
import business.Trainings.Trainings;
import java.util.Date;

/**
 *
 * @author Saamu
 */
@SuppressWarnings("unchecked")
public class Trainees {
    private String status;
    private Projects project;
    private Trainings training;
    private UserAccount trainee;
    private Date assignedOn;
    private int id;
    private static int count = 1;
   
    public Trainees() {
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
    
    public Trainings getTraining() {
        return training;
    }

    public void setTraining(Trainings training) {
        this.training = training;
    }
    

    public UserAccount getTrainee() {
        return trainee;
    }

    public void setTrainee(UserAccount trainee) {
        this.trainee = trainee;
    }

    public Date getAssignedOn() {
        return assignedOn;
    }

    public void setAssignedOn(Date assignedOn) {
        this.assignedOn = assignedOn;
    }

    @Override
    public String toString() {
        return trainee.getUsername();
    }
}