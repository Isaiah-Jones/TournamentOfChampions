/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tournamentofchampions;

/**
 *CSC 255
 * Mr. Osborne
 * @author Isaiah Jones
 * 10-8-2017
 */
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Vector;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TournamentOfChampions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            String compName = InetAddress.getLocalHost().getHostName();

            //Create variables and reference variables
            int reply;
            int rando = (int) Math.random();
            
            String categ [] = new String[8];
            long champTime[][] = new long[8][3];
            StopWatch timer = new StopWatch();
            ArrayList myArray = new ArrayList();
            Vector myVectList = new Vector();
            LinkedList myLink = new LinkedList();
            
            categ[0] = "Seq Add";
            categ[1] = "Front Add";
            categ[2] = "Rear Add";
            categ[3] = "Random Add";
            categ[4] = "Random Get";
            categ[5] = "Rear Del";
            categ[6] = "Front Del";
            categ[7] = "Random Del";

            Scanner input = new Scanner(System.in);

            //Prompt user for the number of inserts
            System.out.println("Enter a number to begin test for System: " + compName);

            reply = input.nextInt();
            int randot = (int) (Math.random() * reply);

            //Input and Track performances
            arrayTrial(myArray, champTime, reply, rando, randot);

            vectorTrial(myVectList, champTime, reply, rando, randot);

            linkTrial(myLink, champTime, reply, rando, randot);

            //Print Results
            rezultz(champTime, compName, reply, categ);

        } catch (UnknownHostException ex) {
            Logger.getLogger(TournamentOfChampions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void arrayTrial(ArrayList myArray, long[][] champTime, int reply, int rando, int randot) {
        //Ensure user's number is positive
        if (reply > 0) {

            StopWatch timer = new StopWatch();

            // ADD
            timer.start();
            for (int i = 0; i < reply; i++) {
                myArray.add(rando);
            }
            timer.stop();
            champTime[0][0] = timer.getElapsedTime();

            //FRONT ADD
            timer.start();
            for (int i = 0; i <= (reply / 2); i++) {
                myArray.add(0, rando);
                /*myVectList.add(0,rando);
                    myLink.add(0,rando);*/
            }
            timer.stop();
            champTime[1][0] = timer.getElapsedTime();

            //TAIL ADD
            timer.start();
            for (int i = 0; i <= (reply / 2); i++) {
                myArray.add(rando);
            }
            timer.stop();
            champTime[2][0] = timer.getElapsedTime();

            //RANDOM ADD
            timer.start();
            for (int i = 0; i <= (reply / 2); i++) {
                myArray.add(randot, rando);
            }
            timer.stop();
            champTime[3][0] = timer.getElapsedTime();

            //RANDOM GET
            timer.start();
            for (int i = 0; i < reply; i++) {
                myArray.get(randot);
            }
            timer.stop();
            champTime[4][0] = timer.getElapsedTime();

            //TAIL REMOVE
            timer.start();
            for (int i = 0; i <= (reply / 4); i++) {
                myArray.remove(reply - (i + 1));
            }
            timer.stop();
            champTime[5][0] = timer.getElapsedTime();

            //FRONT REMOVE
            timer.start();
            for (int i = 0; i <= (reply / 4); i++) {
                myArray.remove(0);
            }
            timer.stop();
            champTime[6][0] = timer.getElapsedTime();

            //RANDOM REMOVE
            timer.start();
            for (int i = 0; i <= (reply / 4); i++) {
                myArray.remove(randot);
            }
            timer.stop();
            champTime[7][0] = timer.getElapsedTime();

        }
    }

    private static void vectorTrial(Vector myVectList, long[][] champTime, int reply, int rando, int randot) {
        //Ensure user's number is positive
        if (reply > 0) {

            StopWatch timer = new StopWatch();

            // ADD
            timer.start();
            for (int i = 0; i < reply; i++) {
                myVectList.add(rando);
            }
            timer.stop();
            champTime[0][1] = timer.getElapsedTime();

            //FRONT ADD
            timer.start();
            for (int i = 0; i <= (reply / 2); i++) {
                myVectList.add(0, rando);
                /*myVectList.add(0,rando);
                    myLink.add(0,rando);*/
            }
            timer.stop();
            champTime[1][1] = timer.getElapsedTime();

            //TAIL ADD
            timer.start();
            for (int i = 0; i <= (reply / 2); i++) {
                myVectList.add(rando);
            }
            timer.stop();
            champTime[2][1] = timer.getElapsedTime();

            //RANDOM ADD
            timer.start();
            for (int i = 0; i <= (reply / 2); i++) {
                myVectList.add(randot, rando);
            }
            timer.stop();
            champTime[3][1] = timer.getElapsedTime();

            //RANDOM GET
            timer.start();
            for (int i = 0; i < reply; i++) {
                myVectList.get(randot);
            }
            timer.stop();
            champTime[4][1] = timer.getElapsedTime();

            //TAIL REMOVE
            timer.start();
            for (int i = 0; i <= (reply / 4); i++) {
                myVectList.remove(reply - (i + 1));
            }
            timer.stop();
            champTime[5][1] = timer.getElapsedTime();

            //FRONT REMOVE
            timer.start();
            for (int i = 0; i <= (reply / 4); i++) {
                myVectList.remove(0);
            }
            timer.stop();
            champTime[6][1] = timer.getElapsedTime();

            //RANDOM REMOVE
            timer.start();
            for (int i = 0; i <= (reply / 4); i++) {
                myVectList.remove(randot);
            }
            timer.stop();
            champTime[7][1] = timer.getElapsedTime();

        }
    }

    private static void linkTrial(LinkedList myLink, long[][] champTime, int reply, int rando, int randot) {
        //Ensure user's number is positive
        if (reply > 0) {

            StopWatch timer = new StopWatch();

            // ADD
            timer.start();
            for (int i = 0; i < reply; i++) {
                myLink.add(rando);
            }
            timer.stop();
            champTime[0][2] = timer.getElapsedTime();

            //FRONT ADD
            timer.start();
            for (int i = 0; i <= (reply / 2); i++) {
                myLink.add(0, rando);
                /*myVectList.add(0,rando);
                    myLink.add(0,rando);*/
            }
            timer.stop();
            champTime[1][2] = timer.getElapsedTime();

            //TAIL ADD
            timer.start();
            for (int i = 0; i <= (reply / 2); i++) {
                myLink.add(rando);
            }
            timer.stop();
            champTime[2][2] = timer.getElapsedTime();

            //RANDOM ADD
            timer.start();
            for (int i = 0; i <= (reply / 2); i++) {
                myLink.add(randot, rando);
            }
            timer.stop();
            champTime[3][2] = timer.getElapsedTime();

            //RANDOM GET
            timer.start();
            for (int i = 0; i < reply; i++) {
                myLink.get(randot);
            }
            timer.stop();
            champTime[4][2] = timer.getElapsedTime();

            //TAIL REMOVE
            timer.start();
            for (int i = 0; i <= (reply / 4); i++) {
                myLink.remove(reply - (i + 1));
            }
            timer.stop();
            champTime[5][2] = timer.getElapsedTime();

            //FRONT REMOVE
            timer.start();
            for (int i = 0; i <= (reply / 4); i++) {
                myLink.remove(0);
            }
            timer.stop();
            champTime[5][2] = timer.getElapsedTime();

            //RANDOM REMOVE
            timer.start();
            for (int i = 0; i <= (reply / 4); i++) {
                myLink.remove(randot);
            }
            timer.stop();
            champTime[6][2] = timer.getElapsedTime();

        }
    }

    private static void rezultz(long[][] champTime, String compName, int reply,String [] categ) {
        //Ensure user's number is positive
        if (reply > 0) {
            System.out.println();
            System.out.println("Results from " + compName + " using " + reply + " inserts:");
            System.out.println();

            System.out.println("ArrayList VectorList LinkedList");

            //Print out an orderly performance table
            for (int x = 0; x < 8; x++) {
                for (int y = 0; y < 3; y++) {
                    if (y == 2) {
                        //System.out.print("Seq Add");
                        System.out.print("      " + champTime[x][y]);
                        System.out.println("     -" +categ[x]);

                    } else {
                        System.out.print("     " + champTime[x][y] + "    ");
                    }
                }
            }
        }

    }

}
