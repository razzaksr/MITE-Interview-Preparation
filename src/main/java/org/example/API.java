package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Exception:
    we can handle

    when incorrect/ mismatch input/ conditions are made by
    user which cause the program to be terminated abnormally/incomplete

Handle:
try{}catch(){handle}finally{}

objective:
    1. let the execution to reach end of the code
    2. another chance

 */

public class API {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ProfileService service=new ProfileService();
        System.out.println("Welcome the user to the ProfileRepo");

        do{
            System.out.println("1. Create new Profile\n2.View all profile\n3. Shortlist by skill\n4. Shortlist by cgpa\n5. Update profile\n6. Exit");
            int desired=scanner.nextInt();
            switch(desired){
                case 1:
                    try{
                        System.out.println("Enter the profile details name, skill, cgpa, department, email, contact and usn");
                        Profile profile=new Profile();
                        String name=scanner.next();// which includes the space
                        profile.setCandidateName(name);
                        profile.setCandidateSkill(scanner.next());
                        profile.setCgpa(scanner.nextDouble());
                        profile.setCandidateDepartment(scanner.next());
                        profile.setEmailAddress(scanner.next());
                        profile.setContactNumber(scanner.nextLong());
                        profile.setUniversitySerialNumber(scanner.nextLong());
                        String response = service.openNewProfile(profile);
                        System.out.println(response);
                    }
                catch(InputMismatchException ins){
                    Scanner newScanner=new Scanner(System.in);
                    System.out.println(ins);
                    System.out.println("Invalid format of data");
                    System.out.println("Enter the profile details name, skill, cgpa, department, email, contact and usn");
                    Profile profile=new Profile();
                    String name=newScanner.nextLine();// which includes the space
                    profile.setCandidateName(name);
                    profile.setCandidateSkill(newScanner.nextLine());
                    profile.setCgpa(newScanner.nextDouble());
                    profile.setCandidateDepartment(newScanner.next());
                    profile.setEmailAddress(newScanner.next());
                    profile.setContactNumber(newScanner.nextLong());
                    profile.setUniversitySerialNumber(newScanner.nextLong());
                    String response = service.openNewProfile(profile);
                    System.out.println(response);
                }break;
                case 2: service.viewProfiles();break;
                case 3:
                    System.out.println("Let us know skill you wanted to filter");
                    service.shortlist(scanner.next());
                    break;
                case 4:
                    try{
                        System.out.println("Enter the CGPA");
                        Double searchCgpa=scanner.nextDouble();
                        service.shortlist(searchCgpa);
                    }
                    catch(InputMismatchException ins){
                        Scanner newScanner=new Scanner(System.in);
                        System.out.println(ins);
                        System.out.println("CGPA should be in numbers");
                        Double searchCgpa=newScanner.nextDouble();
                        service.shortlist(searchCgpa);
                    }
                    break;
                case 5:
                    System.out.println("Enter USN to update");
                    System.out.println(service.updateProfile(scanner.nextLong()));
                    break;
                default:return;
            }
        }while(true);

        //

//        service.viewProfiles();

//        service.shortlist("C++");



    }
}
