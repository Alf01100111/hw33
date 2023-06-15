public abstract class Worker {
    private int id;
    private int hourSalary;

    public Worker(int id, int hourSalary) {
        this.id = id;
        this.hourSalary = hourSalary;
    }

    public int getId() {
        return id;
    }

    public int getHourSalary() {
        return hourSalary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHourSalary(int hourSalary) {
        this.hourSalary = hourSalary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", hourSalary=" + hourSalary +
                '}';
    }

    public abstract double averSalary(int hour);
}
