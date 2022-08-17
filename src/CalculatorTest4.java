public class CalculatorTest4 {
    public static void main(String[] args) {
        
        Calculator4 calc = new Calculator4();
        
        //Name your friends
        calc.findTotal(55, null);
        calc.findTotal(12, null);
        calc.findTotal(9,  null);
        calc.findTotal(8,  null);
        calc.findTotal(7,  null);
        calc.findTotal(0, "Alex");
        calc.findTotal(11, null);
        calc.findTotal(0, "Forgetful");

        //Find and print the entire table's total, including tax and tip
        calc.findTotal(102, "Total");
       
    } 
}
