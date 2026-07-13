package d_Strings.Easy;
import java.util.Scanner;

//  Problem: Unstop - CHESSBOARD - 1/100
//  This could be imagined as a 2D cartesian plane, with the x axis being represented by the alphabets and y axis by the numbers.
//  Given coordinates in the form of string, print if that cell is white or black.

//  TC: O(1) | SC: O(1)

public class ChessBoard{
    public static String determineColor(String s) {

        char c1 = s.charAt(0);
        int n1 = c1 - 'a'+ 1;
        int n2 = s.charAt(1) -'0';
        int n3 = n1+n2;
        if(n3%2==0) return "Black";
        else return "White";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Cell value:");
        String s = scanner.nextLine().trim();
        String result = determineColor(s);
        System.out.println(result);
    }
}