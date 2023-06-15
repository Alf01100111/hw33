public class FixWorker extends Worker{
    public FixWorker(int id, int hourSalary) {
        super(id, hourSalary);

    }

    @Override
    public double averSalary(int hour) {

        return 1000;
    }
}
