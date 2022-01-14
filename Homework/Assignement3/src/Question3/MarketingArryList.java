package Question3;

import java.util.ArrayList;

public class MarketingArryList {
    public static void main(String[] args) {
        ArrayList<Marketing> mList= new ArrayList<>();
        mList.add(new Marketing("chadia","rice",45));
        Marketing mark1 = new Marketing("Tehillah","milk",50);
        Marketing mark2 = new Marketing("Keza","meat",80);
        //add person
        mList.add(mark1);
        mList.add(mark2);
        System.out.println(mList);
        // remove person
        mList.remove(mark2);
        System.out.println(mList);
        //Set person
        Marketing mark3 = new Marketing("Bella","potetoes",100);
        mList.set(0,mark3);
        System.out.println(mList);
        // Size of the List
        System.out.println(mList.size());
        // total sales
        double sales = mark1.getSalesamount() + mark2.getSalesamount() + mark3.getSalesamount();
        System.out.println(sales);
//use get method
        System.out.println(mark1.getEmployeename());
        // clear method
        mList.clear();
        System.out.println(mList);
        }

        }


