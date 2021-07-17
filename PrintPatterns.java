public class PrintPatterns {

public static void main(String args[])
{
    System.out.println("PrintPatterns");
 
    rightTriangle(4, 10);
}

public static void rightTriangle(int n, int m) 
{  
    for (int i=0; i<n; i++) //outer loop for number of rows(n)
    { 
        for (int k=0; k<=i; k++ ) //inner loop for number of columns
        { 
            System.out.print("* "); //print star
        } 

        System.out.println(); //ending line after each row
    } 
    for (int t=0; t<m; t++){
        System.out.print(". ");
    }
    System.out.println();
} 

public static void reverseRightTriangle(int n, int m) 
{  
    for (int t=0; t<m; t++){
        System.out.print(". ");
    }
    System.out.println();
    for (int i=n; i>0; i--) //outer loop for number of rows(n)
    { 
        for (int k=i; k>0; k--) //inner loop for number of columns
        { 
            System.out.print("* "); //print star
        } 
        System.out.println(); //ending line after each row
    } 

} 

    public static void pyramidPattern(int n, int m) 
    {  
        for (int i=0; i<n; i+=2) //outer loop for number of rows(n)
        { 
            for (int j= m-i; j>1; j--) //inner loop for spaces
            { 
                System.out.print(" "); //print space
            }  
            for (int k=0; k<=i; k++ ) //inner loop for number of columns
            { 
                System.out.print("* "); //print star
            } 
  
            System.out.println(); //ending line after each row
        } 
        for (int t=0; t<m; t++){
            System.out.print(". ");
        }
        System.out.println();
    } 
    public static void reversePyramidPattern(int n, int m) 
    {  
        for (int t=0; t<m; t++){
            System.out.print(". ");
        }
        System.out.println();
        
        for (int i=0; i<n; i+=2) //outer loop for number of rows(n)
        { 
            for (int j=0; j<m-n-1+i; j++) //inner loop for spaces
            { 
                System.out.print(" "); //print space
            }  
            for (int k=n-i; k>=1; k-- ) //inner loop for number of columns
            { 
                System.out.print("* "); //print star
            } 
  
            System.out.println(); //ending line after each row
        } 

    } 
} 
