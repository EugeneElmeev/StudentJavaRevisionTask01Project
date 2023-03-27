package by.itstep.javatraining.revision.controller;

import by.itstep.javatraining.revision.task.Task01;
import by.itstep.javatraining.revision.test.TaskTester;

public class Main {
    public static void main(String[] args) {
        String result = TaskTester.testingTask01();
        result += "\n" + TaskTester.testingTask02();
        result += "\n" + TaskTester.testingTask03();
        result += "\n" + TaskTester.testingTask04();
        result += "\n" + TaskTester.testingTask05();
        System.out.println(result);
    }
}
