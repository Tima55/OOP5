package com.example.playground.personal.di;

import com.example.playground.personal.controllers.UserController;
import com.example.playground.personal.model.FileOperation;
import com.example.playground.personal.model.Repository;
import com.example.playground.personal.views.ViewUser;

public class Component {

    public FileOperation fileOperation;
    public Repository repository;
    public UserController userController;
    public ViewUser viewUser;

    public Component() {

        fileOperation = Module.provideFileOPeration();
        repository = Module.provideRepository(fileOperation, Module.provideMapper());
        userController = Module.provideUserController(repository);
        viewUser = Module.provideViewUser(userController);
    }
}
