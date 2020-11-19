package com.kodilla.stream.forumuser;

import java.util.*;

public final class Forum {
    private final  List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1,"Norbert", 'M',1996,11,30,5));
        userList.add(new ForumUser(2,"Nikola", 'F',1997,8,5,2));
        userList.add(new ForumUser(3,"Kuba", 'M',2000,4,7,1));
        userList.add(new ForumUser(4,"Seba", 'M',1999,1,12,15));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
