import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //todo код программы писать тут
        double[] arr = new double[10];
        double heavyWeight = 0, sum = 0;

        for(int i = 0; i< arr.length; i++){
            arr[i] = (new Random().nextDouble() * 60) + 40;
            if(arr[i] >= 60 && arr[i] <= 80){
                heavyWeight++;
            }
            sum += arr[i];
        }
        sum = sum/ arr.length;

        for(double num : arr){
            System.out.print(num + " ");
        }
        System.out.println("\nСредний вес всех людей: " + sum);
        System.out.println("Количество людей у которых вес находится в промежутке от 60 до 80 кг: " + heavyWeight);
    }
}
