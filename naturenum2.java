 class Main {
    public static void main(String[] args) {
        int n=5; 
        int ns[] = new int[n];
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            sum += i;
            ns[i - 1] = sum;
        }
        
        
        for (int num : ns) {
            System.out.print(num + " ");
            System.out.println(ns[n/2]);
        }
    }
}