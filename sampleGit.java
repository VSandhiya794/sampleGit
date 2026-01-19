package Main;

import java.util.HashSet;



public class sampleGit {
    public static void main(String[] args) {
        String name = "Sandhiya";
        HashSet<Character> printed = new HashSet<>();

        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            // Only print if this character has not been printed before
            if (!printed.contains(c)) {
                System.out.println("Skip testthe word as repeat");
                System.out.println(" the ground is here");
                System.out.println(c);
                printed.add(c);
            }
        }
    }
}
