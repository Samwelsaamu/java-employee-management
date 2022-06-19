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
import ui.AssetManager.AssetManagerWorkerPanel;

/**
 *
 * @author Saamu
 */
@SuppressWarnings("unchecked")
public class AssetManagerLogin extends Role{
//Authorizes the System and adds enterprises, admins and networks and organizations and Projects
    public AssetManagerLogin(){
        this.type = RoleType.AssetManager;
    }
    @Override
    public JPanel createWorkArea(JPanel userLoginContainer,JPanel container, UserAccount account, Organization organization, EmployeeManagement system) {
        return new AssetManagerWorkerPanel(userLoginContainer,container,organization,account, system);
    }
}