package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ProfileService implements ProfileRemote{

    ArrayList<Profile> mite=new ArrayList<Profile>();// data source

    public ProfileService(){
        mite.add(new Profile("Razak Mohamed S","CSE","Java FSD",76543456L,987656787L,"razak@gmail.com",8.1));
        mite.add(new Profile("Arun Rajpurohit","ECE","Python",1234323244L,9876787878L,"arun@gmail.com",8.7));
        mite.add(new Profile("Sridhar M","ISE","Agile",888488434L,87678767764L,"sridhar@gmail.com",9.1));
        mite.add(new Profile("Sabarinathan S","EEE","C",23432323L,7343434444L,"sabariragu@gmail.com",6.2));
        mite.add(new Profile("Shahul Hameed a","CSE","Python",9999191991L,8237744884L,"shahul@gmail.com",9.1));
    }

    public String openNewProfile(Profile profile) {
        mite.add(profile);
        return profile.getCandidateName()+" has created new profile";
    }

    public void viewProfiles() {
        mite.forEach(current->System.out.println(current));
    }

    public void shortlist(String skill) {
        List<Profile> shortlisted = mite.stream().filter(current->current.getCandidateSkill().contains(skill)).collect(Collectors.toList());
        if(shortlisted.size()>0){
            shortlisted.forEach(current-> System.out.println(current));
        }
        else{
            System.out.println("No profiles are matched the skill set "+skill);
        }
    }

    public void shortlist(Double cgpa) {
        List<Profile> found = mite.stream().filter(current->current.getCgpa()>=cgpa).collect(Collectors.toList());
        if(found.size()>0){
            found.forEach(current-> System.out.println(current));
        }
        else{
            System.out.println("No Profile are found for the cgpa "+cgpa);
        }
    }

    public void shortlist(String department, Double cgpa) {

    }

    public void shortlist(Long usn) {

    }

    public String updateProfile(Long usn) {
        Scanner scanner=new Scanner(System.in);
        Profile found=null;int index=0;
        for(index=0;index<mite.size();index++){
            if(mite.get(index).getUniversitySerialNumber().equals(usn)){
                System.out.println(mite.get(index)+" now available");
                found=mite.get(index);
                break;
            }
        }
        if(found!=null){
            Profile replaceable = new Profile();
            System.out.println("Update details such as name, department, cgpa, skill, email, contact");

            replaceable.setUniversitySerialNumber(found.getUniversitySerialNumber());
            replaceable.setCandidateName(scanner.next());
            replaceable.setCandidateDepartment(scanner.next());
            replaceable.setCgpa(scanner.nextDouble());
            replaceable.setCandidateSkill(scanner.next());
            replaceable.setEmailAddress(scanner.next());
            replaceable.setContactNumber(scanner.nextLong());

            mite.set(index,replaceable);

            return replaceable.getUniversitySerialNumber()+" details are updated";

        }
        return usn+" not found anywhere";
    }

    public String deleteProfile(Long usn) {
        return null;
    }
}
