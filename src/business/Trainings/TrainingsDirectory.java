/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Trainings;

import business.Projects.Projects;
import business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Saamu
 */
@SuppressWarnings("unchecked")
public class TrainingsDirectory {
    
    private ArrayList<Trainings> trainingsList;

    public TrainingsDirectory() {
        trainingsList = new ArrayList<>();
    }

    public ArrayList<Trainings> getTrainingsList() {
        return trainingsList;
    }
    
    public Trainings createTraining(String name,String Description,UserAccount projectManager,Projects project, String status){
        Trainings training = new Trainings();
        training.setName(name);
        training.setDescription(Description);
        training.setProject(project);
        training.setProjectManager(projectManager);
        training.setStatus(status);
        trainingsList.add(training);
        return training;
    }
    
    public boolean checkIfTrainingIsUnique(String name){
        for (Trainings training : trainingsList){
            if (training.getName().equals(name))
                return false;
        }
        return true;
    }
}
