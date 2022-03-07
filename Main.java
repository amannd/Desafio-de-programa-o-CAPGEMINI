class Main {  
  public static void main(String args[]) { 
    int[] nums = new int[7];
    nums[0] = 9;
    nums[1] = 2;
    nums[2] = 1;
    nums[3] = 4;
    nums[4] = 6;
    nums[5] = 7;
    nums[6] = 3;
    
    int media = 0;
    for(int i = 0; i<nums.length; i++)
      {
        media += nums[i];
      }
    float total = media / nums.length;
    System.out.println("A média é: " + total);
  } 
}