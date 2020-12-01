package aqa4;

import java.util.ArrayList;

public class team {
    ArrayList<String> members;
    String name;

    team(){
        System.out.println("Инициализация команды");
    }

    team(String name){
        this.name = name;
    }

    team(String name, String member){
        this.name = name;
        members = new ArrayList<>();
        members.add(member);
    }

    void displayInfo(){
        System.out.println("Имя команды: "+name);
        System.out.println("Состав команды: "+members);
    }
}
