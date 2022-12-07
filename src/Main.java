import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int n = sc.nextInt(); //Dong
        System.out.print("Enter column ");
        int m = sc.nextInt(); //Cot
        int array[][] = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.printf("Enter row %d, column %d: ", i, j);
                array[i][j] = sc.nextInt();
            }
        }
        int max = array[0][0];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("Max is: "+ max);
    }
}