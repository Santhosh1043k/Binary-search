public class Main {
    public static void main(String[] args) {
        int num[] ={1,2,3,4,5};
        int target = 4;
        int result = binarySearch(num,target);
        if(result != -1){
            System.out.println("Element found: "+result);
        }else{
            System.out.println("Element not found");
        }
    }

    public static int binarySearch(int[] num, int target) {
       // 1,2,3,4,5
        int left = 0;
        int right = num.length-1;
        while (left <= right){
            int mid = (left+right)/2;
            if(num[mid]==target){
                return mid;
            } else if (num[mid]<target) {
                left = mid+1;

            }else {
                right = mid -1;
            }
        }
        return -1;

    }


    }
