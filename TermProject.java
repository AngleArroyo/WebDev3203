import java.util.*;
class Main{
    public static void main(String [] args){
       
    
        Scanner input = new Scanner(System.in);

////////////////////////  \/\/\/\/  CODE FOR ACTIVITY 1 AND 2 \/\/\/\/ ///////////////////////////
        System.out.print("Enter a number for the number of items in the bubSort array: ");
        int[] bubSort = new int[input.nextInt()]; //this creates the empty array with the size chosen by user

        System.out.print("Enter a number for the number of items in the selSort array: ");
        int[] selSort = new int[input.nextInt()]; //this creates the empty array with the size chosen by user

        int temp2;
        Random num = new Random(); ///going foward, i understood "random ints" being any number (positive or negative) that can be held in an int or a range of approx. -2,147,483,648 to 2,147,483,647

        for (int i = 0; i < bubSort.length; i++)  
            bubSort[i] = num.nextInt();            
        
        for (int i = 0; i < selSort.length; i++)  
            selSort[i] = num.nextInt();
            

        System.out.println("The unsorted bubSort array is: " + Arrays.toString(bubSort));
        System.out.println("The unsorted selSort array is: " + Arrays.toString(selSort));
        
        for (int i = 0; i < bubSort.length - 1; i++)
            for(int j = 0; j < bubSort.length - 1 - i; j++)
                if (bubSort[j] > bubSort[j+1])
                {
                    temp2 = bubSort[j];
                    bubSort[j] = bubSort[j+1];                   // bubble sort
                    bubSort[j+1] = temp2;
                }
        System.out.println("The bubble sorted array is: " + Arrays.toString(bubSort)); 
    
        for (int i = 0; i < selSort.length - 1; i++){
            int min = i;
            for (int j = i + 1; j < selSort.length; j++)
                if (selSort[j] < selSort[min])      //sel sort
                    min = j;

            temp2 = selSort[i];
            selSort[i] = selSort[min];
            selSort[min] = temp2;
        }
        System.out.println("The selection sorted array is: " + Arrays.toString(selSort));
        
////////////////////////  /\/\/\/\  CODE FOR ACTIVITY 1 AND 2 /\/\/\/\ ///////////////////////////

////////////////////////  \/\/\/\/  CODE FOR ACTIVITY 3 AND 4 \/\/\/\/ ///////////////////////////
        System.out.print("How many items do you want in this array for bubble sort?: ");
        int size = input.nextInt();

        double running_time = 0.0; //intialized and set time to 0
        long total_time = 0;

        for (int i = 0; i < 1000; i++){
            bubSort = new int[size];
            for (int a = 0; a < bubSort.length; a++)
                bubSort[a] = num.nextInt();
            long start = System.nanoTime(); // time is started after array is filled with n (n being size) items of random ints

            for (int j = 0; j < bubSort.length - 1; j++)
                for(int k = 0; k < bubSort.length - 1 - j; k++)
                    if (bubSort[k] > bubSort[k+1])
                   {
                        temp2 = bubSort[k];
                        bubSort[k] = bubSort[k+1];                   // bubble sort
                        bubSort[k+1] = temp2;
                    }
            long end = System.nanoTime();
            total_time += (end-start);
        }
        //running_time = total_time/1000; //this is in nanoseconds
        running_time = (total_time/1000.0)/1000000.0; // i converted it here into what should be milliseconds
        System.out.println("The number of items sorted was " + size + " items");
        System.out.println("The average running time to sort a single array was " + running_time +" milliseconds");

        System.out.print("How many items do you want in this array for selection sort?: ");
        size = input.nextInt();
    
        running_time = 0.0;
        total_time = 0; // reset both incase

        for (int i = 0; i < 1000; i++){
            selSort = new int[size];
            for (int a = 0; a < selSort.length; a++)
                selSort[a] = num.nextInt();
            long start = System.nanoTime(); //again, time is started after array is filled

            for (int j = 0; j < selSort.length - 1; j++){
            int min = j;
            for (int k = j + 1; k < selSort.length; k++)
                if (selSort[k] < selSort[min])      //sel sort
                    min = k;

            temp2 = selSort[j];
            selSort[j] = selSort[min];
            selSort[min] = temp2;
        }
            long end = System.nanoTime();
            total_time += (end-start);
        }
        //running_time = total_time/1000; //this is in nanoseconds
        running_time = (total_time/1000.0)/1000000.0; // milliseconds
        System.out.println("The number of items sorted was " + size + " items");
        System.out.println("The average running time to sort a single array was " + running_time +" milliseconds");

        
    }
}