public class pattern {
    
    public static void main(String[] args) {
        pattern1(6);
                
            }
        
            public static void pattern1(int n){
        for(int i = 1; i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }

}
