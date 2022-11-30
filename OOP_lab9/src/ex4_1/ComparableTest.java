package ex4_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {
	public static void main(String[] args) {
		List<Movie> list = new ArrayList<>();
		list.add(new Movie("Iron man", 7.2, 2009));
		list.add(new Movie("Captain America", 6.9, 2012));
		list.add(new Movie("WandaVision", 7.5, 2020));
		Collections.sort(list);
		System.out.println("Movie after sorting: ");
		for (Movie movie : list) {
			System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getYear());
		}
	}
}
