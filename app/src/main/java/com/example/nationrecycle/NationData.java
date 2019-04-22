package com.example.nationrecycle;

import java.util.ArrayList;

public class NationData {
    public static String[][] data = new String[][]{
            {"Indonesia", "Bhineka Tunggal Ika", "https://www.countries-ofthe-world.com/flags-normal/flag-of-Indonesia.png"},
            {"Japan", "Kaikoku Shinsu", "https://www.countries-ofthe-world.com/flags-normal/flag-of-Japan.png"},
            {"Germany", "Einigkeit und Recht und Freiheit", "https://www.countries-ofthe-world.com/flags-normal/flag-of-Germany.png"},
            {"South Korea", " Hongik Ingan", "https://www.countries-ofthe-world.com/flags-normal/flag-of-Korea-South.png"},
            {"United States", "In God We Trust", "https://www.countries-ofthe-world.com/flags-normal/flag-of-United-States-of-America.png"},
            {"United Kingdom", "Dieu et mon droit", "https://www.countries-ofthe-world.com/flags-normal/flag-of-United-Kingdom.png"},
            {"France", "Liberté, Egalité, Fraternité", "https://www.countries-ofthe-world.com/flags-normal/flag-of-France.png"},
            {"China", "Wèi rénmín fúwù", "https://www.countries-ofthe-world.com/flags-normal/flag-of-China.png"}
    };

    public static ArrayList<Nation> getListData(){
        Nation nation = null;
        ArrayList<Nation> list = new ArrayList<>();
        for (String[] aData : data) {
            nation = new Nation();
            nation.setName(aData[0]);
            nation.setRemarks(aData[1]);
            nation.setPhoto(aData[2]);

            list.add(nation);
        }

        return list;
    }
}
