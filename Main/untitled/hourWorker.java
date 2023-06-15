public class hourWorker extends Worker{

    public hourWorker(int id, int hourSalary) {
        super(id, hourSalary);
    }

    @Override
    public double averSalary(int hour) {

        return 20.8 * 8 * hour;
    }
}
