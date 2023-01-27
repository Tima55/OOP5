package com.example.playground.personal.model;

import java.util.List;

public interface FileOperation {
    List<String> readAllLines();

    void saveAllLines(List<String> lines);
}