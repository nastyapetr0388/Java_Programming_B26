package day15_switch_statements;

import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {

        String browser = "Safari";
        String url = "www.google.com";

        switch(browser){
            case"Chrome":
                System.out.println("Opening " + url + " in the Chrome browser");
                System.out.println("Loading...");
                break;
            case "Safari":
                System.out.println("Opening " + url + " in the sSafari browser");
                break;
            case "Firefox":
                System.out.println("Opening " + url + " in the firefox browser");
                break;
            default:
                System.out.println(browser + " is not a valid browser");
        }
    }
}
