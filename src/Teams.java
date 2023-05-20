import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Teams {

    Map<String, Integer> teamsMap = new HashMap<String, Integer>();

    //Read the teams from the txt file and record their frequency
    public void importTeams(String txtFilePath) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(txtFilePath));
        String currentLine;
        while ((currentLine = br.readLine()) != null) {
            int teamValue = teamsMap.get(currentLine);
            teamValue = teamValue + 1;
            teamsMap.replace(currentLine, teamsMap.get(currentLine), teamValue);
        }
    }

        public void test(){

            System.out.print(teamsMap);
        }



    //Creates a lookup table for a football team (key) and the number of times in the file (value)
    public void initializeMap(){
        teamsMap.put("Arizona Cardinals", 0);
        teamsMap.put("Atlanta Falcons", 0);
        teamsMap.put("Baltimore Ravens", 0);
        teamsMap.put("Buffalo Bills", 0);
        teamsMap.put("Carolina Panthers", 0);
        teamsMap.put("Chicago Bears", 0);
        teamsMap.put("Cincinnati Bengals", 0);
        teamsMap.put("Cleveland Browns", 0);
        teamsMap.put("Dallas Cowboys", 0);
        teamsMap.put("Denver Broncos", 0);
        teamsMap.put("Detroit Lions", 0);
        teamsMap.put("Greenbay Packers", 0);
        teamsMap.put("Houston Texans", 0);
        teamsMap.put("Indianapolis Colts", 0);
        teamsMap.put("Jacksonville Jaguars", 0);
        teamsMap.put("Kansas City Chiefs", 0);
        teamsMap.put("Las Vegas Raiders", 0);
        teamsMap.put("Los Angeles Chargers", 0);
        teamsMap.put("Los Angeles Rams", 0);
        teamsMap.put("Miami Dolphins", 0);
        teamsMap.put("Minnesota Vikings", 0);
        teamsMap.put("New England Patriots", 0);
        teamsMap.put("New Orleans Saints", 0);
        teamsMap.put("New York Giants", 0);
        teamsMap.put("New York Jets", 0);
        teamsMap.put("Philadelphia Eagles", 0);
        teamsMap.put("Pittsburgh Steelers", 0);
        teamsMap.put("San Francisco 49ers", 0);
        teamsMap.put("Seattle Seahawks", 0);
        teamsMap.put("Tampa Bay Buccaneers", 0);
        teamsMap.put("Tennessee Titans", 0);
        teamsMap.put("Washington Commanders", 0);
    }
}
