/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Teams;

import business.Projects.Projects;
import business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Saamu
 */
@SuppressWarnings("unchecked")
public class TeamsDirectory {
    
    private ArrayList<Teams> teamsList;

    public TeamsDirectory() {
        teamsList = new ArrayList<>();
    }

    public ArrayList<Teams> getTeamsList() {
        return teamsList;
    }
    
    public Teams createTeams(Projects project,UserAccount team,String status){
        Teams teamMember = new Teams();
        teamMember.setTeam(team);
        teamMember.setProject(project);
        teamMember.setStatus(status);
        teamsList.add(teamMember);
        return teamMember;
    }
    
    public boolean checkIfTeamIsUnique(Projects projectname,UserAccount team){
        for (Teams project : teamsList){
            if (project.getProject().equals(projectname) && project.getTeam().equals(team))
                return false;
        }
        return true;
    }
}
