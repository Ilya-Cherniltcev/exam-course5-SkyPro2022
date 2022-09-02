public class ExamMain {

        public static void main (String args[]){
            System.out.println("Start Exam tickets...");
            Ticket1 ticket1 = new Ticket1();
            ticket1.getSortedList();
            System.out.println("--------------------");

            Ticket2 ticket2 = new Ticket2();
            ticket2.isPalindrom();

            Ticket3 ticket3 = new Ticket3();
            ticket3.doSubstring();

            exampleWithException();

        }

        private static void exampleWithException() {
            int[] numbers = new int[10];
            String s = "example";
            try {
                System.out.println(numbers[11]);
//                int n = 10;
//                n = n / 0;
            }
            catch (ArithmeticException e){
                    throw new Ticket8Exception();
            }
            catch (IndexOutOfBoundsException e){
                    throw new Ticket8Exception();
            }
        }

        }


