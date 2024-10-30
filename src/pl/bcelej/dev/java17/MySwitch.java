package pl.bcelej.dev.java17;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class MySwitch {

	public static void main(String[] args) {
		DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
		boolean freeDay = switch (dayOfWeek) {
			case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> false;
			case SATURDAY, SUNDAY -> true;
		};
		System.out.println(freeDay);

		// Even more can be achieved with the new "yield" keyword that allows returning a value from inside a code block.
		// It’s virtually a return that works from inside a case block and sets that value as a result of its switch.
		DayOfWeek dayOfWeekWithYield = LocalDate.now().getDayOfWeek();
		boolean freeDayResult = switch (dayOfWeekWithYield) {
			case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> {
				System.out.println("Work work work");
				yield false;
			}
			case SATURDAY, SUNDAY -> {
				System.out.println("Yey, a free day!");
				yield true;
			}
		};
		System.out.println(freeDayResult);
	}

}
