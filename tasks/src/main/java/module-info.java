import ru.trushkin.cv.tasks.FindMissingNumberSortedInArray;
import ru.trushkin.cv.tasks.binarysearch.FindMissingNumberSortedInArrayBinary;

module ru.trushkin.cv.tasks {
    requires ru.trushkin.cv.runner;

    provides ru.trushkin.cv.runner.ExampleRunner
            with ru.trushkin.cv.tasks.FizzBuzz,
                    FindMissingNumberSortedInArray,
                    FindMissingNumberSortedInArrayBinary;
}