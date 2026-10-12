package com.mini.linkedinUserProfile;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        String fullName = "Milan Subedi";
        String headline = "Java Developer | Spring Boot | APIs";
        String location = "Bengaluru, India";
        String industry = "Information Technology";
        int connections = 500;
        boolean isPremium = true;

        System.out.println("Name: "+fullName);
        System.out.println("Headline: "+headline);
        System.out.println("Location: "+location);
        System.out.println("Industry: "+industry);

        if(connections>=500){
            System.out.println("Connections: 500+");
        }
        if(isPremium){
            System.out.println("Account Type: Premium Member Badge Activated");
        }
        else{
            System.out.println("Standard Memeber");
        }


    }
}
