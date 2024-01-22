package StringPrograms;

import java.util.Scanner;

public class Simply {
    public static void main(String[] args) {

        // Input: "In the box"
        Scanner scanner = new Scanner(System.in);

//        // Print the first character of each word in a sentence
//        String s = scanner.nextLine();
//        String w = "";
//        s += " ";
//
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (c != ' ') {
//                w += c;
//            } else {
//                System.out.print(w.charAt(0));
//                w = "";
//            }
//        }
//------------------------------------------------------------------------
//        // Print the first 2 characters of each word in a sentence
//        String s = scanner.nextLine();
//        String w = "";
//        s += " ";
//
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (c != ' ') {
//                w += c;
//            } else {
//                System.out.print(w.substring(0,2));
//                w = "";
//            }
//        }
//------------------------------------------------------------------------
//        // Print only the words starting with R in a sentence
//        // Input: "A RED SEED"
//        String s = scanner.nextLine();
//        String w = "";
//        s += " ";
//
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (c != ' ') {
//                w += c;
//            } else {
//                if (w.startsWith("R")) {
//                    System.out.println(w);
//                }
//                w = "";
//            }
//        }
//        // Print only the words ending with ED in a sentence
//        // Input: "A RED SEED"
//        String s = scanner.nextLine();
//        String w = "";
//        s += " ";
//
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (c != ' ') {
//                w += c;
//            } else {
//                if (w.endsWith("ED")) {
//                    System.out.println(w);
//                }
//                w = "";
//            }
//        }
//        // Print only the words containing E in a sentence
//        // Input: "A RED SEED"
//        String s = scanner.nextLine();
//        String w = "";
//        s += " ";
//
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (c != ' ') {
//                w += c;
//            } else {
//                if (w.contains("E")) {
//                    System.out.println(w);
//                }
//                w = "";
//            }
//        }
        // Print only words having 3 characters in a sentence
        // Input: "A RED SEED"
        String s = scanner.nextLine();
        String w = "";
        s += " ";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ') {
                w += c;
            } else {
                if (w.length() == 3) {
                    System.out.println(w);
                }
                w = "";
            }
        }
    }
}
