package Workers.in;
public class Worker {
        private int hours;
        private double payRate;
        public void  setData(int h, double pr){
            hours=h;
            payRate=pr;
        }
        public double getSalary(){

            if(hours<=40){
                 return payRate*hours;
            }
            else{
             return ((40*payRate))+(hours-40)*2*payRate;
            }
        }
}
