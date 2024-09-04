import java.util.Scanner;

public class Main {

    public Movie movies[] = {
            new Movie(1, "The matrix", 1999, 8.7, "action"),
            new Movie(2, "The Dark Knight", 2008, 9, "action"),
            new Movie(3, "Terminator 2: Judgment Day", 1991, 8.6, "action"),

            new Movie(4, "WALL·E", 2008, 8.4, "animation"),
            new Movie(5, "The lion king", 1994, 8.5, "animation"),

            new Movie(6, "Oppenheimer", 2023, 8.3, "drama"),
            new Movie(7, "Taxi Driver", 1976, 8.2, "drama"),

            new Movie(8, "Bad Boys: Ride or Die", 2024, 7.0, "comedy"),
            new Movie(9, "Bad Boys", 1995, 6.8, "comedy"),
            
    };
    
public void searchInArray(String genre, boolean oldMovie){
    for (int x = 0; x < movies.length; x++) {
      if(oldMovie == true){
        if (genre == movies[x].genre) {
            if(movies[x].year < 2000){
                    System.out.println("we recomend the following movie for you \n" + "movie name: " + movies[x].name + "\n" + "Year: "+ movies[x].year + "\n" +"genre: " + movies[x].genre + "\n" + "Rate: " + movies[x].rate );
                    return;
            }

}}else if(oldMovie == false){
    if (genre == movies[x].genre) {
        if(movies[x].year > 2000){
            System.out.println("we recomend the following movie for you \n" + "movie name: " + movies[x].name + "\n" + "Year: "+ movies[x].year + "\n" +"genre: " + movies[x].genre + "\n" + "Rate: " + movies[x].rate );
            return;
        }

}}

else{
    System.out.println("there is no movies in our system based on youre prefrences");
}}}


    public static void main(String[] args) {

          DecisionTree decisionTree = new DecisionTree(new Node("Do you like comedy movies?"));
            decisionTree.addRight("Do you like comedy movies?", "Do you like old movies (before 2000)");

        

        System.out.println("---------------------------------------------");

        Node currentNode = decisionTree.root;
        System.out.println(decisionTree.root.question);
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        while (currentNode.right != null) {
            Main obj = new Main();


            if ("yes".equalsIgnoreCase(userInput)) {

                currentNode = currentNode.right;
                System.out.println(currentNode.question);
                userInput = scanner.nextLine();
                if("yes".equalsIgnoreCase(userInput)){
                    obj.searchInArray("comedy", true);
                }else{
                    obj.searchInArray("comedy", false);
                }


        }else if("no".equalsIgnoreCase(userInput)){
            decisionTree.addLeft("Do you like comedy movies?", "Do you like action movies?");
            
            currentNode = currentNode.left;
            System.out.println(currentNode.question);
            userInput = scanner.nextLine();
            if("yes".equalsIgnoreCase(userInput)){
            decisionTree.addLeft("Do you like action movies?", "Do you like old movies (before 2000)");
            currentNode = currentNode.left;
            System.out.println(currentNode.question);
            userInput = scanner.nextLine();
            if("yes".equalsIgnoreCase(userInput)){
                obj.searchInArray("action", true);
            }else{
                obj.searchInArray("action", false);
            }

        }else{
            decisionTree.addLeft("Do you like action movies?", "Do you like animated movies?");
            
            currentNode = currentNode.left;
            System.out.println(currentNode.question);
            userInput = scanner.nextLine();
            if("yes".equalsIgnoreCase(userInput)){
            decisionTree.addLeft("Do you like animated movies?", "Do you like old movies (before 2000)");
            currentNode = currentNode.left;
            System.out.println(currentNode.question);
            userInput = scanner.nextLine();
            if("yes".equalsIgnoreCase(userInput)){
                obj.searchInArray("animation", true);
            }else{
                obj.searchInArray("animation", false);
            }
        }else{
            decisionTree.addLeft("Do you like animated movies?", "Do you like drama movies?");
            
            currentNode = currentNode.left;
            System.out.println(currentNode.question);
            userInput = scanner.nextLine();
            if("yes".equalsIgnoreCase(userInput)){
            decisionTree.addLeft("Do you like drama movies?", "Do you like old movies (before 2000)");
            currentNode = currentNode.left;
            System.out.println(currentNode.question);
            userInput = scanner.nextLine();
            if("yes".equalsIgnoreCase(userInput)){
                obj.searchInArray("drama", true);
            }else{
                obj.searchInArray("drama", false);
            }       scanner.close();

        }else{
            System.out.println("we have no movies in our system based on youre prefrences");
        }       scanner.close();

        }}
    }
    }}
}