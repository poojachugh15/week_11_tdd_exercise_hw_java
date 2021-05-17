public class Printer {

    private int papers;
    private int copies;
    private int toner;

    public Printer(int papers, int copies, int toner) {
        this.papers = papers;
        this.copies = copies;
        this.toner = toner;
    }

    public int getPapers() {
        return papers;
    }

    public int Toner() {
        return toner;
    }

    public int Copies() {
        return copies;
    }


    public int Print() {
        if (papers >= copies) {
            papers -= copies;
            toner -= copies;
        }
        return papers;



    }
}


// Printer
//Create a Printer class that has a property for number of sheets of paper left.
//Add a method to print that takes in a number of pages and number of copies.
//The print method will only run if the printer has enough paper.
// If it runs it will reduce the value of the paper left by number of copies * number of pages.
//Add a toner volume property to the class.
//Modify the printer so that it reduces the toner by 1 for each page printed.