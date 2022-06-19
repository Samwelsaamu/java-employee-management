/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Role.ProjectManagerLogin;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author 
 */

@SuppressWarnings("unchecked")
public class ProjectOrganization extends Organization{

    public ProjectOrganization() {
        super(Organization.Type.Project.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ProjectManagerLogin());
        return roles;
    } 
}