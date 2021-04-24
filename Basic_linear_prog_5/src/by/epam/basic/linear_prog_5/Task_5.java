package by.epam.basic.linear_prog_5;

//Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
//данное значение длительности в часах, минутах и секундах в следующей форме:
//ННч ММмин SSc.

public class Task_5 {
	
    public static void main(String[] args) {
    	
        int a = 3600;
        
        System.out.print(a + "sec ");
        System.out.print(a / 60 + "min ");
        System.out.print(a / 3600 + "h ");
    }

}
