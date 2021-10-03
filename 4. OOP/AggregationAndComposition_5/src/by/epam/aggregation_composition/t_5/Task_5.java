package by.epam.aggregation_composition.t_5;

import java.util.Scanner;

// Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
// различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. 
// Учитывать возможность выбора транспорта, питания и числа дней. 
// Реализовать выбор и сортировку путевок.

public class Task_5 {
	public static void main(String[] args) {
		TravelVoucher voucher = new TravelVoucher(2, 4, 2, 1, 2, "21/08/2021");
		TravelVoucher voucher1 = new TravelVoucher(2, 4, 2, 1, 2, "1/04/2021");
		TravelVoucher voucher2 = new TravelVoucher(0, 0, 0, 0, 0, "16/01/2021");
		TravelVoucher voucher3 = new TravelVoucher(0, 0, 0, 0, 0, "12/08/2050");
		TravelVoucher voucher4 = new TravelVoucher(0, 0, 0, 1, 0, "3/06/2021");
		TravelVoucher voucher5 = new TravelVoucher(0, 0, 0, 0, 0, "8/01/2021");
		TravelVoucher voucher6 = new TravelVoucher(1, 3, 1, 1, 1, "27/04/2050");
		TravelVoucher voucher7 = new TravelVoucher(0, 0, 0, 0, 0, "29/04/2021");
		TravelVoucher voucher8 = new TravelVoucher(0, 0, 0, 0, 0, "9/06/2021");
		TravelVoucher voucher9 = new TravelVoucher(0, 0, 0, 0, 0, "2/08/2021");

		VouchersList list = new VouchersList();

		list.addVoucher(voucher);
		list.addVoucher(voucher1);
		list.addVoucher(voucher2);
		list.addVoucher(voucher3);
		list.addVoucher(voucher4);
		list.addVoucher(voucher5);
		list.addVoucher(voucher6);
		list.addVoucher(voucher7);
		list.addVoucher(voucher8);
		list.addVoucher(voucher9);

		list.sortDate();
		list.printList();

		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		Scanner sc4 = new Scanner(System.in);

		System.out.print("\n1.Отдых\n2.Экскурсии\n3.Санаторий\n4.Шоппинг\n5.Морской круиз\nВыберите тип отдыха: ");
		int rest = sc.nextInt();

		System.out.print("\n1.Самолет\n2.Автобус\n3.Машина\n4.Поезд\nВыберите тип транспорта: ");
		int transport = sc1.nextInt();

		System.out.print("\n1.Осень\n2.Зима\n3.Весна\n4.Лето\nВыберите сезон: ");
		int season = sc2.nextInt();

		System.out.print("\n1.2 дня\n2.7 дней\n3.14 дней\n4.21 день\n5.30 дней\nВыберите количество дней: ");
		int days = sc3.nextInt();

		System.out.print("\n1.Питание включено\n2.Питание не включено\n3.Только завтрак\nВыберите тип питания: ");
		int food = sc4.nextInt();

		int[] parameters = new int[] { rest - 1, transport - 1, season - 1, days - 1, food - 1 };

		VoucherSearch findVoucher = new VoucherSearch(list, parameters);
	}
}
