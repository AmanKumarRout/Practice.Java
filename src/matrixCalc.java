import java.util.Scanner;

public class matrixCalc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Matrix matrix=new Matrix();
        System.out.println("Choose option 1: print matrix 2: Addition 3: Subtraction 4: Multiplication");
        int choice=sc.nextInt();
        switch (choice){
            case 1-> matrix.printMatrix();
            case 2-> matrix.addmatrix();
            case 3-> matrix.submatrix();
            case 4-> matrix.mulmatrix();
            default-> System.out.println("Wrong choice");
        }
    }
}
class Matrix {
    void printMatrix() {
        System.out.print("Enter rows and columns of the matrix1: ");
        Scanner sc=new Scanner(System.in);
        int row1 =sc.nextInt();
        int col1 =sc.nextInt();
        System.out.print("Enter the elements of the matrix1: ");
        int[][] matrix1=new int[row1][col1];
        for (int i = 0; i <row1 ; i++) {
            for (int j = 0; j < col1; j++) {
                matrix1[i][j]=sc.nextInt();
            }

        }
        for (int i = 0; i <row1 ; i++) {
            for (int j = 0; j <col1 ; j++) {
                System.out.print(matrix1[i][j]+" ");
            }
            System.out.println();
        }
    }
    //addition
    void addmatrix(){
        System.out.print("Enter rows and columns of the matrix1: ");
        Scanner sc=new Scanner(System.in);
        int row1 =sc.nextInt();
        int col1 =sc.nextInt();
        System.out.print("Enter the elements of the matrix1: ");
        int[][] matrix1=new int[row1][col1];
        for (int i = 0; i <row1 ; i++) {
            for (int j = 0; j < col1; j++) {
                matrix1[i][j]=sc.nextInt();
            }

        }
        System.out.print("Enter rows and columns of the matrix2: ");
        int row2 =sc.nextInt();
        int col2 =sc.nextInt();
        System.out.print("Enter the elements of the matrix2: ");
        int[][] matrix2=new int[row2][col2];
        for (int k = 0; k <row2 ; k++) {
            for (int l = 0; l < col2; l++) {
                matrix2[k][l]=sc.nextInt();
            }

        }

        //add
        if(matrix1.length==matrix2.length){
            int r=row1;
            int c=col1;
            int[][] add=new int[r][c];
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    add[i][j]=matrix1[i][j]+matrix2[i][j];

                }

            }
            //add print
            for (int i = 0; i <add.length ; i++) {
                for (int j = 0; j < add[i].length; j++) {
                    System.out.print(add[i][j]+" ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("The matrix dimension is inconsistent");
        }

    }
    void submatrix(){
        System.out.print("Enter rows and columns of the matrix1: ");
        Scanner sc=new Scanner(System.in);
        int row1 =sc.nextInt();
        int col1 =sc.nextInt();
        System.out.print("Enter the elements of the matrix1: ");
        int[][] matrix1=new int[row1][col1];
        for (int i = 0; i <row1 ; i++) {
            for (int j = 0; j < col1; j++) {
                matrix1[i][j]=sc.nextInt();
            }

        }
        System.out.print("Enter rows and columns of the matrix2: ");
        int row2 =sc.nextInt();
        int col2 =sc.nextInt();
        System.out.print("Enter the elements of the matrix2: ");
        int[][] matrix2=new int[row2][col2];
        for (int k = 0; k <row2 ; k++) {
            for (int l = 0; l < col2; l++) {
                matrix2[k][l]=sc.nextInt();
            }

        }

        //add
        if(matrix1.length==matrix2.length){
            int r=row1;
            int c=col1;
            int[][] add=new int[r][c];
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    add[i][j]=matrix1[i][j]-matrix2[i][j];

                }

            }
            //add print
            for (int i = 0; i <add.length ; i++) {
                for (int j = 0; j < add[i].length; j++) {
                    System.out.print(add[i][j]+" ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("The matrix dimension is inconsistent");
        }

    }
    void mulmatrix(){
        System.out.print("Enter rows and columns of the matrix1: ");
        Scanner sc=new Scanner(System.in);
        int row1 =sc.nextInt();
        int col1 =sc.nextInt();
        System.out.print("Enter the elements of the matrix1: ");
        int[][] matrix1=new int[row1][col1];
        for (int i = 0; i <row1 ; i++) {
            for (int j = 0; j < col1; j++) {
                matrix1[i][j]=sc.nextInt();
            }

        }
        System.out.print("Enter rows and columns of the matrix2: ");
        int row2 =sc.nextInt();
        int col2 =sc.nextInt();
        System.out.print("Enter the elements of the matrix2: ");
        int[][] matrix2=new int[row2][col2];
        for (int k = 0; k <row2 ; k++) {
            for (int l = 0; l < col2; l++) {
                matrix2[k][l]=sc.nextInt();
            }

        }
        if(col1==row2){
            int[][] multiply=new int[row1][col2];
            for (int i = 0; i < multiply.length; i++) {
                for (int j = 0; j < multiply[i].length; j++) {
                    multiply[i][j] +=matrix1[i][j]*matrix2[j][i];
                }
            }
            for (int i = 0; i < multiply.length; i++) {
                for (int j = 0; j < multiply[i].length; j++) {
                    System.out.print(multiply[i][j]+" ");
                }
                System.out.println();
            }
        }
        else {
            System.out.println("The matrix dimension is inconsistent");
        }

    }
}
