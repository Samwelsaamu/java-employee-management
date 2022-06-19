/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author Saamu
 */

@SuppressWarnings("unchecked")
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<Organization>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.HR.getValue())){
            organization = new HROrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Support.getValue())){
            organization = new SupportOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Finance.getValue())){
            organization = new FinanceOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Project.getValue())){
            organization = new ProjectOrganization();
            organizationList.add(organization);
        }
       
        return organization;
    }
    
    public boolean checkIfOrganizationIsUnique(String username){
        for (Organization organization : organizationList){
            if (organization.getName().equals(username))
                return false;
        }
        return true;
    }
}