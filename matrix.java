import java.util.Scanner;

class main{
    int i,j;
    public int[][] addition(int a[][],int b[][]){
        int c[][]=a;
        for(i=0;i<c.length;i++){
            for(j=0;j<c[i].length;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        return c;
    }
    public int[][] multiplication(int a[][],int b[][]){
        int c[][]=a;
        for(i=0;i<c.length;i++){
            for(j=0;j<c[i].length;j++){
                c[i][j]=a[i][j]*b[i][j];
            }
        }
        return c;
    }
    public void transpose(int a[][]){
        for(i=0;i<a.length;i++){
        for(j=0;j<a[i].length;j++){
            System.out.print(a[j][i]+" ");
        }
        System.out.println();
       } 
        
    }
    public void display(int a[][]){
       for(i=0;i<a.length;i++){
        for(j=0;j<a[i].length;j++){
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
       } 
    }
    
    public static void main(String [] args){
        main m = new main();
       Scanner sc = new Scanner(System.in);
        boolean bool=true;
        System.out.println("3X3 ARRAY OPERATION");
        System.out.println("Enter the rows and colums first matrix:");
        int row=sc.nextInt();
        int column=sc.nextInt();
        int a[][]=new int[row][column];
         for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.println("Enter the element"+i+","+j);
                a[i][j]=sc.nextInt();
            }
        }
         System.out.println("Enter the rows and colums for second matrix :");
        int row1=sc.nextInt();
        int column1=sc.nextInt();
        int b[][]=new int[row1][column1];
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                System.out.println("Enter the element"+i+","+j);
                b[i][j]=sc.nextInt();
            }
        }
        int add[][]=new int[row][column];
        int sub[][]=new int[row][column];
        while(bool){
            System.out.println("+-*====MATRIXS====*-+");
            System.out.println("1.Addition Matrix");
            System.out.println("2.Multiplication of Matrix");
            System.out.println("3.Transpose Matrix (T)");
            System.out.println("4.Display Matrix");
            System.out.println("5.Exit");
            System.out.print("Enter your choice : ");
            int ch=sc.nextInt();
            try{
            switch(ch){
                case 1:
                    add=m.addition(a,b);
                    break;
                case 2:
                    sub=m.multiplication(a,b);
                    break;
                case 3:
                    System.out.println("==Which matrix if you want to transpose==");
                    System.out.println("1.First Matrix\n2.Second Matrix\n3.Exit");
                    System.out.print("Enter the Option : ");
                    int t=sc.nextInt();
                        if(t==1){
                            m.transpose(a);
                        }
                        else if(t==2)
                            {
                                m.transpose(b);
                        }
                        else if(t==3){
                            break;
                        }
                        else{
                            System.out.println("please Enter valid option...!!!");
                    }
                break;
                case 4:
                    System.out.println("which matrix if you want to see :");
                    System.out.println("1.First matrix\n2.Second matrix\n3.Additon of Matrixs\n4.multiplication of matrix");
                    System.out.print("Enter your option :");
                    int w=sc.nextInt();
                    if(w==1){
                    m.display(a);
                    }
                    else if(w==2){
                        m.display(b);
                    }
                   else if(w==3){
                        m.display(add);
                    }
                    else if(w==4){
                        m.display(sub);
                    }
                    else{
                        System.out.println("Invalid option..!!!");
                    }
                    break;
                case 5:
                    bool=false;
                    break;
                default:
                    System.out.println("Enter the valid choice..!!!");
            }
            }
            catch(Exception ArrayIndexOutOfBoundsException){
                System.out.println("This transpose format currently not working...sorry!!!");
            }
        }   
    }
}