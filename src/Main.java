public class Main {
    public static void pattern1(){
        for(int i = 0; i <=9; i++){
            for(int j=0; j<= i; j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
    public static void pattern2(){
        for(int i= 0; i<= 8; i++){
            for(int s1=0; s1<= i; s1++){
                System.out.print("#");
            }
            for(int sp=16; sp>= 2*i; sp--){
                System.out.print(" ");
            }
            for(int s2= 0; s2<= i; s2++){
                System.out.print("#");
            }
            System.out.println();
        }
        for(int i=0; i <=18; i++){
            System.out.print("#");
        }
    }
    public static void pattern3(){
        for(int row=0; row <= 4; row++){
            for(int s1=0; s1<= 4 -row; s1++){
                System.out.print(" ");
            }
            for(int sr=1; sr<= (2*(row)+1); sr++){
                System.out.print("#");
            }
            System.out.println();
        }
        for(int row =0; row <= 3; row++){
            for(int s1= 1; s1 <= row+2; s1++){
                System.out.print(" ");
            }
            for(int sr = 1; sr <= 7-2*row; sr++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
    public static void pattern4(){
        for(int i=0; i<=9; i++){
            System.out.print("    ");
            for(int j= 0; j<= 9; j++){

                if((i == j & i != 9 )|| (j == 9-1-i & i != 9)){
                    System.out.print("#");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern1();
        System.out.println();
        pattern2();
        System.out.println();
        pattern3();
        System.out.println();
        pattern4();
    }

}