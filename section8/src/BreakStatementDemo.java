public class BreakStatementDemo {

    public static void main(String[] args) {

        for(int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        int [] arrayOfInt = { 43, 455, 4376, 343, 6 };
        int lookingFor = 455;
        boolean isFound = false;
        for(int i =0;i<arrayOfInt.length;i++) {
            if(arrayOfInt[i] == lookingFor){
                isFound = true;
                break;
            }
        }

        if(isFound) {
            System.out.println("Hurray number is found");
        } else {
            System.out.println("Oops ! Number is not found");
        }

        outerForLoop:
        for (int i =1; i<5; i++ ) {

            innerForLoop:
            for (int j =1; j < 3; j++) {
                System.out.println(" i = " + i + " and  j = " + j);
                if(i == 3){
                    break outerForLoop;
                }
            }

        }


    }

}
