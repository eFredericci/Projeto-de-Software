package monitor.row;

import java.util.LinkedList;
import java.util.List;

import model.row.rowUsuario;

public class rowStatic {
  
  private final List<rowUsuario> nomes = new LinkedList<>();
    private Object jLabelFila1;
    public static int contador = 0;

  public void insere(rowUsuario nome) {
    this.nomes.add(nome);
    contador ++;
  }

  public Object remove() {
    contador --;
    return this.nomes.remove(0);
  }

  public boolean vazia() {
    return this.nomes.isEmpty();
  }
}
