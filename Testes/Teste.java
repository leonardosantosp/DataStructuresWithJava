import java.util.ArrayList;

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

    ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("A");
    arrayList.add("C");

    System.out.println(arrayList);
    arrayList.add(1, "B");
    System.out.println(arrayList);
    boolean exist = arrayList.contains("A");
    System.out.println(exist);
    int pos = arrayList.indexOf("A");
    System.out.println("o item está no índice: " + pos);
    System.out.println(arrayList.get(2));

    arrayList.remove(0);
    arrayList.remove("B");
    System.out.println(arrayList);
    System.out.println(arrayList.size());

    List<String> list = new List<String>(5);

    list.insert("A");
    list.insert("B");
    list.insert("C");

    System.out.println(list.contain("A"));
    System.out.println(list.contain("B"));
    System.out.println(list.contain("E"));

    List<String> list2 = new List<String>(5);
    list2.insert("A");
    list2.insert("B");
    list2.insert("C");
    list2.insert("D");
    list2.insert("A");

    System.out.println(list2.lastIndexOf("A"));
  }

}