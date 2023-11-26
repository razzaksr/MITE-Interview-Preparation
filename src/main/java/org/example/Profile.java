package org.example;

/*

architecture:
    model/ business/ entity >> class >> data and function >> encapsulated
 */

/*
Constructor:
    initialize the data members
    execution priority: we can set any specific task to be performed
                        before any other task executed / called by user
 */


// container with data, functions
public class Profile {
    // variables creation: datatype identifier=value;
    // wrapper class objects: Wrapper identifier=value;
    // camelNotation
    // data members

    public String toString(){
        return "Candidate Information "+candidateName+" department "+candidateDepartment+" with CGPA "+cgpa+" skill of "+candidateSkill+" contact details "+contactNumber+" email "+emailAddress+" belong to the USN "+universitySerialNumber ;
    }

    // default cons
    public Profile(){
        System.out.println("Welcome candidate for profile creation");
    }
    // parameterized/ overloading/ polymorphsim
    public Profile(String candidateName,String candidateDepartment, String candidateSkill,Long universitySerialNumber,Long contactNumber, String emailAddress, Double cgpa){
        this.candidateName=candidateName;
        this.cgpa=cgpa;
        this.candidateSkill=candidateSkill;
        this.contactNumber=contactNumber;
        this.candidateDepartment=candidateDepartment;
        this.emailAddress=emailAddress;
        this.universitySerialNumber=universitySerialNumber;
    }

    private String candidateName;
    // camelNotation
    // setter
    public void setCandidateName(String candidateName){
        this.candidateName=candidateName;
    }

    public String getCandidateName(){
        return candidateName;
    }

    private String candidateDepartment;
    private String emailAddress;
    private Long contactNumber;
    private Long universitySerialNumber;
    private String candidateSkill;
    private Double cgpa;

    public String getCandidateDepartment() {
        return candidateDepartment;
    }

    public void setCandidateDepartment(String candidateDepartment) {
        this.candidateDepartment = candidateDepartment;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(Long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Long getUniversitySerialNumber() {
        return universitySerialNumber;
    }

    public void setUniversitySerialNumber(Long universitySerialNumber) {
        this.universitySerialNumber = universitySerialNumber;
    }

    public String getCandidateSkill() {
        return candidateSkill;
    }

    public void setCandidateSkill(String candidateSkill) {
        this.candidateSkill = candidateSkill;
    }

    public Double getCgpa() {
        return cgpa;
    }

    public void setCgpa(Double cgpa) {
        this.cgpa = cgpa;
    }
}
