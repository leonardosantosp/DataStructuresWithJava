
public class Vetor {
  private String[] elements;
  private int nextInsert;

  public Vetor(int capacity) {
    this.elements = new String[capacity];
    this.nextInsert = 0;
  }

  public Boolean insert(String elements) {
    if (this.nextInsert < this.elements.length) {
      this.elements[this.nextInsert] = elements;
      this.nextInsert++;
      return true;
    }
    return false;
  }

  @Override
  public String toString() {
    StringBuilder s = new StringBuilder();

    s.append("[");

    for (int i = 0; i < this.nextInsert - 1; i++) {
      s.append(this.elements[i]);
      s.append(" ,");
    }

    if (this.nextInsert > 0) {
      s.append(this.elements[this.nextInsert - 1]);
    }

    s.append(" ]");
    return s.toString();
  }

  public int vectorSize() {
    return this.elements.length;
  }

  public String search(int position) {
    if (position >= this.nextInsert || position < 0) {
      throw new IllegalArgumentException("Position is invalid!");
    }
    return this.elements[position];
  }

  public int checkElementExists(String element) {
    for (int i = 0; i < this.nextInsert; i++) {
      if (this.elements[i].equals(element)) {
        return i;
      }
    }
    return -1;
  }

}
