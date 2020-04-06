package com.company.Search;

import com.company.UserProfile.*;
import com.company.GroupManagement.*;
import com.company.PageManagement.*;
import com.company.Post.*;

import java.util.ArrayList;


public class Search {

    public Search(String search) {
        
    }

    public Search() {
    }

    public ArrayList<Post> SearchPost(String post) {
        return null;
    }

    public boolean isHashtag(String hashtag) {
        return false;
    }

    public ArrayList<User> FindUser(String name) {

        ArrayList<User> foundUsers = new ArrayList<>();
        String[] accName = name.split(" ");
        for (User user : UserDB.SystemUsers) {
            if(user.UserName.equals(name)){
                foundUsers.clear();
                foundUsers.add(user);
                break;
            }
            if (user.FirstName.equalsIgnoreCase(accName[0]) && user.LastName.equalsIgnoreCase(accName[1])) {
                foundUsers.add(user);
            }
        }
        if(!foundUsers.isEmpty())
            return foundUsers;

        return null;
    }

    public ArrayList<Group> FindGroup(String name) {
        return null;
    }

    public ArrayList<FanPage> FindFanPage(String name) {
        return null;
    }

}
