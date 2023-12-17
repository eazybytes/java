public class ContinueStatementDemo {

    public static void main(String[] args) {

        for(int i = 0; i < 10; i++) {
            if ( i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }

        outer:
        for (int i =1; i<5; i++ ) {

            inner:
            for (int j =1; j < 5; j++) {
                if(j == 2){
                    continue outer;
                }
                System.out.println(" i = " + i + " and  j = " + j);
            }

        }

    }

}
