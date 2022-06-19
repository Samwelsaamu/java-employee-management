/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.Organization.Organization;
import business.EmployeeManagement;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Saamu
 */
@SuppressWarnings("unchecked")
public abstract class Role {
    
    public enum RoleType{
        ManageAdmin("Manage Admin"),
        AssetManager("Asset Manager"),
        TechSupport("IT Tech Support"),
        Employee("Employee"),
        FinanceManager("Finance Manager"),
        ProjectManager("Project Manager"),
        LearningDevelopmentHR("Learning and Development HR"),
        CompensationBenefitsHR("Compensation and Benefits HR"),
        TalentAcquisitionHR("Talent and Acquisition HR"),
        SystemAdmin("SystemAdmin");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    public RoleType type;
    public abstract JPanel createWorkArea(JPanel userLoginContainer,
            JPanel userContainer, 
            UserAccount account, 
            Organization organization, 
            EmployeeManagement business);

    @Override
    public String toString() {
        return (type != null) ? this.type.getValue() : this.getClass().getName();
    }
    
}