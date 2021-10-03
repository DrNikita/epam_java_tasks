package by.epam.classes_objects.t_4;

// Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. 
// Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива 
// по номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем. 
// Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами 
// назначения должны быть упорядочены по времени отправления.

import java.util.Arrays;
import java.util.Scanner;

public class Task_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Train train1 = new Train("Minsk", 404, "12:10");
		Train train2 = new Train("Brest", 13, "9:00");
		Train train3 = new Train("Gomel", 106, "11:40");
		Train train4 = new Train("Mogilev", 9, "13:00");
		Train train5 = new Train("Brest", 111, "8:30");

		Train[] list = new Train[] { train1, train2, train3, train4, train5 };

		Arrays.sort(list, new Train.TrainNumberSort());

		for (int i = 0; i < list.length; i++) {
			list[i].printList();
		}
		
		System.out.println();

		Arrays.sort(list, new Train.DesignationSort());

		for (int i = 0; i < list.length; i++) {
			list[i].printList();
		}

		System.out.print("Enter train number: ");
		int trainNum = sc.nextInt();

		printTrain(list, trainNum);
	}

	public static void printTrain(Train[] list, int trainNum) {

		boolean flag = true;

		for (int i = 0; i < list.length; i++) {
			if (list[i].getTrainNumber() == trainNum) {
				list[i].printList();
				flag = false;
			}
		}
		if (flag) {
			System.out.print("Incorrect number");
		}
	}
}
