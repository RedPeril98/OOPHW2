import AllAvengers.*;

import java.util.ArrayList;
import java.util.Random;

/*
Добавить файл с описанием интерфейса. В котором описать два метода, void step(); и String getInfo();
Реализовать интерфейс в абстрактном классе и в наследниках так, чтобы getInfo возвращал тип персонажа.
Создать два списка в классе main. В каждый из списков добавить по десять случайных экземнляров
наследников BaseHero. Удалить ненужные методы из абстрактного класса, если такие есть.
В main пройти по спискам и вызвать у всех персонажей getInfo.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Avengers> list = new ArrayList<>();
        list.add(new AntMan(Names.AntMan.getName(), 0, 1));
        list.add(new BlackWidow(Names.BlackWidow.getName(),0, 2));
        list.add(new CaptainAmerica(Names.CaptainAmerica.getName(), 0, 3));
        list.add(new Hulk(Names.Hulk.getName(), 0, 4));
        list.add(new IronMan(Names.IronMan.getName(), 0, 5));
        list.add(new SpiderMan(Names.SpiderMan.getName(), 0, 6));
        list.add(new Thor(Names.Thor.getName(), 0, 7));
        list.add(new Wasp(Names.Wasp.getName(), 0, 8));
        // list.forEach(n-> System.out.println(n.getInfo()));

        System.out.println("Your Team1:");
        int teamCount = 4;
        Random rand = new Random();
        ArrayList<Avengers> team1 = new ArrayList<>();
        for (int i = 0; i < teamCount; i++) {
            int val = rand.nextInt(4);
            switch (val) {
                case 0: team1.add(new AntMan(Names.AntMan.getName(), 0, val+1)); break;
                case 1: team1.add(new BlackWidow(Names.BlackWidow.getName(),0, val+1)); break;
                case 2: team1.add(new CaptainAmerica(Names.CaptainAmerica.getName(), 0, val+1)); break;
                case 3: team1.add(new Hulk(Names.Hulk.getName(), 0, val+1));
            }
            System.out.println(team1.get(i).getInfo());
        }
        System.out.println("Your Team2:");
        ArrayList<Avengers> team2 = new ArrayList<>();
        for (int i = 0; i < teamCount; i++) {
            int val = rand.nextInt(4);
            switch (val) {
                case 0:
                    team2.add(new IronMan(Names.IronMan.getName(), 5, val+1));
                    break;
                case 1:
                    team2.add(new SpiderMan(Names.SpiderMan.getName(), 5, val+1));
                    break;
                case 2:
                    team2.add(new Thor(Names.Thor.getName(), 5, val+1));
                    break;
                case 3:
                    team2.add(new Wasp(Names.Wasp.getName(), 5, val+1));
            }
            System.out.println(team2.get(i).getInfo());
        }
        System.out.println("The nearest: ");
        team1.forEach(n -> n.step(team2));

    }
}