
void main() {

   //
    // int[] arr = new int[]{1, 2, 3, 4, -4, 5, 4, 6, -2};
  int [] arr=new int[5];
  Random random=new Random();
  for(int i=0; i<arr.length; i++){
      arr[i]= random.nextInt();
  }
    int min = arr[0];
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] < min) {
            min = arr[i];
        }
    }
    System.out.println("Минимальное число в массиве " + min);

    int[][] arr2 = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
    };
    int sum = 0;
    int chislo = 0;
    for (int i = 0; i < arr2.length; i++) {
        for (int j = 0; j < arr2.length; j++) {
            if (i > j) {
                sum += arr2[i][j];
                chislo++;
            }
        }
    }

    System.out.println("Число элементов " + chislo);
    System.out.println("Сумма элементов " + sum);


}