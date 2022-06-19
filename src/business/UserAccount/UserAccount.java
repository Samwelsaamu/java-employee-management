/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.UserAccount;

import business.Employee.Employee;
import business.Role.Role;
import business.WorkQueue.WorkQueue;

/**
 *
 * @author Saamu
 */

@SuppressWarnings("unchecked")
public class UserAccount {
    private String firstname,lastname,sex,emailId,address,city,state,dob;
    private String employeeid,status;
    private Employee employee;
    private Role role;
    
    private WorkQueue workQueue;

    public UserAccount() {
        workQueue = new WorkQueue();
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    private int zipcode;
    private Long phone,ssnno;
    
    private String username;
    private String password;

    public String getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid;
    }

    
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEMailId() {
        return emailId;
    }

    public void setEMailId(String emailId) {
        this.emailId = emailId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public Long getSsnno() {
        return ssnno;
    }
    
    public void setSsnno(Long ssnno) {
        this.ssnno = ssnno;
    }
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }
    
    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public String toFullname() {
        return firstname+" "+lastname;
    }
    
    @Override
    public String toString() {
        return username;
    }
    
}