package by.itstep.javatraining.revision.task;

/*	Task 02. The Treasure Seekers and gold coins (2) [искатели сокровищ и золотые монеты]
 *
 *	N искателей сокровищ нашли K золотых монет и решили разделить их поровну, а тем монеты, которые останутся,
 *	решили отдать на благотворительность. Определите, сколько золотых монет останется на благие цели?
 *
 *	Формат входных данных [input]
 *	На вход даётся два целых положительных числа N и K.
 *
 *	Формат выходных данных [output]
 *	Возвратите одно целое число - ответ на задачу.
 *
 *	[sample method  input 1] (пример передаваемых в метод параметров): 5 27
 *	[sample method output 1] (пример возвращаемого методом результата): 2
 *
 *	[ input 2]: 2 30
 *	[output 2]: 0
 *
 *	[ input 3]: 3 1
 *	[output 3]: 1
 */

public class Task02 {
    public static int task02(int seeker, int coin) {
        return coin % seeker;
    }
}
