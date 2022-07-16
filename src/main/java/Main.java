import ru.netology.sqr.MavenSqr.services.SQRService;

public class Main {

    public static void main(String[] args) {
        SQRService service = new SQRService();
        System.out.println("Количество чисел перебираемых от 10 до 99 с шагом 1" +
                ", при возведении в квадрат" +
                " которых, результат входит в границы диапазона 200 - 300 = "
                + service.rangeLimit(200, 300));
    }
}
