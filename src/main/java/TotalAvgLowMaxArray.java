/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acroy
 */
public class TotalAvgLowMaxArray {
      public static void main(String[] args) {

    double total, average, highest, lowest;

    double[] numbers = {1,2,5,10,20};
  
    total = getTotal(numbers);
    average = getAverage(numbers);
    highest = getHighest(numbers);
    lowest = getLowest(numbers);
    
    System.out.printf("The total value of the array is %.2f.\n",total);
    System.out.printf("The average value of the array is %.2f.\n",average);
    System.out.printf("The highest value of the array is %.2f.\n",highest);
    System.out.printf("The lowest value of the array is %.2f.\n",lowest);
    
  }
  
  public static double getTotal(double[] array){
    double total = 0.0;
    for (int index = 0; index < array.length; index++)
      total += array[index];
    return total;
  }

  public static double getAverage(double[] array){
    double total = 0.0, average = 0.0;
    for (int index = 0; index < array.length; index++)
      total += array[index];
    average = total/array.length;
    return average;
  }

  public static double getHighest(double[] array){
    double highest = array[0];
    for (int index = 1; index < array.length; index++){
      if (array[index] > highest)
        highest = array[index];
    }
    return highest;
  }

  public static double getLowest(double[] array){
    
    double lowest = array[0];
    
    for (int index = 1; index < array.length; index++){
      if (array[index] < lowest)
        lowest = array[index];
    }

    return lowest;
  }
}
