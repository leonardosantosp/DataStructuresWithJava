public class Teste {
  public static void main(String[] args) {
    Vetor vetor = new Vetor(4);
    vetor.insert("element 1");
    vetor.insert("element 2");
    vetor.insert("element 3");

    System.out.println(vetor.toString());

    System.out.println(vetor.vectorSize());

    System.out.println(vetor.search(2));
    System.out.println(vetor.checkElementExists("element 2"));
    vetor.insertAnywhere(1, "element 4");
    System.out.println(vetor.toString());
    vetor.insert("element4");
    System.out.println(vetor.insert("element 5"));
    System.out.println(vetor.vectorSize());
    System.out.println(vetor.toString());
    vetor.removeItem(2);
    System.out.println(vetor.toString());
  }

}