package by.epam.aggregation_composition.t_3;

// Создать объект класса Государство, используя классы Область, Район, Город. 
// Методы: вывести на консоль столицу, количество областей, площадь, областные центры.

public class Task_3 {
	public static void main(String[] args) {
		City minsk = new City("Минск");
		City brest = new City("Брест");
		City gomel = new City("Гомель");
		City vitebsk = new City("Витебск");
		City mogilev = new City("Могилев");
		City grodno = new City("Гродно");

		District dzerzhinskDistrict = new District("Джержинский район", 67300, 1190);
		District berezinoDistrict = new District("Березинский район", 22760, 1940);

		District baranovichiDistrict = new District("Брановичский район", 67300, 1190);
		District drogichinDistrict = new District("Дрогичинский район", 30700, 2168);

		District dobrushDistrict = new District("Добрушский район", 38800, 1453);
		District rechicaDistrict = new District("Речицкий район", 97900, 2700);

		District gorodokDistrict = new District("Городокский район", 34000, 1500);
		District bogushDistrict = new District("Богушевский район", 50000, 1800);

		District bihovichikDistrict = new District("Быховичский район", 30000, 1200);
		District kirovkDistrict = new District("Кировский район", 25000, 1350);

		District volkovisskDistrict = new District("Воковысский район", 34800, 1120);
		District zelvenDistrict = new District("Зелвенский район", 41300, 1348);

		Region minskRegion = new Region("Минская область", minsk);
		minskRegion.addDistrict(dzerzhinskDistrict);
		minskRegion.addDistrict(berezinoDistrict);

		Region brestRegion = new Region("Брестская область", brest);
		brestRegion.addDistrict(baranovichiDistrict);
		brestRegion.addDistrict(drogichinDistrict);

		Region gomelRegion = new Region("Гомельская область", gomel);
		gomelRegion.addDistrict(dobrushDistrict);
		gomelRegion.addDistrict(rechicaDistrict);

		Region vitebskRegion = new Region("Витебская область", vitebsk);
		vitebskRegion.addDistrict(gorodokDistrict);
		vitebskRegion.addDistrict(bogushDistrict);

		Region mogilevRegion = new Region("Могилевская область", mogilev);
		mogilevRegion.addDistrict(bihovichikDistrict);
		mogilevRegion.addDistrict(kirovkDistrict);

		Region grodnoRegion = new Region("Гродненская область", grodno);
		grodnoRegion.addDistrict(volkovisskDistrict);
		grodnoRegion.addDistrict(zelvenDistrict);

		State belarus = new State("Беларусь", minsk);

		belarus.addRegion(minskRegion);
		belarus.addRegion(brestRegion);
		belarus.addRegion(gomelRegion);
		belarus.addRegion(vitebskRegion);
		belarus.addRegion(mogilevRegion);
		belarus.addRegion(grodnoRegion);

		belarus.printCapital();
		belarus.printRegionsNum();
		belarus.printRegionalCenters();
		belarus.printStateArea();
		belarus.printPopulation();
	}
}
