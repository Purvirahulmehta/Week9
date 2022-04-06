package homework9;
/*Write the programme that tell you which line pass through particular stations.
        Just use Zone 1 stations name.*/

import java.util.Scanner;

public class Programme10 {
    public static void main(String[] args) {
        //Single dimension Array to declare the Stations
        String[] station = new String[]{"Algate", "Liverpool Street", "Moorgate", "Barbican", "Borough", "London Bridge", "Moorgate", "Old Street", "Bank", "Waterloo", "Baker Street", "Regents Park", "Oxford Circus", "Picaadilly Circus", "Bank", "Holborn", "St Paul's", "Bond Street", "Edgware Road", "Baker Street", "Farrington", "Barbican", "Paddington", "Bayswater", "Algate East", "Liverpool Street", "Bond Street", "Westminster", "Green Park", "Leicester Square", "Euston", "Green Park", "Edgware Road", "Covent Garden"};
        int length = station.length;//define String Size
        String[][] londonTubes = new String[12][length];

        londonTubes[0][0] = "Metropolitan";
        londonTubes[0][1] = "Aldgate";
        londonTubes[0][2] = "Liverpool Street";
        londonTubes[0][3] = "Moorgate";
        londonTubes[0][4] = "Barbian";

        londonTubes[1][0] = "Northen";
        londonTubes[1][1] = "London Bridge";
        londonTubes[1][2] = "Moorgate";
        londonTubes[1][3] = "Old Street";

        londonTubes[2][0] = "Waterloo & City";
        londonTubes[2][1] = "Bank";
        londonTubes[1][2] = "Waterloo";

        londonTubes[3][0] = "Bakerloo";
        londonTubes[3][1] = "Baker Street";
        londonTubes[3][2] = "Oxford Circus";
        londonTubes[3][3] = "Picaadilly Circus";

        londonTubes[4][0] = "Central";
        londonTubes[4][1] = "Bank";
        londonTubes[4][2] = "St Paul";
        londonTubes[4][3] = "Bond Street";

        londonTubes[5][0] = "Circle";
        londonTubes[5][1] = "Edgware Road";

        londonTubes[6][0] = "DLR";
        londonTubes[6][1] = "Bank";

        londonTubes[7][0] = "District";
        londonTubes[7][1] = "Edgware Road";
        londonTubes[7][2] = "Paddignton";
        londonTubes[7][3] = "Bayswater";

        londonTubes[8][0] = "Hamersmith & City";
        londonTubes[8][1] = "Algate East";
        londonTubes[8][2] = "Liverpool Street";
        londonTubes[8][3] = "Moorgate";
        londonTubes[8][4] = "Barbican";

        londonTubes[9][0] = "Jubliee";
        londonTubes[9][1] = "Baker Street";
        londonTubes[9][2] = "Bond Street";
        londonTubes[9][3] = "Westminster";
        londonTubes[9][4] = "Waterloo";

        londonTubes[10][0] = "Picadily";
        londonTubes[10][1] = "Green Park";
        londonTubes[10][2] = "Picaadily Circus";
        londonTubes[10][3] = "Leister Square";
        londonTubes[10][4] = "Covent Garden";

        londonTubes[11][0] = "Victoria";
        londonTubes[11][1] = "Euston";
        londonTubes[11][2] = "Warren Street";
        londonTubes[11][3] = "Oxford Circus";
        londonTubes[11][4] = "Grren Park";
        //Declare the Scanner to take users input
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the Tube Station name of Zone 1:");
        String userInPut = scan.nextLine();
        String catchStationName = " ";

        //Checking, if user input is present in the list of Zone 1 stations
        for (int i = 0; i < station.length; i++) {
            if (userInPut.equalsIgnoreCase(station[i])) {
                catchStationName = station[i];
                //System.out.println(catchStationName); //for debug purpose
            }
        }
        // Logic to find the Line names from the given input from the user
        if (userInPut.equalsIgnoreCase(catchStationName)) {
            System.out.println(userInPut + " Station is in the Zone 1.");
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("Following Line(s) passing through the Given Tube Station : " + userInPut);
            System.out.println("--------------------------------------------------------------------------");


                    for (int x = 0; x < londonTubes.length; x++) {
                        for (int y = 1; y < londonTubes.length; y++) {
                            String match = londonTubes[x][y];

                            if (userInPut.equalsIgnoreCase(match)) {
                                System.out.println(londonTubes[x][0]);
                            }
                        }
                    }
                } else {
                    System.out.println("Station is not in Zone 1.");
                }
            }
        }










