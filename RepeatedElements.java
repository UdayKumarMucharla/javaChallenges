import java.util.*;
import java.util.HashMap;
import java.util.Scanner;

public class RepeatedElements {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < size ; i++){
            int val = sc.nextInt();
            if( map.containsKey(val)){
                map.put(val,map.get(val)+1);
            }else{
                map.put(val,1);
            }
        }
        System.out.println(map.toString());
        int k = sc.nextInt();
        List<Integer> dummyList = new ArrayList<Integer>();
        map.forEach((key,value)->{
            if(map.get(key)== map.get(k))
                dummyList.add(key);
        });
        if(dummyList.size()>=1)
        System.out.println("Final OutPut::"+Collections.min(dummyList));
    }
}
