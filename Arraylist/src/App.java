import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayList<String> food = new ArrayList<String>();
        // list inside list ArrayList<ArrayList<String>>food = new ArrayList<String>();

        food.add("amin");
        food.add("sahbi");
        food.add("jihed");
        food.set(0,"youssef");
        //food.remove(2);
        //food.clear();
        /*for(int i=0; i<food.size();i++){
        System.out.println(food.get(i));
        }*/
        // for-each loop
        for(String i: food){
            System.out.println(i);
        }

    }
}
