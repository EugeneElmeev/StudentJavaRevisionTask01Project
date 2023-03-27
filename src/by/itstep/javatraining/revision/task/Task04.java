package by.itstep.javatraining.revision.task;

/*	Task 04. The Number of hundreds [число сотен]
 *
 *	Дано целое число N, определите число сотен в нём (третью цифру с конца).
 *	Если такой цифры нет, то можно считать, что число сотен равно нулю.
 *
 *	Формат входных данных [input]
 *	На вход дается любое целое число N в диапазоне типа int.
 *
 *	Формат выходных данных [output]
 *	Возвратите одно целое число - ответ на задачу.
 *
 *	[sample method input 1]: 456
 *	[sample method output 1]: 4
 *
 *	[ input 2]: -1234567
 *	[output 2]: 5
 *
 *	[ input 3]: 1000
 *	[output 3]: 0
 *
 *	[ input 4]: -12
 *	[output 4]: 0
 */

public class Task04 {
    public static int task04(int number) {
        number = number < 0 ? -number : number;
        return number / 100 % 10;
    }
}
