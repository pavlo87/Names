import java.util.*;

public class Names {
    public static void main(String[] args) {
        Set<String> poeple = new LinkedHashSet<>();
        poeple.add("Oleg");
        poeple.add("Taras");
        poeple.add("Oleg");
        poeple.add("Vitali");
        poeple.add("Oleg");
        poeple.add("Vitali");
        poeple.add("Oksana");
        poeple.add("Viktoria");
        poeple.add("Petro");
        poeple.add("Bogdan");
        poeple.add("Sasha");
        poeple.add("Andrij");
        poeple.add("Sofija");
        poeple.add("Anton");
        poeple.add("Oksana");
        poeple.add("Viktoria");
        poeple.add("Petro");
        poeple.add("Oksana");
        poeple.add("Viktoria");
        System.out.println(poeple);
        Set<String> newpoeple = new TreeSet<>();
        newpoeple.add("Pavlo");
        newpoeple.add("Boni");
        newpoeple.add("Arsen");
        newpoeple.add("Sandra");
        newpoeple.add("Anton");
        System.out.println(newpoeple);
        poeple.addAll(newpoeple);
        System.out.println(poeple);
        Set<String> npoeple = new HashSet<>();
        npoeple.add("Oksana");
        npoeple.add("Viktoria");
        npoeple.add("Petro");
        npoeple.add("Oksana");
        npoeple.add("Viktoria");
        System.out.println(npoeple);
        System.out.println(poeple);
        ArrayList<String> po = new ArrayList<>();
        po.addAll(poeple);
        for (int i = 0; i < po.size(); i++) {
            if ((po.get(i).startsWith("A"))|| (po.get(i).startsWith("B"))||
                    (po.get(i).startsWith("C"))||(po.get(i).startsWith("V"))||
                    (po.get(i).startsWith("P"))) {
                po.remove(po.get(i));i=i-1;
               if (i!=0)
               {
                    i=i-1;
                }
            }
        }
        System.out.println(po);
        }




    }



