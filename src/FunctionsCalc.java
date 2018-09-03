import java.util.ArrayList;
import java.util.HashMap;

public class FunctionsCalc {

    public void countPossibleInjections(char[] inputArr, char[] outputArr){
        HashMap<Character,Character> mapper = new HashMap<>();
        //ArrayList<char[]> componitions = new ArrayList<>();
        //int count = 0;
        int possibleFunction = (inputArr.length * outputArr.length);
        for(char element: inputArr){
            for(char val: outputArr){
                mapper.put(element, val);
                System.out.println("[" + element + " , " + val + "]");
            }
        }
        System.out.println("Number of possible Injections: " + possibleFunction);
        //return count;
    }

    public void countPossibleOnto(char[] inputArr, char[] outputArr){

    }
}
