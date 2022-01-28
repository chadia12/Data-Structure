package Question1;

import java.util.*;

public class Lab10 {
    public static void main(String[] args) {
            ArrayList<String> setlist = new ArrayList<>();
            setlist.add("Dean");
            setlist.add("Dave");
            setlist.add("Zaineh");
            setlist.add("Yasmeen");
            display(setlist);
            System.out.println("\n Counting District "+ countDistinct(setlist));

            ArrayList<String> list1 = new ArrayList<>();

            list1.add("Dean");
            list1.add("Dave");
            list1.add("Zaineh");
            ArrayList<Integer> list2 = new ArrayList<>();
            list2.add(90);
            list2.add(80);
            list2.add(94);
            System.out.println("Two List " +twoList(list1,list2));


        }
        public static Set display(ArrayList<String> name){
            Set<String> st = new HashSet<>(name);
            for(String s: st)
                System.out.print(s +" ");
            return st;
        }
        public static int countDistinct(ArrayList<String> name){
            Set<String> st = new HashSet<>(name);
            for(String s: st)
                st.add(s);
            return st.size();
        }
        public static Map twoList(ArrayList<String> name, ArrayList<Integer> num){
            Map<String, Integer> map1 = new HashMap<>();
            for (int i = 0; i < name.size() ; i++) {
                map1.put(name.get(i),num.get(i));

            }

            return map1;
        }
    }

