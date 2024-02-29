
public class Teste {
  public static void main(String[] args) {
    Vetor vetor = new Vetor(4);
    VetorObject teste = new VetorObject(5);
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

    VetorObject vetorObject = new VetorObject(3);
    vetorObject.insert(3);
    vetorObject.insert("s");
    vetorObject.insert(4.1);
    System.out.println(vetorObject);

    Contact c1 = new Contact("Leonardo", "35-12345", "leonardo@gmail.com");
    Contact c2 = new Contact("Gu", "35-54321", "gu123@gmail.com");

    teste.insert(c1);
    teste.insert(c2);

    System.out.println(teste);

    List<String> listVector = new List<String>(1);
    listVector.insert("element");

  }

}