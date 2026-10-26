import java.util.Scanner;

void main() {
    Scanner in = new Scanner(System.in);
    System.out.print("Введите целое число (от 1 до 3): ");
    int vvod = in.nextInt();

    switch (vvod) {
        case 1:
            System.out.print("Введите целое число: ");
            int a = in.nextInt();
            System.out.print("Введите целое число (меньше чем 1 введенное): ");
            int b = in.nextInt();
            System.out.println(a - b);
            break;
        case 2:
            System.out.print("Введите целое число: ");
            int c = in.nextInt();
            System.out.print("Введите целое число (не равное прошлому): ");
            int d = in.nextInt();
            if (c > d) {
                System.out.println(c);
            } else {
                System.out.println(d);
            }
            break;
        case 3:
            System.out.print("Введите целое число(не отрицательное): ");
            int f = in.nextInt();
            int sum = 0;
//            for (int i = 0; i <= f; i++) {
//                sum += i;
//            }
            int i=0;
            do{
               i+=1;
               sum+=i;

            }while(i<f-1);
            System.out.print(sum);
            break;
        default:
            System.out.print("Введенное значение некорректно");
    }
}
