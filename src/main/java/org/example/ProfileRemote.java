package org.example;

public interface ProfileRemote {
    String openNewProfile(Profile profile);
    void viewProfiles();
    // polymorphism: method overloading(parameters type, order, count)
    void shortlist(String skill);
    void shortlist(Double cgpa);
    void shortlist(String department, Double cgpa);
    void shortlist(Long usn);

    String updateProfile(Long usn);
    String deleteProfile(Long usn);
}
