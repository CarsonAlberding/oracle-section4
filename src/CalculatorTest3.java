public class CalculatorTest3 {
    public static void main(String[] args) {
        
       Calculator3 calc = new Calculator3();
       
       //Use the Calculator object and arguments supplied to findTotal()
       //to print the total for each person

        calc.findTotal(10, "Person1");
        calc.findTotal(12, "Person2");
        calc.findTotal(9, "Person3");
        calc.findTotal(8, "Person4");
        calc.findTotal(7, "Person5");
        calc.findTotal(15, "Person6");
        calc.findTotal(11, "Person7");
        calc.findTotal(30, "Person8");


       
       
       /*This is what everyone owes before tax and tip:
       Person 1: $10
       Person 2: $12
       Person 3: $9
       Person 4: $8
       Person 5: $7
       Person 6: $15 (Alex)
       Person 7: $11
       Person 8: $30
       */
    }    
}
