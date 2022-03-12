public class Sansu{

    public static int gcf(int a,int b){
        int l = a;
        int s = b;
        int counter = 0;
        while( l != s ){
            System.out.println(++counter);
            if(l > s ){
                l =  l - s;
            }else if(l < s){
                s = s - l;             
            } 
        }
        System.out.println(++counter);
        return l;
    } 

    public static void main(String[] args){
        int a = 876;
        int b = 204;
        int g = gcf(a,b);
        System.out.println(a+"と"+b+"の最大公約数は"+g+"です。");

    }
}  