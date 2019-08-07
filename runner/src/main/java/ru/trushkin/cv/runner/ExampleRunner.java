package ru.trushkin.cv.runner;

public interface ExampleRunner<T,P> {

    T executeExample(P params);
}
