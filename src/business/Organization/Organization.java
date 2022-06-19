/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Employee.EmployeeDirectory;
import business.Role.Role;
import business.UserAccount.UserAccountDirectory;
import business.Projects.ProjectsDirectory;
import business.Teams.TeamsDirectory;
import business.Trainings.TrainingsDirectory;
import business.Trainees.TraineesDirectory;
import business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author Saamu
 */

@SuppressWarnings("unchecked")
public abstract class Organization {

    private String name;

    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private ProjectsDirectory projectsDirectory;
    private TeamsDirectory TeamsDirectory;
    private TrainingsDirectory TrainingsDirectory;
    private TraineesDirectory TraineesDirectory;
    
    public enum Type{
        ManageAdmin("Manage Admin"),
        HR("HR Organization"),
        Support("Support Organization"),
        Project("Project Organization"),
        Finance("Finance Organization");
        private String value;
        private Type(String value) {
            
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        projectsDirectory=new ProjectsDirectory();
        TeamsDirectory=new TeamsDirectory();
        TrainingsDirectory=new TrainingsDirectory();
        TraineesDirectory=new TraineesDirectory();
    }
    
    public Organization() {
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        projectsDirectory=new ProjectsDirectory();
        TeamsDirectory=new TeamsDirectory();
        TrainingsDirectory=new TrainingsDirectory();
        TraineesDirectory=new TraineesDirectory();
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public ProjectsDirectory getProjectsDirectory(){
        return projectsDirectory;
    }
    
    public TeamsDirectory getTeamsDirectory(){
        return TeamsDirectory;
    }
    
    public TrainingsDirectory getTrainingsDirectory(){
        return TrainingsDirectory;
    }
    
    public TraineesDirectory getTraineesDirectory(){
        return TraineesDirectory;
    }
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
   
    public WorkQueue getWorkQueue() {
        return workQueue;
    }
    
    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}