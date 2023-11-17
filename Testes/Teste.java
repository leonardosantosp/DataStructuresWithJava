public class Teste {
  public static void main(String[] args) {
    Vetor vetor = new Vetor(10);
    vetor.insert("element 1");
    vetor.insert("element 2");
    vetor.insert("element 3");

    System.out.println(vetor.toString());

    System.out.println(vetor.vectorSize());

    System.out.println(vetor.search(2));

  }

}