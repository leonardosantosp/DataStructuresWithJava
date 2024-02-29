
public class Vetor {
  private Object[] elements;
  private int size;

  public Vetor(int capacity) {
    this.elements = new Object[capacity];
    this.size = 0;
  }

  public Boolean insert(Object elements) {
    this.increasesCapacity();
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

  public Object search(int position) {
    if (position >= this.size || position < 0) {
      throw new IllegalArgumentException("Position is invalid!");
    }
    return this.elements[position];
  }

  public int checkElementExists(Object element) {
    for (int i = 0; i < this.size; i++) {
      if (this.elements[i].equals(element)) {
        return i;
      }
    }
    return -1;
  }

  public boolean insertAnywhere(int pos, Object element) {

    if (!(pos >= 0 && pos < size)) {
      throw new IllegalArgumentException("Position is Invalid!");
    }

    this.increasesCapacity();

    for (int i = this.size - 1; i >= pos; i--) {
      this.elements[i + 1] = this.elements[i];
    }
    this.elements[pos] = element;
    this.size++;

    return true;
  }

  private void increasesCapacity() {
    if (this.elements.length == this.size) {
      Object[] newElements = new Object[this.elements.length * 2];
      for (int i = 0; i < this.elements.length; i++) {
        newElements[i] = this.elements[i];
      }
      this.elements = newElements;
    }
  }

  public void removeItem(int pos) {
    if (!(pos >= 0 && pos < this.size)) {
      throw new IllegalArgumentException("Position is invalid!");
    }
    for (; pos < this.elements.length - 1; pos++) {
      this.elements[pos] = this.elements[pos + 1];
    }
    this.elements[pos] = null;
  }

}
