import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //01
//        Scanner scn =new Scanner(System.in);
//        String v1 = scn.next();
//        int v2 =Integer.parseInt(v1),sum=0;
//        while (v2>0){//執行條件
//            int v3=v2%10;
//            sum += v3;
//            v2=v2/10;
//        }
//        System.out.println(sum);
        //02
        Scanner scn =new Scanner(System.in);
        char vul=scn.next().charAt(0);

        if (vul>=97){
            System.out.println(Character.toUpperCase(vul));
        }else {
            System.out.println(Character.toLowerCase(vul));
        }
    }
}
