package com.example.nationrecycle;

import java.util.ArrayList;

public class NationData {
    public static String[][] data = new String[][]{
            {"Indonesia", "Bhineka Tunggal Ika", "https://www.countries-ofthe-world.com/flags-normal/flag-of-Indonesia.png", "Indonesia is a country in Southeast Asia, between the Indian and Pacific oceans. " +
                    "It is the world's largest island country, with more than seventeen thousand islands, and at 1,904,569 square kilometres (735,358 square miles), the 14th largest by land area and the 7th largest in combined sea and land area. " +
                    "With over 261 million people, it is the world's 4th most populous country as well as the most populous Muslim-majority country. Java, the world's most populous island, is home to more than half of the country's population."},
            {"Japan", "Kaikoku Shinsu", "https://www.countries-ofthe-world.com/flags-normal/flag-of-Japan.png", "Japan is an island country in East Asia. Located in the Pacific Ocean, it lies off the eastern coast of the Asian continent and " +
                    "stretches from the Sea of Okhotsk in the north to the East China Sea and the Philippine Sea in the south."},
            {"Germany", "Einigkeit und Recht und Freiheit", "https://www.countries-ofthe-world.com/flags-normal/flag-of-Germany.png", "Germany is a country in Central and Western Europe, lying between the Baltic and North Seas to the north, " +
                    "and the Alps, Lake Constance and the High Rhine to the south. It borders Denmark to the north, Poland and the Czech Republic to the east, Austria and Switzerland to the south, " +
                    "France to the southwest, and Luxembourg, Belgium and the Netherlands to the west."},
            {"South Korea", " Hongik Ingan", "https://www.countries-ofthe-world.com/flags-normal/flag-of-Korea-South.png", "South Korea is is a country in East Asia, constituting the southern part of the Korean Peninsula. " +
                    "The name Korea is derived from Goguryeo which was one of the great powers in East Asia during its time, ruling most of the Korean Peninsula, Manchuria, parts of the Russian Far East and Inner Mongolia " +
                    "under Gwanggaeto the Great. Its capital, Seoul, is a major global city and half of South Korea's 51 million people live in the Seoul Capital Area, the fourth largest metropolitan economy in the world."},
            {"United States", "In God We Trust", "https://www.countries-ofthe-world.com/flags-normal/flag-of-United-States-of-America.png", "United States is a country comprising 50 states, a federal district, " +
                    "five major self-governing territories, and various possessions. At 3.8 million square miles (9.8 million km2), the United States is the world's third or fourth largest country by total area " +
                    "and is slightly smaller than the entire continent of Europe's 3.9 million square miles (10.1 million km2). With a population of over 327 million people, the U.S. is the third most populous country. " +
                    "The capital is Washington, D.C., and the largest city by population is New York City."},
            {"United Kingdom", "Dieu et mon droit", "https://www.countries-ofthe-world.com/flags-normal/flag-of-United-Kingdom.png", "United Kingdom (UK) is a sovereign country located off the north-western coast of the European mainland. " +
                    "The United Kingdom includes the island of Great Britain, the north-eastern part of the island of Ireland, and many smaller islands. Northern Ireland is the only part of the United Kingdom that shares a land border with another sovereign state, " +
                    "the Republic of Ireland. Apart from this land border, the United Kingdom is surrounded by the Atlantic Ocean, with the North Sea to the east, the English Channel to the south and the Celtic Sea to the south-west, " +
                    "giving it the 12th-longest coastline in the world. The Irish Sea lies between Great Britain and Ireland. With an area of 242,500 square kilometres (93,600 sq mi), " +
                    "the United Kingdom is the 78th-largest sovereign state in the world. It is also the 22nd-most populous country, with an estimated 66.0 million inhabitants in 2017."},
            {"France", "Liberté, Egalité, Fraternité", "https://www.countries-ofthe-world.com/flags-normal/flag-of-France.png", "France is is a country whose territory consists of metropolitan France in Western Europe and " +
                    "several overseas regions and territories.[XIII] The metropolitan area of France extends from the Mediterranean Sea to the English Channel and the North Sea, and from the Rhine to the Atlantic Ocean. " +
                    "It is bordered by Belgium, Luxembourg and Germany to the northeast, Switzerland and Italy to the east, and Andorra and Spain to the south. The overseas territories include French Guiana in South America " +
                    "and several islands in the Atlantic, Pacific and Indian oceans."},
            {"China", "Wèi rénmín fúwù", "https://www.countries-ofthe-world.com/flags-normal/flag-of-China.png", "China is is a country in East Asia and the world's most populous country, with a population of around 1.404 billion. " +
                    "Covering approximately 9,600,000 square kilometers (3,700,000 sq mi), it is the third- or fourth-largest country by total area. Governed by the Communist Party of China, the state exercises jurisdiction over 22 provinces, " +
                    "five autonomous regions, four direct-controlled municipalities (Beijing, Tianjin, Shanghai, and Chongqing), and the special administrative regions of Hong Kong and Macau."}
    };

    public static ArrayList<Nation> getListData(){
        Nation nation = null;
        ArrayList<Nation> list = new ArrayList<>();
        for (String[] aData : data) {
            nation = new Nation();
            nation.setName(aData[0]);
            nation.setRemarks(aData[1]);
            nation.setPhoto(aData[2]);
            nation.setDesc(aData[3]);

            list.add(nation);
        }

        return list;
    }
}
