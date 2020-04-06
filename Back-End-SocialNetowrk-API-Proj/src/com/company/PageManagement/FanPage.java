package com.company.PageManagement;

import com.company.UserProfile.*;

import java.util.ArrayList;


public class FanPage {
    public String Name;
    public int FansNum;
    public ArrayList<User> Fans;
    public ArrayList<User> Admins;
    public String PageDiscription;

    public void CreatePage(String Name, User Admin) {
    }
    public int GetNumbofFans() {
        return 0;
    }
    public void Invite(User user) {
    }
    public void ManageFanPageReq() {
    }
    public boolean checkUsersValidation(String username){return false;}
    public boolean checkPageNameValidation(String pageName){return false;}
}
