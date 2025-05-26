package service;

import entities.User;
import exception.UserException;

public class LibraryRulesService {

    public void userNameRule(User user) throws UserException{
        if (user.getName().isBlank()){
            throw new UserException("You must insert an user name");
        }
    }

    public void userIdRule(User user) throws UserException{
        if (user.getRegisterNumber() == null){
            throw new UserException("The id cannot be null");
        }
    }
}
