public class Main {
    public static void main(String[] args) {

        Worker wk1 = new hourWorker(1,20);
        Worker wk2 = new FixWorker(1, 20);

        System.out.println(wk1.averSalary(wk1.getHourSalary()));
        System.out.println(wk2.averSalary(wk2.getHourSalary()));

        Worker[] arrayWk;
        arrayWk = new Worker[] {wk1, wk2};

        System.out.println(wk1.toString() + wk2.toString());
    }
}
