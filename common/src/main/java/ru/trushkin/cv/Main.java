package ru.trushkin.cv;

import ru.trushkin.cv.runner.ExampleRunner;

import java.util.ServiceLoader;

public class Main {

    public static void main(String[] args) {
        ServiceLoader<ExampleRunner> examples = ServiceLoader.load(ExampleRunner.class);
    }
}
