public class Sieve_of_Eratosthenes {
    public static void main(String[] args) {
        int n=100;
        PrimeSeive(n);
    }
    // kisi index pe false set hai us index ko prime number consider krna hai
    // kisi index pe true set hai us index ko not prime number consider krna hai
    public static void PrimeSeive(int n){
        boolean arr[]=new boolean[n+1];
        arr[0]=true;
        arr[1]=true;
        for (int i = 2; i < arr.length; i++) {
            if(arr[i]==false)
            {
                for (int j = 2; j*i <= n ; j++) {
                    arr[i*j]=true;//
                }
            }
        }
        for (int i = 2; i < arr.length; i++) {
            if(arr[i]==false)
            {
                System.out.print(i+" ");
            }
        }
    }

}
