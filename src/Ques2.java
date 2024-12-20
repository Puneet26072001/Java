public class Ques2 {
    String name;
    String jobtitle;
    double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void updateSalary(double updated salary)
    {
        this.salary=salary;
    }
    public int yearlySalary()
    {
        return this.salary*12;
    }
}
