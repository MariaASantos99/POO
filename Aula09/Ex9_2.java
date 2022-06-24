package Aula09;

import java.util.*;

public class Ex9_2 {
        public static void main(String[] args) {
            /*int DIM = 5000;
            Collection<Integer> col = new ArrayList<>();
            checkPerformance(col, DIM);*/
            int[] DIM = {1000, 5000, 10000, 20000, 40000, 50000, 100000};
		
            List<Collection<Integer>> cols = new ArrayList<>();
            cols.add(new ArrayList<>());
            cols.add(new LinkedList<>());
            cols.add(new HashSet<>());
            cols.add(new TreeSet<>());
            
            System.out.printf("%-10s", "Collection");
            for(int i=0; i<DIM.length; i++) {
                System.out.printf("%15d", DIM[i]);
            }
            System.out.println("\n");
            
            for(Collection<Integer> col: cols) {
                printTable(col, DIM);
            }
        }
            
        private static double[] checkPerformance(Collection<Integer> col, int DIM) {
            double start, stop, deltaAdd, deltaSearch, deltaRemove;
            
            //Add
            start = System.nanoTime(); //clock snapshot before
            for(int i = 0; i<DIM; i++ ){
                col.add(i);
            }
            stop = System.nanoTime();  // clock snapshot after
            deltaAdd = (stop-start)/1e6; // convert to milliseconds
            //System.out.println(col.size()+ ": Add to " + col.getClass().getSimpleName() + " took "+ delta+ "ms");
            
            // Search
            start = System.nanoTime(); // clock snapshot before
            for(int i = 0; i<DIM; i++ ) {
                int n = (int) (Math.random()*DIM);if(!col.contains(n)) System.out.println("Not found???"+n);
            }
            stop = System.nanoTime();  // clock snapshot after
            deltaSearch = (stop-start)/1e6; // convert nanoseconds to milliseconds
            //System.out.println(col.size()+ ": Search to "+ col.getClass().getSimpleName() +" took "+ delta+ "ms");
            
            // Remove
            start = System.nanoTime(); // clock snapshot before
            Iterator<Integer> iterator= col.iterator();
            while(iterator.hasNext()) {
                iterator.next();
                iterator.remove();
            }
            stop = System.nanoTime();  // clock snapshot after
            deltaRemove = (stop-start)/1e6; // convert nanoseconds to milliseconds
            //System.out.println(col.size() + ": Remove from "+ col.getClass().getSimpleName() +" took "+ delta+ "ms");

            double[] arr = {deltaAdd, deltaSearch, deltaRemove};
            return arr;
        }

        private static void printTable(Collection<Integer> col, int[] DIM) {
            double[][] table = new double[DIM.length][3];
            String[] ops = {"add", "search", "remove"};
            
            for(int i=0; i<DIM.length; i++) {
                    double[] results = checkPerformance(col, DIM[i]);//Fica com dimensão 3
                    table[i] = results;
            }
            
            System.out.printf("%-10s\n", col.getClass().getSimpleName());
            for(int j=0; j<3; j++) {
                System.out.printf("%-10s", ops[j]);
                for(int i=0; i<DIM.length; i++) {
                    System.out.printf("%15.2f", table[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            
        }
}
