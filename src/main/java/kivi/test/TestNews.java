package kivi.test;

import kivi.model.News;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestNews {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<News> newsList = new ArrayList<News>();
        newsList.add(new News(8765432, "Greg Piterson","blablabla"));
        newsList.add(new News(654321,"Jef Besos", "blablabla"));
        newsList.add(new News(432167564,"Mark Weber", "blablabla"));

        System.out.println("Enter Id: ");
        scanner.nextLine();
        for (News news : newsList) {
            if (news.getNewsEditor().equalsIgnoreCase("Greg Piterson")) {
                System.out.println(news);
            }
        }

        System.out.println("Enter Id to remove: ");
        int idRemove = Integer.parseInt(scanner.nextLine());
        newsList.removeIf(news -> news.getNewsId() == idRemove);
        System.out.println("News removed: " + newsList);


        System.out.println("Enter Id to check: ");
        int idCheck = Integer.parseInt(scanner.nextLine());
        boolean exists = false;
        for (News news : newsList) {
            if (news.getNewsId() == idCheck) {
                exists = true;
                break;
            }
        }
        System.out.println("News ID " + idCheck + (exists ? " exists." : " does not exist."));

        scanner.close();



    }
}
