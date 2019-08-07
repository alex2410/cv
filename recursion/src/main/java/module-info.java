module ru.trushkin.cv.recursion {
    requires ru.trushkin.cv.runner;

    provides ru.trushkin.cv.runner.ExampleRunner
            with ru.trushkin.cv.recursion.CountSum,
                    ru.trushkin.cv.recursion.Factorial;
}