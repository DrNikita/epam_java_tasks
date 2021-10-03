package by.epam.decomposition.t_4;

// На плоскости заданы своими координатами n точек. Написать метод(методы),
// определяющие, между какими из пар точек самое большое расстояние. 
// Указание. Координаты точек занести в массив.

import java.util.Arrays;

public class Task_4 {

	public static void main(String[] args) {

		int[][] point = new int[][] { { 0, 0 }, { 4, 2 }, { -1, 8 }, { 3, 2 }, { 6, 3 } };
		
		double firSec;
		double secThird;
		double thirdFor;
		double forFif;
		
		firSec = distance(point[0], point[1]);
		secThird = distance(point[1], point[2]);
		thirdFor = distance(point[2], point[3]);
		forFif = distance(point[3], point[4]);

		double[] dis = new double[] { firSec, secThird, thirdFor, forFif };
		
		int pointPair = biggestDistance(dis);
		
		String[] pointDistance = new String[] { "Между 1-й и 2-й точками.", "Между 2-й и 3-й точками.",
				"Между 3-й и 4-й точками.", "Между 4-й и 5-й точками." };

		System.out.print(pointDistance[pointPair]);
	}

	public static double distance(int[] point1, int[] point2) {    // расстояние между точками

		int x;
		int y;
		double distance;

		if (point1[0] > point2[0]) {

			x = point1[0] - point2[0];

		} else {

			x = point2[0] - point1[0];
		}

		if (point1[1] > point2[1]) {

			y = point1[1] - point2[1];

		} else {

			y = point2[1] - point1[1];
		}

		distance = Math.sqrt(x * x + y * y);

		return distance;
	}

	public static int biggestDistance(double[] mas) {            // наибольшее расстояние 

		double max = mas[0];
		int index = 0;

		for (int i = 1; i < mas.length; i++) {

			if (max < mas[i]) {

				max = mas[i];
				index = i;
			}
		}
		return index;
	}
}
