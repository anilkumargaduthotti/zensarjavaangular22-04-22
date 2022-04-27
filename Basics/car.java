package Basics;

public class car {
        String brandName;
        int speed;
        double mileage;
        public car(String brandName, int speed, double mileage){
            this.brandName = brandName;
            this.speed = speed;
            this.mileage = mileage;
        }

        @Override
        public String toString() {
            return "Brand Name = " + brandName + "\nSpeed = " + speed + "\nMileage = " + mileage;
        }

        public String getBrandName() {
            return brandName;
        }
        public void setBrandName(String brandName) {
            this.brandName = brandName;
        }
        public int getSpeed() {
            return speed;
        }
        public void setSpeed(int speed) {
            this.speed = speed;
        }
        public double getMileage() {
            return mileage;
        }
        public void setMileage(double mileage) {
            this.mileage = mileage;
        }
        
}
class mainclass {
    public static void main(String[] args) {
        car c1 = new car ("Audi ", 240, 4.3);
        car c2 = new car ("BMW ", 250, 5.6);

        c2.setBrandName("Ferrari");

        System.out.println(c1);
        System.out.println(c2);
    }
}