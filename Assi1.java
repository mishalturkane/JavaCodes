package mishal;

        public class Assi1 {
            public static void main(String[] args) {
                int age;
                age=Integer.parseInt(args[0]);

                if(args[2].equalsIgnoreCase("married"))
                    System.out.println("Insurance Given");
                else if(args[1].equalsIgnoreCase("male") && age>35)
                    System.out.println("Insurance given");
                else if(args[1].equalsIgnoreCase("female") && age>30)
                System.out.println("Insurance given");
             else
                System.out.println("Insurance not given");
            }
        }

