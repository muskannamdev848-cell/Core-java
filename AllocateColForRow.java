public class AllocateColForRow {
    void main() {
        int arr[][] = new int[3][];
        //allocate number of columns in each row

        arr[0] = new int[2]; //row 0 has 2 col
        arr[1] = new int[3]; // row one has 3 col
        arr[2] = new int[5]; // row 2 has 5 col

        System.out.println("row 0 has " +arr[0].length);
        System.out.println("row 1 has " +arr[1].length);
        System.out.println("row 2 has " +arr[2].length);
    }
}