package com.example.playground.personal.di;

import com.example.playground.personal.controllers.UserController;
import com.example.playground.personal.model.FileOperation;
import com.example.playground.personal.model.FileOperationImpl;
import com.example.playground.personal.model.Mapper;
import com.example.playground.personal.model.Repository;
import com.example.playground.personal.model.RepositoryAlternativeFile;
import com.example.playground.personal.model.UserMapperAlternative;
import com.example.playground.personal.views.ViewUser;

public class Module {

    public static FileOperation provideFileOPeration() {
        return new FileOperationImpl("users.txt");
    }

    public static Mapper provideMapper() {
        return new UserMapperAlternative();
    }

    public static Repository provideRepository(
            FileOperation fileOperation,
            Mapper mapper
    ) {
        return new RepositoryAlternativeFile(mapper ,fileOperation);
    }

    public static UserController provideUserController(
            Repository repository
    ) {
        return new UserController(repository);
    }

    public static ViewUser provideViewUser(
            UserController controller
    ) {
        return new ViewUser(controller);
    }
}
