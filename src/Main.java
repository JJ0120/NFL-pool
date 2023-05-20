import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        Teams teams = new Teams();
        teams.initializeMap();
        teams.importTeams("team-txt-files/Test.txt");

        teams.test();
    }
}
