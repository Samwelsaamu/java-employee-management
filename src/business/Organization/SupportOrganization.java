/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Role.AssetManagerLogin;
import business.Role.TechSupportLogin;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author 
 */

@SuppressWarnings("unchecked")
public class SupportOrganization extends Organization{

    public SupportOrganization() {
        super(Organization.Type.Support.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AssetManagerLogin());
        roles.add(new TechSupportLogin());
        return roles;
    } 
}