package by.epam.aggregation_composition.t_5;

public class VoucherParameters {
	public enum TourType {
		REST("Джаст чил"), EXCURSION("Большое количество разнообразных экскурсий"), TREATMEN("Санаторий"),
		SHOPPING("Большое количество различных магазинов"), CRUISE("Морской круиз на лайнере");

		private String type;

		TourType(String type) {
			this.type = type;
		}

		public String getType() {
			return this.type;
		}
	}

	enum TransportType {
		PLANE("Самолет"), AUTOBUS("Австобус"), CAR("Машина"), TRAIN("Поезда"), ONFOOT("Ношками"),
		BICYCLE("Навелосипеде"), HOTAIRBALOON("Воздушный шар");

		private String type;

		TransportType(String type) {
			this.type = type;
		}

		public String getType() {
			return this.type;
		}
	}

	enum Season {
		AUTUMN("Осень"), WINTER("Зима"), SPRING("Весна"), SUMMER("Лето");

		private String season;

		Season(String season) {
			this.season = season;
		}

		public String getType() {
			return this.season;
		}
	}

	enum DaysNum {
		TWO("2 дня"), SEVEN("7 дней"), FOURTEEN("14 дней"), TWENTYONE("21 день"), THIRTEE("30 дней");

		private String number;

		DaysNum(String number) {
			this.number = number;
		}

		public String getType() {
			return this.number;
		}
	}

	enum Food {
		NOT_INCLUDED("Питанине не включено"), INCLUDED("Питанине включено"), BREAKFAST_ONLY_INCLUD("Только завтрак");

		private String food;

		Food(String food) {
			this.food = food;
		}

		public String getType() {
			return this.food;
		}
	}

}
