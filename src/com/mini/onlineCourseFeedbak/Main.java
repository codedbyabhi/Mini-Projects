package com.mini.onlineCourseFeedbak;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String courseName = sc.nextLine();
        float rating = sc.nextFloat();
        sc.nextLine();
        String feedback = sc.nextLine();

        Design d = new Design(name,courseName,rating,feedback);
        d.displayFeedback();


    }
}
