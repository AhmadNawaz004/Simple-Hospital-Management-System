/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.management.system;
import java.util.Scanner;
/**
 *
 * @author hp probook
 */
public class HospitalManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String a[][]=new String[8][10];
        Scanner b=new Scanner(System.in);
        for(int i=0; i<8; i++)
        {
            for(int j=0; j<10; j++)
                {
                    if(j==0){
                        System.out.println("Enter Hosiptal name");
                        a[i][j]=b.nextLine();
                }
                    else
                    if(j==1){
                        System.out.println("Enter Depertment name");
                        a[i][j]=b.nextLine();
        }
        else
        if(j==2){
            System.out.println("Enter Department employees name");
            a[i][j]=b.nextLine();
                }
        else if(j==3){
                System.out.println("Enter Doctor name");
                a[i][j]=b.nextLine();
        }
                else
            if(j==4){
                System.out.println("Enter patient name");
                a[i][j]=b.nextLine();
            }
                else
            if(j==5){
                System.out.println("Enter patient aaddres");
            }
               else
                if(j==6)
            {
                System.out.println("Enter patient phone no.");
                a[i][j]=b.nextLine();
            }
            else
            if(j==7){
               System.out.println("Enter patient Email");
               a[i][j]=b.nextLine();
                }
            else
                if(j==8){
            System.out.println("Enter patient Id");
            a[i][j]=b.nextLine();
                
            }
                    else
                    {
                            System.out.println("Enter patient Bills datial");
                            a[i][j]=b.nextLine();
                            }
            }
        
        System.out.println("\tHosiptal\tDepartment\temployees\tDoctor\tpatient name\tpatient Email\tphone no\tID\tBills datial");
        
        {
            for(int j=0; j<10; j++)
            {
                if(j==8)
                {
                    System.out.println(" ");
                }
                else
                {
                    System.out.println("\t");
                    System.out.println(a[i][j]);
                    
                }
                }
            }
        
                
                
        
        // TODO code application logic here
    
        }
        // TODO code application logic here
    }
    
}
        // TODO code application logic her
