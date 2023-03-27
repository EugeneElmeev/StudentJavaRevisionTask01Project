package by.itstep.javatraining.revision.test;

import by.itstep.javatraining.revision.task.*;

public class TaskTester {

    public static String RIGHT = "completed successfully. WELL DONE!!!";
    public static String WRONG = "was not running successfully. Something was WRONG!";

    public static String testingTask01() {

        boolean result = Task01.task01(3, 14) == 4
                && Task01.task01(4, 24) == 6
                && Task01.task01(3, 20) == 6
                && Task01.task01(10, 20) == 2
                && Task01.task01(16, 1) == 0
                && Task01.task01(3, 3) == 1
                && Task01.task01(6, 20) == 3
                && Task01.task01(7, 20) == 2
                && Task01.task01(1, 20) == 20;

        return String.format("Task 01 %s", result ? RIGHT : WRONG);
    }

    public static String testingTask02() {

        boolean result = Task02.task02(5, 27) == 2
                && Task02.task02(2, 30) == 0
                && Task02.task02(3, 1) == 1
                && Task02.task02(10, 20) == 0
                && Task02.task02(3, 20) == 2
                && Task02.task02(3, 3) == 0
                && Task02.task02(6, 20) == 2
                && Task02.task02(7, 20) == 6
                && Task02.task02(1, 20) == 0;

        return String.format("Task 02 %s", result ? RIGHT : WRONG);
    }

    public static String testingTask03() {

        boolean result = Task03.task03(456) == 5
                && Task03.task03(1234567) == 6
                && Task03.task03(-1234567) == 6
                && Task03.task03(3) == 0
                && Task03.task03(-3) == 0
                && Task03.task03(1000) == 0
                && Task03.task03(-1000) == 0
                && Task03.task03(111111) == 1
                && Task03.task03(-111111) == 1
                && Task03.task03(999999) == 9
                && Task03.task03(-999999) == 9
                && Task03.task03(90) == 9
                && Task03.task03(-90) == 9
                && Task03.task03(0) == 0;

        return String.format("Task 03 %s", result ? RIGHT : WRONG);
    }

    public static String testingTask04() {

        boolean result = Task04.task04(456) == 4
                && Task04.task04(1234567) == 5
                && Task04.task04(-1234567) == 5
                && Task04.task04(3) == 0
                && Task04.task04(-3) == 0
                && Task04.task04(10) == 0
                && Task04.task04(-10) == 0
                && Task04.task04(100) == 1
                && Task04.task04(-100) == 1
                && Task04.task04(1000) == 0
                && Task04.task04(-1000) == 0
                && Task04.task04(111111) == 1
                && Task04.task04(-111111) == 1
                && Task04.task04(999999) == 9
                && Task04.task04(-999999) == 9
                && Task04.task04(0) == 0;

        return String.format("Task 04 %s", result ? RIGHT : WRONG);
    }

    public static String testingTask05() {

        boolean result = Task05.task05(1) == 2
                && Task05.task05(2) == 4
                && Task05.task05(3) == 4
                && Task05.task05(5) == 6
                && Task05.task05(18) == 20
                && Task05.task05(1111) == 1112
                && Task05.task05(9000) == 9002
                && Task05.task05(9999) == 10000;

        return String.format("Task X  %s", result ? RIGHT : WRONG);
    }
}
