/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.WorkQueue;

/**
 *
 * @author Saamu
 */

@SuppressWarnings("unchecked")
public class BudgetWorkRequest extends WorkRequest{
    
    private String requesteResult,budgetfor;
    private double budget;

    public String getRequesteResult() {
        return requesteResult;
    }

    public void setRequesteResult(String requesteResult) {
        this.requesteResult = requesteResult;
    }

    public double getBudget() {
        return budget;
    }

    //Asset Budget or Bonus And Events Budget
    public void setBudget(double budget) {
        this.budget = budget;
    }
    
    public String getBudgetfor() {
        return budgetfor;
    }

    public void setBudgetfor(String budgetfor) {
        this.budgetfor = budgetfor;
    }
    
}