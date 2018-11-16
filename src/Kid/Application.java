package Kid;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

public  class Application {


    public static void main(String[] args) {

        Set kids = new TreeSet();
        kids.add(new Kid("Sofija", 15));
        kids.add(new Kid("Vika", 7));
        kids.add(new Kid("Volodja", 11));
        kids.add(new Kid("Oleg", 9));
        kids.add(new Kid("Olja", 13));
        kids.add(new Kid("Katja", 10));
        for (Object na : kids) {
            System.out.println(na);
        }
    }

}
