package baitap4;

import java.util.ArrayList;
import java.util.List;

public class Sorting {

    public static void selectionSort(List<FootballTeam> teams) {
        int n = teams.size();
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (teams.get(j).getScore() > teams.get(maxIndex).getScore()) {
                    maxIndex = j;
                }
            }
            FootballTeam temp = teams.get(maxIndex);
            teams.set(maxIndex, teams.get(i));
            teams.set(i, temp);
        }
    }

    public static void insertionSort(List<FootballTeam> teams) {
        int n = teams.size();
        for (int i = 1; i < n; i++) {
            FootballTeam key = teams.get(i);
            int j = i - 1;
            while (j >= 0 && teams.get(j).getScore() < key.getScore()) {
                teams.set(j + 1, teams.get(j));
                j = j - 1;
            }
            teams.set(j + 1, key);
        }
    }

    public static void bubbleSort(List<FootballTeam> teams) {
        int n = teams.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (teams.get(j).getScore() < teams.get(j + 1).getScore()) {
                    FootballTeam temp = teams.get(j);
                    teams.set(j, teams.get(j + 1));
                    teams.set(j + 1, temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        List<FootballTeam> teams = new ArrayList<>();
        teams.add(new FootballTeam(1, "Team A", 11, 30));
        teams.add(new FootballTeam(2, "Team B", 12, 25));
        teams.add(new FootballTeam(3, "Team C", 10, 35));
        teams.add(new FootballTeam(4, "Team D", 9, 20));

            System.out.println("Danh sách đội bóng trước khi sắp xếp:");
        for (FootballTeam team : teams) {
            System.out.println(team);
        }

        selectionSort(teams);
        System.out.println("\nDanh sách đội bóng sau khi sắp xếp bằng Selection Sort:");
        for (FootballTeam team : teams) {
            System.out.println(team);
        }

        insertionSort(teams);
        System.out.println("\nDanh sách đội bóng sau khi sắp xếp bằng Insertion Sort:");
        for (FootballTeam team : teams) {
            System.out.println(team);
        }

        bubbleSort(teams);
        System.out.println("\nDanh sách đội bóng sau khi sắp xếp bằng Bubble Sort:");
        for (FootballTeam team : teams) {
            System.out.println(team);
        }
    }
}





