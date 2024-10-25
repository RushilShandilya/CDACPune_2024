public class ArrayPractice {
    public static int deleteFromPosition(int[] arr , int n , int pos) throws IndexOutOfBoundsException{
        if(pos<0 || pos>=arr.length) throw new IndexOutOfBoundsException("The position entered is wrong");
        arr[pos]=0;

        for(int i = pos ; i<arr.length-1 ; ++i){
            arr[i] = arr[i+1];
        }
        return n-1;
    }
    public static void print(int[] arr,int size){
        for(int i = 0 ; i<size ; ++i) System.out.print(arr[i] + " ");

        System.out.println();
    }
    public static void main(String[] args){
        try {
            int[] array = new int[]{1, 2, 3, 4, 5, 6};
            print(array,array.length);

            int size = deleteFromPosition(array, array.length, 3);
            print(array, size);

            size = deleteFromPosition(array, size, 2);
            print(array, size);

            size = deleteFromPosition(array, size, 4);
            print(array, size);
        }catch(IndexOutOfBoundsException e) {
            System.out.println("Exception message : " + e.getMessage());
        }
    }
}
