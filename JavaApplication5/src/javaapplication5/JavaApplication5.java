package javaapplication5;

public class JavaApplication5 {

  
    public static void main(String[] args) {
    int[][] aray2=new int[3][3];
    aray2[0][0]=13;
    aray2[0][1]=12;
    aray2[0][2]=14;
    
    aray2[1][0]=2;
    aray2[1][1]=3;
    aray2[1][2]=1;

    aray2[2][0]=15;
    aray2[2][1]=18;
    aray2[2][2]=187;
    
for(int i=0;i<3;i++){
    System.out.println();
for(int j=0;j<3;j++){
System.out.print(aray2[i][j]+"\t");
}
}
System.out.println();
    }
    
}
