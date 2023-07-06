import java.util.ArrayList;
import java.util.Random;

public class Chat {
    ArrayList <String> saetze=new ArrayList<String>();

    public void addSatz(String text){
        saetze.add(new String(text));
    }

    public String zufaellig(){
        Random random=new Random();
        int index=random.nextInt(saetze.size());

        return saetze.get(index);
    }
}
