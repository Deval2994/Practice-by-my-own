

public class Useless{
    public static void main(String[] args){
        int n = Tools.getInt("");
        int answer = fun(n);
        System.out.println(answer%1000000007);

    }
    private static int fun(int n){
        if (n == 0) return 2;
        else if (n == 1) return 5;
        else if (n == 2) return 9;
        else if (n == 3) return 7;
        else if (n % 2 == 0) return (fun(n-2)*(n-2)) + (fun(n-4)*(n-4));
        else return (fun(n-1)*(n-1)) + (fun(n-3)*(n-3));
    }
}