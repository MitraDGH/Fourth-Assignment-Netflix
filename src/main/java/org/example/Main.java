package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //****************** TEST ************************
        ArrayList<String> show = new ArrayList<String>();
        User user1 = new User("Mitra","1234",null,null);
        User user2 = new User("Sara","abcd",null,null);

        TVShow show1 = new TVShow("Arrow","SciFi",2012,2,null);
        TVShow show2 = new TVShow("Office","Sitcom",2005,6,null);
        TVShow testGenre = new TVShow("Test","Sitcom",2018,6,null);
        TVShow testName = new TVShow("Arrow","Comedy",2005,6,null);

        NetflixService.addTVShow(show1);
        NetflixService.addTVShow(show2);
        NetflixService.addTVShow(testGenre);
        NetflixService.addTVShow(testName);

        NetflixService.addUser(user1);
        NetflixService.addUser(user2);
        //****************** TEST ************************

        Scanner input = new Scanner(System.in);
        System.out.println("W E L C O M E\n\nTo continue your journey you need to login\n\n[If you don't have an account you need to sign up.]");
        System.out.println("Press 0 to login\tPress 1 to creat a new account");
        int identifier = input.nextInt();
        if (identifier==0 ||identifier==1){
            System.out.println("Username: ");
            String username = input.next();
            System.out.println("Password: ");
            String password = input.next();

            if(identifier==0) {
                NetflixService.login(username,password);
                runMenu();
            } else {
                NetflixService.createAccount(username,password);
                runMenu();
            }

        }
        else System.err.println("INVALID INPUT");
    }

    public static void runMenu(){
        System.out.println("What can i do for you?\nChoose from the menu below and enter the number:");

        System.out.println("1:Search for a movie.");
        System.out.println("2:Add a movie to your list.");
        System.out.println("3:Shows the list of your favorite movies.");
        System.out.println("4:Shows the list of recommended movies for you.");

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        switch (number){
            case 1:System.out.println("*** Search Category ***");
                   System.out.println("If you want to search among all the movies here press 0" +"\n"+
                           "And if you want to search among the movies on your favorite list press 1 to continue");

                   int menu = input.nextInt();
                   System.out.println("**Choose one of them and enter its number**");
                   System.out.println("1:SearchByTitle\n2:SearchByGenre\n3:SearchByReleaseYear");
                   int temp = input.nextInt();
                   if(menu==0){
                       switch (temp){
                           case 1: System.out.print("Movie title: ");
                               NetflixService.searchByTitle(input.next());
                               break;
                           case 2: System.out.print("Movie genre: ");
                               NetflixService.searchByGenre(input.next());
                               break;
                           case 3: System.out.print("Movie release year: ");
                               NetflixService.searchByReleaseYear(input.nextInt());
                               break;
                           default:  System.err.println("INVALID INPUT");
                       }
                   }
                   if(menu==1) {
                       switch (temp) {
                           case 1:
                               System.out.print("Movie title: ");
                               String movieName = input.next();
                               User.searchByTitle(movieName);
                               break;
                           case 2:
                               System.out.print("Movie genre: ");
                               User.searchByGenre(input.next());
                               break;
                           case 3:
                               System.out.print("Movie release year: ");
                               User.searchByReleaseYear(input.nextInt());
                               break;
                           default:
                               System.err.println("INVALID INPUT");
                       }
                   }
                   break;

            case 2:System.out.println("Enter the movie's name that you want to add");
            String movieName = input.next();
            User.addToFavorites(NetflixService.searchByTitle(movieName));
            break;

            case 3:System.out.println("Here is your favorite movies list:");
                User.viewFavorites();
                break;

            case 4:System.out.println("There is no recommendation for you :)))");
            break;

            default:System.err.println("INVALID INPUT");

        }
    }
}
