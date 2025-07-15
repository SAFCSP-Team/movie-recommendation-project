
public class Main {
    public static void main(String[] args) {
        List<Movie> movieList = Arrays.asList(
            new Movie(1, "The Matrix", 8.7, 1999, "action"),
            new Movie(2, "The Dark Knight", 9.0, 2008, "action"),
            new Movie(3, "Terminator 2: Judgment Day", 8.6, 1991, "action"),
            new Movie(4, "WALL·E", 8.4, 2008, "animation"),
            new Movie(5, "The Lion King", 8.5, 1994, "animation"),
            new Movie(6, "Oppenheimer", 8.3, 2023, "drama"),
            new Movie(7, "Taxi Driver", 8.2, 1976, "drama"),
            new Movie(8, "Bad Boys: Ride or Die", 7.0, 2024, "comedy"),
            new Movie(9, "Bad Boys", 6.8, 1995, "comedy")
        );

        DecisionTree tree = new DecisionTree(movieList);
        tree.start();
    }
}
