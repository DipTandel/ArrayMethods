public class ArrayMethodsGroupChallenge {
  public static void main(String[] args) {
    
    int[] nums = new int[10];
    nums = changeArray(nums,1,2,3,4,5,6,7,8,9,10);
    System.out.println("Reverse Display");
    reverseDisplay(nums);
    nums = checkerBoard(nums);
    System.out.println("\nDisplay");
    display(nums);
    System.out.println("\nSum");
    System.out.println(sumElements(nums));
    System.out.println("Average");
    average(nums);
    System.out.println("Square Array");
    nums = square(nums);
    display(nums);
    System.out.println("\nMinimum Number");
    System.out.println(findMin(nums));
    System.out.println("Search Position");
    searchPosition(nums,1);
    System.out.println("\nFind Element");
    System.out.println(findElement(nums,2));
  }
  
  
  public static int[] initializeArray(int[] nums) {
    for (int i = 0; i < 10; i++) {
      nums[i] = -1;
    }
    return nums;
  }
  
  public static int[] changeArray(int[] nums, int n1, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {    
    nums [0] = n1;
    nums [1] = n2;
    nums [2] = n3;
    nums [3] = n4;
    nums [4] = n5;
    nums [5] = n6;
    nums [6] = n7;
    nums [7] = n8;
    nums [8] = n9;
    nums [9] = n10;
    return nums;
  }
  
  public static int[] checkerBoard(int[] nums) {    
    for (int i = 0; i < 10; i++) {
      if (i % 2 == 0) {
        nums[i] = 0;
      }
      else {
        nums[i] = 1;
      }
    }
    return nums;
  }
  
  public static int sumElements(int[] nums) {   
    int sum = 0;
    for (int i = 0; i < 10; i++) {
      sum = sum + nums[i];
    }
    return sum;
  }
  
  public static void display(int[] nums) {
    for (int i = 0; i < 10; i++) {
      System.out.print(nums[i] + " ");
    }
  }
  
  public static void reverseDisplay(int[] nums) {
    for (int i = 9; i >= 0; i--) {
      System.out.print(nums[i] + " ");
    }
  }
  
  public static double average(int[] nums) {
    double sum = 0;
    for (int i = 0; i < 10; i++) {
      sum = sum + nums[i];
    }
    return (sum/10);
  }
  
  public static int findMax(int[] nums) {
    int max = nums[0];
    for (int i = 0; i < 10; i++) {
      if (nums[i] > max) {
        max = nums[i];
      }
    }
    return max;
  }
  
  public static int findMin(int[] nums) {
    int min = nums[0];
    for (int i = 0; i < 10; i++) {
      if (nums[i] < min) {
        min = nums[i];
      }
    }
    return min;
  }
  
  public static int[] square(int[] nums) {
    for (int i = 0; i < 10; i++) {
      nums[i] = nums[i] * nums[i];
    }
    return nums;
  }
  
  public static void searchPosition(int[] nums, int s) {
    System.out.print("the number " + s + " is found in positions: ");
    for (int i = 0; i < 10; i ++) {
      if (nums[i] == s) {
        System.out.print(i + " ");
      }
    }
  }
  
  public static boolean findElement(int[] nums, int s) {
    boolean check = false;
    for (int i = 0; i < 10; i++) {
      if (nums[i] == s) {
        check = true;
      }
    }
    return check;
  }
  
}
  
  
  
  
  
  
  