package Assignment3.Assignment_3_2;

public class Task7 {
    public static class Programmer {
        private int salary = 1000;

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            if (salary > this.salary) {
                this.salary = salary;
            }
        }

        public static void main(String[] args) {
            Programmer programmer = new Programmer();
            System.out.println("Current salary: " + programmer.getSalary());
            programmer.setSalary(1200);
            System.out.println("Updated salary: " + programmer.getSalary());
            programmer.setSalary(800);
            System.out.println("Salary after trying to decrease: " + programmer.getSalary());
        }
    }
}
