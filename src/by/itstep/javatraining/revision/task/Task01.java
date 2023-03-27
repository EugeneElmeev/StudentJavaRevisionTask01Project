package by.itstep.javatraining.revision.task;

/*	Task 01. The Treasure Seekers and gold coins (1) [искатели сокровищ и золотые монеты]
 *
 *	N искателей сокровищ нашли K золотых монет и решили разделить их поровну.
 *	Определите, сколько золотых монет достанется каждому искателю.
 *
 *	Формат входных данных [input]
 *	На вход даётся два целых положительных числа N и K.
 *
 *	Формат выходных данных [output]
 *	Возвратите одно целое число - ответ на задачу.
 *
 *	[sample method  input 1] (пример передаваемых в метод параметров): 3 14
 *	[sample method output 1] (пример возвращаемого методом результата): 4
 *
 *	[ input 2]: 4 24
 *	[output 2]: 6
 *
 *	[ input 3]: 16 1
 *	[output 3]: 0
 */

public class Task01 {
    public static int task01(int seeker, int coin) {
        return coin / seeker;
    }
}
