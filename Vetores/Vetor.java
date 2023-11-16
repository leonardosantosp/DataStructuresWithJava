public class Vetor {
  private String[] elementos;
  private int proxInserir;

  public Vetor(int capacidade) {
    this.elementos = new String[capacidade];
    this.proxInserir = 0;
  }

  public Boolean adciona(String elemento) {
    if (this.proxInserir < this.elementos.length) {
      this.elementos[this.proxInserir] = elemento;
      this.proxInserir++;
      return true;
    }
    return false;
  }

  public void escreve() {
    for (int i = 0; i < this.proxInserir; i++) {
      System.out.println(this.elementos[i]);
    }
  }
}
