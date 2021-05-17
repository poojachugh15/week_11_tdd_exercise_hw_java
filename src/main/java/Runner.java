public class Runner {
    public static void main(String[] args) {

        Calculator calculate = new Calculator(5, 2, 20.50, 10.20);
        System.out.println(calculate.Add());
        System.out.println(calculate.Subtract());
        System.out.println(calculate.Multiply());
        System.out.println(calculate.Divide());


        WaterBottle waterBottle = new WaterBottle(100);
        System.out.println(waterBottle.Volume());
        System.out.println(waterBottle.drink());
        System.out.println(waterBottle.empty());
        System.out.println(waterBottle.fill());

        Printer printer = new Printer(90, 40, 100);
        System.out.println(printer.getPapers());
        System.out.println(printer.Toner());
        System.out.println(printer.Copies());
        System.out.println(printer.Print());
    }
}





