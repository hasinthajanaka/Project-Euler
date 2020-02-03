package org.projecteuler;

public class Problem2 {

    public static void main(String[] args) {

        Long fab = 2L;
        Long prev = 1L;
        Long sum = 0L;
        final Long max = 4000000L;

        do {
            if(fab % 2 == 0) {
                sum += fab;
            }

            Long prevFab = prev;
            prev = fab;
            fab = fab + prevFab;

        } while (fab < max);

        System.out.println(sum);
    }
}
