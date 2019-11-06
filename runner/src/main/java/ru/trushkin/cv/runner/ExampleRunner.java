package ru.trushkin.cv.runner;

public interface ExampleRunner<T, P> {

    /**
     * Запуск примера с параметрои и возврат результата
     *
     * @param params входящий параметр
     * @return результат
     */
    T executeExample(P params);
}
