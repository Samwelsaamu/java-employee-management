/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Role.CompensationBenefitsHRLogin;
import business.Role.TalentAcquisitionHRLogin;
import business.Role.LearningDevelopmentHRLogin;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author 
 */

@SuppressWarnings("unchecked")
public class HROrganization extends Organization{

    public HROrganization() {
        super(Organization.Type.HR.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CompensationBenefitsHRLogin());
        roles.add(new LearningDevelopmentHRLogin());
        roles.add(new TalentAcquisitionHRLogin());
        return roles;
    } 
}