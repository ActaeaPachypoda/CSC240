public class Adder {
    private int addend;
    private int addend2;
    public Adder(int addend) {
        this.addend = addend;
    }
    public int add(int anddend2){
      int sum = addend+anddend2;
      return sum;
    }
    public String toString(){
        int temp = addend;
        String adderPrint= Integer.toString(temp);
        return adderPrint;
    }
}