package add;

    public class Sum {
        private int first,second;
        private double sum;

        Sum(){
            System.out.println("Constructor called");
        }

        public void setNum(int a,int b){
            first=a;
            second=b;
        }
        public double getSum(){
            return sum=first+second;
        }


}
