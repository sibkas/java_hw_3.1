public class Main {
    public static void main(String[] args) {
        CalcService service = new CalcService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles);
        }
}