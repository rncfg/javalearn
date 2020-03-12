package JavaLearn1;

public class Arrays {
    public static void main(String[] args){
        int [] arr = new int [3];//обозначение массива на 3 элемента
        arr[0] = 23;
        arr[2] = 657;

        System.out.println(arr[2]);
        float [] arr1 = new float[] {56.f,45.25f,3.2f};
        for (int i = 0; i<4; i++ ){
            System.out.println("Element i is" +arr[i]);
        }

    }
}
