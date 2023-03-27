package by.itstep.javatraining.revision.task;

/*	Task X. The Next Even Number [следующее чётное число]
 *
 *	На вход дается натуральное число N. Вычислите следующее за ним четное число.
 *
 *	Формат входных данных [input]
 *	На вход дается целое положительное число N.
 *
 *	Формат выходных данных [output]
 *	Выведите одно целое число - ответ на задачу.
 *
 *	[Sample method input 1]: 1
 *	[Sample method output 1]: 2
 *
 *	[ input 2]: 2
 *	[output 2]: 4
 *
 *	[ input 3]: 3
 *	[output 3]: 4
 */

public class Task05 {
    public static int task05(int number) {
        return number - number % 2 + 2;
    }
}
