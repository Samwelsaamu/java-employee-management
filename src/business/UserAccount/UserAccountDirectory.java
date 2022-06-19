/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.UserAccount;

import business.Employee.Employee;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Saamu
 */

@SuppressWarnings("unchecked")
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUser(String username, String password, Employee employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public UserAccount createUserAccount(String username, String password, Employee employee, Role role, String firstname,String lastname,String dob,
            String sex,String address,String city,String state,int zipcode,Long phone,
            String emailId,Long ssn,String employeeid){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccount.setFirstname(firstname);
        userAccount.setLastname(lastname);
        userAccount.setDob(dob);
        userAccount.setSex(sex);
        userAccount.setAddress(address);
        userAccount.setCity(city);
        userAccount.setState(state);
        userAccount.setZipcode(zipcode);
        userAccount.setPhone(phone);
        userAccount.setEMailId(emailId);
        userAccount.setSsnno(ssn);
        userAccount.setEmployeeid(employeeid);
        userAccount.setStatus("Available");
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfEmployeeIdsIsUnique(String Employeeid){
        for (UserAccount ua : userAccountList){
            if (ua.getEmployeeid()!=null && ua.getEmployeeid().equalsIgnoreCase(Employeeid))
                return false;
        }
        return true;
    }
    
    public boolean checkIfEmailIDIsUnique(String email){
        for (UserAccount ua : userAccountList){
            if (ua.getEMailId()!=null && ua.getEMailId().equalsIgnoreCase(email))
                return false;
        }
        return true;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        return userAccountList.stream().noneMatch((ua) -> (ua.getUsername().equals(username)));
    }
    
    public boolean checkIfPhonenoIsUnique(Long phone){
        return userAccountList.stream().noneMatch((ua) -> (String.valueOf(ua.getPhone()).equals(String.valueOf(phone))));
    }
    
    public boolean checkIfSSnoIsUnique(Long ssno){
        return userAccountList.stream().noneMatch((ua) -> (String.valueOf(ua.getSsnno()).equals(String.valueOf(ssno))));
    }
    
    public boolean IsSystemAdmin(String userrole){
        return userrole.equals("SystemAdmin");
    }
    
    public boolean IsTalentAndAcquistionHR(String userrole){
        return userrole.equals("Talent and Acquisition HR");
    }
    
    public boolean IsCompensationAndBenefitsHR(String userrole){
        return userrole.equals("Compensation and Benefits HR");
    }
    
    public boolean IsLearningAndDevelopmentHR(String userrole){
        return userrole.equals("Learning and Development HR");
    }
    
    public boolean IsProjectManager(String userrole){
        return userrole.equals("Project Manager");
    }
    
    public boolean IsFinanceManager(String userrole){
        return userrole.equals("Finance Manager");
    }
    
    public boolean IsEmployee(String userrole){
        return userrole.equals("Employee");
    }
    
    public boolean IsTechSupport(String userrole){
        return userrole.equals("IT Tech Support");
    }
    
    public boolean IsAssetManager(String userrole){
        return userrole.equals("Asset Manager");
    }
   
    
}