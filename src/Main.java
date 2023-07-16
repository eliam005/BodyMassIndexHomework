public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        int bmi = (int) service.calculate(1.87, 98);
        System.out.println("Индекс массы тела составляет: " + bmi);

    }
}