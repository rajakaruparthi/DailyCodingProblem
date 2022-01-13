package com.daily.coding;

import java.util.Arrays;
import java.util.List;

public class temp {

    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(88, 92, 62, 100, 69, 88, 85,70, 50, 35, 80, 90, 60, 20);

        List<Integer> list2= Arrays.asList(96, 96, 99, 100, 90, 80, 85, 100, 90);

        temp t = new temp();
        final int n1 = list.size();
        System.out.println(n1);

        int sum1 = 0;
        for (Integer each:
             list) {
            sum1 = sum1 + each;
        }

        int sum2 = 0;
        for (Integer each:
                list2) {
            sum2 = sum2 + each;
        }

        float mean1 = (float) sum1/ n1;
        int n2 = list2.size();
        float mean2 = (float) sum2/ n2;

        float var1 = 0;
        // variance
        System.out.println("mean 1 -- "+(float) mean1);

        System.out.println("mean 2 -- "+(float) mean2);

        for (Integer each: list) {
            System.out.println(each+ " --> "+ (((float) (each) - mean1) * ((float) (each) - mean1)));
            var1 = var1 + (((float) (each) - mean1) * ((float) (each) - mean1));
        }
        float variance1 = (float) (var1/(n1 -1));

        float var2 = 0;

        System.out.println("--------------------------------");
        for (Integer each: list2) {
            System.out.println(each+ " -- > "+ (((float) (each) - mean2) * ((float) (each) - mean2)));
            var2 = var2 + (((float) (each) - mean2) * ((float) (each) - mean2));
        }
        float variance2 = (float) (var2/(n2 -1));

        System.out.println("variance1 -- "+ variance1);
        System.out.println("variance2- -- "+ variance2);


        float sd1 = (float) Math.sqrt(variance1);
        float sd2 = (float) Math.sqrt(variance2);

        System.out.println("sd1 -- "+sd1);
        System.out.println("sd2 -- "+sd2);

        float sp2 = ((n1 -1)*(sd1*sd1) + (n2 -1)*(sd2*sd2)) / (n1 + n2 -2);

        System.out.println("sp2  - "+ sp2);

        float to = (float) ((mean1 - mean2) / Math.sqrt((sp2*(0.1825))));

        System.out.println("to -- "+ to);

    }
}
