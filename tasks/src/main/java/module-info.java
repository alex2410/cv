module ru.trushkin.cv.tasks {
    requires ru.trushkin.cv.runner;

    provides ru.trushkin.cv.runner.ExampleRunner
            with ru.trushkin.cv.tasks.FizzBuzz,
                    ru.trushkin.cv.tasks.FindMissingNumberInArray;
}