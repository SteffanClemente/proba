public class Main {
    public static void main(String[] args) {
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < i; j++);{
//                System.out.print("8");
//
//            }
//
//
//            for (int k = 0; k < 8; k++) {
//
//                for (int l = 1; l < k; l++) {
//                    System.out.print("*");
//                }
//
//            }
//            System.out.println();
//
//
//        }
        for (int i = 10; i-- > 0; ) {
            for (int j = 0; j < 9-i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j);
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(j);
                if(j<i){
                    System.out.print(" ");
                }

            }
            System.out.println();
        }


    }
}
