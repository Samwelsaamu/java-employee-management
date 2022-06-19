/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Projects;

import business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Saamu
 */
@SuppressWarnings("unchecked")
public class ProjectsDirectory {
    
    private ArrayList<Projects> projectsList;

    public ProjectsDirectory() {
        projectsList = new ArrayList<>();
    }

    public ArrayList<Projects> getProjectsList() {
        return projectsList;
    }
    
    public Projects createProject(String name,String Description,UserAccount projectManager,double budget,String skills, String startdate,String enddate,String status){
        Projects project = new Projects();
        project.setName(name);
        project.setDescription(Description);
        project.setBudget(budget);
        project.setProjectManager(projectManager);
        project.setSkills(skills);
        project.setStartDate(startdate);
        project.setEndDate(enddate);
        project.setStatus(status);
        projectsList.add(project);
        return project;
    }
    
    public boolean checkIfProjectIsUnique(String name){
        for (Projects project : projectsList){
            if (project.getName().equals(name))
                return false;
        }
        return true;
    }
}
