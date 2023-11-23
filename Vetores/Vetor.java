
public class Vetor {
  private String[] elements;
  private int size;

  public Vetor(int capacity) {
    this.elements = new String[capacity];
    this.size = 0;
  }

  public Boolean insert(String elements) {
    if (this.size < this.elements.length) {
      this.elements[this.size] = elements;
      this.size++;
      return true;
    }
    return false;
  }

  @Override
  public String toString() {
    StringBuilder s = new StringBuilder();

    s.append("[");

    for (int i = 0; i < this.size - 1; i++) {
      s.append(this.elements[i]);
      s.append(" ,");
    }

    if (this.size > 0) {
      s.append(this.elements[this.size - 1]);
    }

    s.append(" ]");
    return s.toString();
  }

  public int vectorSize() {
    return this.elements.length;
  }

  public String search(int position) {
    if (position >= this.size || position < 0) {
      throw new IllegalArgumentException("Position is invalid!");
    }
    return this.elements[position];
  }

  public int checkElementExists(String element) {
    for (int i = 0; i < this.size; i++) {
      if (this.elements[i].equals(element)) {
        return i;
      }
    }
    return -1;
  }

  public boolean insertAnywhere(int pos, String element) {
    if (!(pos >= 0 && pos < size)) {
      throw new IllegalArgumentException("Posição Inválida!");
    }

    for (int i = size; i >= pos; i--) {
      this.elements[i + 1] = this.elements[i];
    }
    this.elements[pos] = element;
    this.size++;

    return true;
  }
}
