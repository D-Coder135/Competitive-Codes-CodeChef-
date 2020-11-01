/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (D-Coder135)
 *  Date: 01-11-2020
 *  Time: 11:11 AM
 */


/*
PROBLEM STATEMENT -->
Alice is new in town. This town has a strange arrangements and traffic rule under which if you choose a direction of
travel then, you have to move 1 mile in the direction and then, choose another and so until you reach your destination.
Most of the destinations are found at the corners.

Alice has her office and house at such corners. She has to reach her office from her apartment. She asks a stranger for
directions, but the route they gave her is not optimal. These directions will get her from her apartment to her office,
but they also require a considerable amount of extra travel.

After reaching her office, Alice works for minimizing the directions of the journey(i.e. travel from her apartment to
her office) even if it mean violating 1 mile traffic rule. Then, she, alphabetically, sorts the same set of directions
so obtained. It's still her first day in the office so she is quite busy and hence she gives this task to you.

Input:
    * String S( 1 <= |S| <= 10^5 ) representing the set of directions given by the strangers.
    N means North
    W means West
    E means East
    S means South

Output:
    * Print the alphabetically sorted string of minimal directions. Is she reaches her initial position again i.e. her
    office is in the same building as her apartment, then, print "Sad Alice".

Sample Input -->                                        Sample Output -->

        NNEWS                                                     N

        NEWSNWESNWSNEWSNWESNWS                                    WW

        NWSSEWSNWSSNNEEWS                                         SSW

 */


public class Direction {
    public void getMinimalDirection(String S) {
        int lengthOfInputtedDirection = S.length();
        int counterForEastDirection = 0;
        int counterForWestDirection = 0;
        int counterForNorthDirection = 0;
        int counterForSouthDirection = 0;
        String minimalDirection = "";
        for (int indexOfEachCharacter = 0; indexOfEachCharacter < lengthOfInputtedDirection; indexOfEachCharacter++) {
            char eachCharacter = S.charAt(indexOfEachCharacter);
        }
    }
}
