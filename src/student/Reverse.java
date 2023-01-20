
package student;

import java.util.Scanner;
public class Reverse {
        public static void main(String[] args){
           Scanner sc = new Scanner(System.in);
            String word = sc.nextLine();
            int length = word.length();


            char[] myLetters = new char[length];
            for( int i = 0; i < length; i++){
                myLetters[i] = word.charAt(i);
                System.out.println(myLetters[i]);
            }
            for(int i = length-1; i>=0; i--){
                System.out.println(myLetters[i]);
            }

        }
}

