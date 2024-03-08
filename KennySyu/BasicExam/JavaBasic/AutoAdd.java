package JavaBasic;

public class AutoAdd {

    public static void main(String[] args) {
        int i = 1;
        i = i++;
        int j = i++;
        int k = i + ++i * i++;
        System.out.println("i=" + i);
        System.out.println("j=" + j);
        System.out.println("k=" + k);
    }
}


// stack local
// i =1 ;
//  j =1 ; i =2;
// k=2 , ++i =2+1=3 , i=3; 3*3 +2 =11 ;