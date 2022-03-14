import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Bogotyann {
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        List<Integer> list = Arrays.asList(5,1,2,3,4);
        while(isAscendingOrder(list)==false){
            Collections.shuffle(list);
        }
        System.out.println(list);
        long endTime = System.currentTimeMillis();
        System.out.println("syori:"+(endTime-startTime)+"ms");
    }

    public static boolean isAscendingOrder(List<Integer> list){
        int i=0;
        for(;i<=list.size()-2 && list.get(i)<=list.get(i+1);i++);
        if(i==list.size()-1){
            return true;
        }
        return false;
    }
}