package com.company.GroupManagement;

import com.company.UserProfile.*;

import java.util.ArrayList;


public class Group {

    public String Name;
    public ArrayList<User> Members;
    public ArrayList<User> Admins;
    public enum GroupType{Public,Private};

    public Group CreateGroup(String Name, String GroupType, User Admin) {
        return null;
    }
    public int GetMembersNumber() {
        return 0;
    }
    public int GetAdminsNumber() {
        return 0;
    }
    public ArrayList<User> GetAdmins() {
        return null;
    }
    public void ManageGroupReq() {
    }
    public boolean checkUsersValidation(String username){return false;}

}
