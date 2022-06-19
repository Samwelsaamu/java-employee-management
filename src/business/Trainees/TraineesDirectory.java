/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Trainees;

import business.Projects.Projects;
import business.Trainings.Trainings;
import business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Saamu
 */
@SuppressWarnings("unchecked")
public class TraineesDirectory {
    
    private ArrayList<Trainees> traineesList;

    public TraineesDirectory() {
        traineesList = new ArrayList<>();
    }

    public ArrayList<Trainees> getTraineesList() {
        return traineesList;
    }
    
    public Trainees createTrainees(Projects project,Trainings training,UserAccount trainee,String status){
        Trainees trainingMember = new Trainees();
        trainingMember.setTrainee(trainee);
        trainingMember.setTraining(training);
        trainingMember.setProject(project);
        trainingMember.setStatus(status);
        traineesList.add(trainingMember);
        return trainingMember;
    }
    
    public boolean checkIfTraineeIsUnique(Trainings trainingsname,UserAccount traineename){
        for (Trainees trainee : traineesList){
            if (trainee.getTraining().equals(trainingsname) && trainee.getTrainee().equals(traineename))
                return false;
        }
        return true;
    }
}
