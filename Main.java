
/**********************************************************
 *
 * Homework #4 (Programming Assignment). This assignment has two parts:
 *   (1) The first being that you must complete the implementation of select
 *   methods within the Hash Map (Hash Table) object provided in file
 *   myHashMap.java. This object is emulating the Hashmap object within
 *   Java's Collection Framework Library.
 *   (2) Second is solving simple collection problems contained within
 *   the file HashProblems.java, which are using the HashMap object contained
 *   within the Java Collection Framework library. Note that HashMap's internal
 *   implementation is using ArrayList (for buckets) and LinkedList (for the
 *   collision chain), which is the same approach being used by our implementation
 *   referred to above.
 *
 * This main file is a driver for testing these methods that you write within
 * the files 'myHashMap.java' and 'HashProblems.java'. Your work will need to
 * pass all the tests for 100%
 *
 *             *** DO NOT MANIPULATE / CHANGE THIS FILE ***
 *
 *********************************************************/

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        myHashMap<String, Integer> hashmap = new myHashMap<>();
        boolean removeErrorFlag = false;
        boolean replaceErrorFlag = false;
        boolean getAverageErrorFlag = false;
        boolean oddErrorFlag = false;
        boolean twoSumsErrorFlag = false;
        Integer oldValue;
        int assignmentScore = 0;

        /*
         * Populate sample data into the hash map
         */

        hashmap.put("Key_1", 1);
        hashmap.put("Key_2", 2);
        hashmap.put("Key_3", 3);
        hashmap.put("Key_4", 4);
        hashmap.put("Key_5", 5);
        hashmap.put("Key_6", 6);
        hashmap.put("Key_7", 7);
        hashmap.put("Key_8", 8);
        hashmap.put("Key_9", 9);
        hashmap.put("Key_10", 10);
        hashmap.put("Key_11", 11);
        hashmap.put("Key_12", 12);
        hashmap.put("Key_13", 13);
        hashmap.put("Key_14", 14);
        hashmap.put("Key_15", 15);
        hashmap.put("Key_16", 16);
        hashmap.put("Key_17", 17);
        hashmap.put("Key_18", 18);
        hashmap.put("Key_19", 19);
        hashmap.put("Key_20", 20);
        hashmap.put("Key_21", 21);
        hashmap.put("Key_22", 22);
        hashmap.put("Key_23", 23);
        hashmap.put("Key_24", 24);
        hashmap.put("Key_25", 25);
        hashmap.put("Key_26", 26);
        hashmap.put("Key_27", 27);
        hashmap.put("Key_28", 28);
        hashmap.put("Key_29", 29);
        hashmap.put("Key_30", 30);
        hashmap.put("Key_31", 31);
        hashmap.put("Key_32", 32);
        hashmap.put("Key_33", 33);
        hashmap.put("Key_34", 34);
        hashmap.put("Key_35", 35);
        hashmap.put("Key_36", 36);
        hashmap.put("Key_37", 37);
        hashmap.put("Key_38", 38);
        hashmap.put("Key_39", 39);
        hashmap.put("Key_40", 40);
        hashmap.put("Key_41", 41);
        hashmap.put("Key_42", 42);
        hashmap.put("Key_43", 43);
        hashmap.put("Key_44", 44);
        hashmap.put("Key_45", 45);
        hashmap.put("Key_46", 46);
        hashmap.put("Key_47", 47);
        hashmap.put("Key_48", 48);
        hashmap.put("Key_49", 49);
        hashmap.put("Key_50", 50);


        /*******************************************************************
         *
         *              Tests for the myHashMap remove(K) method
         *
         ******************************************************************/

        // remove() should return null, as key does not exist in hashmap
        if ( hashmap.remove("NOT FOUND") != null ) {
            System.out.println("Error 1: remove failed");
            removeErrorFlag = true;
        }

        // remove() returns the node object deleted, key should exist and been deleted
        if ( ! removeErrorFlag && hashmap.remove("Key_5") == null ) {
            System.out.println("Error 2: remove failed");
            removeErrorFlag = true;
        }

        // The K/V pair <Key_4,4> should be in hashmap, verify the value can be found
        if ( ! removeErrorFlag && ! hashmap.containsValue(4)) {
            System.out.println("Error 3: containsValues failed");
            removeErrorFlag = true;
        }

        // The K/V pair <Key_4,4> should be in hashmap, verify the key can be found
        if ( ! removeErrorFlag && ! hashmap.containsKey("Key_4")) {
            System.out.println("Error 4: containsKey failed");
            removeErrorFlag = true;
        }

        // The K/V pair <Key_5,5> has already been deleted, verify the value is not found
        if ( ! removeErrorFlag && hashmap.containsValue(5)) {
            System.out.println("Error 5: containsValues failed");
            removeErrorFlag = true;
        }

        // The K/V pair <Key_5,5> has already deleted, verify key is not found
        if ( ! removeErrorFlag && hashmap.containsKey("Key_5")) {
            System.out.println("Error 6: containsKey failed");
            removeErrorFlag = true;
        }

        // There should be 49 elements contained within the hashmap, verify.
        if ( removeErrorFlag && hashmap.Size() != 49 ) {
            System.out.println("Error 7: Size failed");
            removeErrorFlag = true;
        }


        /*******************************************************************
         *
         *            Tests for the myHashMap replace(K,V) method
         *
         ******************************************************************/
      
        oldValue = hashmap.replace("Key_8", 16);

        // verify replace returned the previous value, which should be 8
        if ( oldValue != 8 ) {
            System.out.println("Error 8: replace failed");
            replaceErrorFlag = true;
        }

        // The value 8 should no longer exit in the hashmap
        if ( ! replaceErrorFlag && hashmap.containsValue(8)) {
            System.out.println("Error 9: containsValues failed");
            replaceErrorFlag = true;
        }

        // The value 8 was replaced with 16, this new value should be found
        if ( ! replaceErrorFlag && ! hashmap.containsValue(16)) {
            System.out.println("Error 10: containsValues failed");
            replaceErrorFlag = true;
        }

        // 'Key_8' should still be found in the hashmap
        if ( ! replaceErrorFlag && ! hashmap.containsKey("Key_8")) {
            System.out.println("Error 11: containsKey failed");
            replaceErrorFlag = true;
        }


        /*******************************************************************
         *
         *          Tests for the myHashMap replace(K,V, V) method
         *
         ******************************************************************/

        // false should be returned, as Key_9's value is not 0
        if ( ! replaceErrorFlag && hashmap.replace("Key_9", 0, 100 ) ) {
            System.out.println("Error 12: replace failed");
            replaceErrorFlag = true;
        }

        // true should be returned, as Key_9's value is 9
        if ( ! replaceErrorFlag && ! hashmap.replace("Key_9", 9, 100 ) ) {
            System.out.println("Error 13: replace failed");
            replaceErrorFlag = true;
        }

        // There is no key String_1, so false should be returned
        if ( ! replaceErrorFlag && hashmap.replace("String_1", 9, 100 ) ) {
            System.out.println("Error 14: replace failed");
            replaceErrorFlag = true;
        }

        // The value 9 was replaced with 100 above, this new value should be found
        if ( ! replaceErrorFlag && ! hashmap.containsValue(100)) {
            System.out.println("Error 15: containsValues failed");
            replaceErrorFlag = true;
        }

        // 'Key_9' should be found in the hashmap
        if ( ! replaceErrorFlag && ! hashmap.containsKey("Key_9")) {
            System.out.println("Error 16: containsKey failed");
            replaceErrorFlag = true;
        }


        /*
         * You can temporarily un-comment either the subsequent and/or both statements iff
         * you want to visually see what is in the HashMap for debugging purposes. Do recall,
         * that unlike trees, hashmaps retain no order, so they will not be displayed in the
         * insertion order. But, recommend instead use your IDE debugger to debug instead.
         */

        //System.out.println("HashMap Ks only : " + hashmap.keySet());
        //System.out.println("\nHashMap K/Vs  : " + hashmap.entrySet() + "\n");



        /*
         *
         *  Testing now the methods in the object HashingProblems
         *
         */


        /*******************************************************************
         *
         *          Tests HashingProblems for getAverage
         *
         ******************************************************************/

        HashingProblems hp = new HashingProblems();

        HashMap<Integer, Integer> hash_map = new HashMap<>();
        hash_map.put(1, 10);
        hash_map.put(2, 20);
        hash_map.put(5, 50);
        hash_map.put(12, 100);
        hash_map.put(3, 3);
        int[] arr1 = {100, 1, 2, 9, 7, 8, 15};
        int[] arr2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

        // based on the above values, the average should be 15.0
        if ( hp.getAverage(hash_map, arr1) != (double) 15.0 ) {
            System.out.println("Error 17: getAverage failed");
            getAverageErrorFlag = true;
        }

        // based on the above values, the average should be 36.6
        if ( ! getAverageErrorFlag && hp.getAverage(hash_map, arr2) != (double) 36.6 ) {
            System.out.println("Error 18: getAverage failed");
            getAverageErrorFlag = true;
        }


        /*******************************************************************
         *
         *          Tests HashingProblems for odd
         *
         ******************************************************************/

        ArrayList<String> ArrayList1 = new ArrayList<String>( Arrays.asList("Diana", "Adam", "Kavitha", "Mushjtaba", "Peter"));
        ArrayList<String> ArrayList2 = new ArrayList<String>();
        HashMap<Integer, String> hash_map2 = new HashMap<>();
        hash_map2.put(1, "Diana");
        hash_map2.put(2, "Naomi");
        hash_map2.put(3, "Adam");
        hash_map2.put(4, "Eric");
        hash_map2.put(5, "Kavitha");
        hash_map2.put(6, "Yu");
        hash_map2.put(7, "Mushjtaba");
        hash_map2.put(8, "Marisa");
        hash_map2.put(9, "Peter");
        hash_map2.put(10, "Slanovich");

        ArrayList2 = hp.odd(hash_map2);

        /*
         * You can temporarily un-comment both of the following statements if you need
         * to visually debug the method odd(); but recommend instead using your IDE
         * debugger to debug instead.
         */

        //System.out.println("Result should be the following: <" + ArrayList1 + ">");
        //System.out.println("Result is as follows          : <" + ArrayList2 + ">");

        if (ArrayList1.equals(ArrayList2) == false ) {
            System.out.println("Error 19: odd failed");
            oddErrorFlag = true;
        }


        /*******************************************************************
         *
         *          Tests HashingProblems for twoSums
         *
         ******************************************************************/

        int [] numberList = new int[] {1,4,5,7,8,9};
        int k1 = 4;
        int k2 = 5;

        // When k=4, answer should be 3
        if ( hp.twoSums(numberList, k1) != 3 ) {
            System.out.println("Error 20: twoSums failed");
            twoSumsErrorFlag = true;
        }

        // When k=5, answer should be 1
        if ( ! twoSumsErrorFlag && hp.twoSums(numberList, k2) != 1 ) {
            System.out.println("Error 21: twoSums failed");
            twoSumsErrorFlag = true;
        }

        /*
         * You can temporarily un-comment both of the following statements if you need
         * to visually debug the method odd(); but recommend instead using your IDE
         * debugger to debug instead.
         */

        //System.out.println("TwoSums where k=" + k1 + ", result was: " + hp.twoSums(numberList, k1));
        //System.out.println("TwoSums where k=" + k2 + ", result was: " + hp.twoSums(numberList, k2));



        /*******************************************************************
         *
         *                   Calculate the final score
         *
         ********************************************8*********************/

        if ( ! removeErrorFlag ) {
            assignmentScore += 25;
            System.out.println("Automated HashMap remove testing terminated  -- tests PASSED");
        } else {
            System.out.println("Automated Hashmap remove testing terminated  -- tests FAILED ***");
        }

        // Adjust assignment score for TreeMap removeEven testing
        if ( ! replaceErrorFlag ) {
            assignmentScore += 25;
            System.out.println("Automated Hashmap replace testing terminated -- tests PASSED");
        } else {
            System.out.println("Automated Hashmap replace testing terminated -- tests FAILED ***");
        }

        // Adjust assignment score for HashingProblems getAverage testing
        if ( ! getAverageErrorFlag ) {
            assignmentScore += 15;
            System.out.println("Automated HashingProblems, getAvg terminated -- tests PASSED");
        } else {
            System.out.println("Automated HashingProblems, getAvg terminated -- tests FAILED ***");
        }

        // Adjust assignment score for HashingProblems odd testing
        if ( ! oddErrorFlag ) {
            assignmentScore += 10;
            System.out.println("Automated HashingProblems, odd terminated    -- tests PASSED");
        } else {
            System.out.println("Automated HashingProblems, odd terminated    -- tests FAILED ***");
        }

        // Adjust assignment score for HashingProblems odd testing
        if ( ! twoSumsErrorFlag ) {
            assignmentScore += 25;
            System.out.println("Automated HashingProblems, twoSum terminated -- tests PASSED");
        } else {
            System.out.println("Automated HashingProblems, twoSum terminated -- tests FAILED ***");
        }

        System.out.println("\nAssignment score is: " + assignmentScore);
    }

}