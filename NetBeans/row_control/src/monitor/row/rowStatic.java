package monitor.row;

import java.util.LinkedList;
import java.util.List;

import model.row.rowUsuario;

public class rowStatic {
  
  private List<rowUsuario> nomes = new LinkedList<rowUsuario>();
    private Object jLabelFila1;
    public static int contador = 0;

  public void insere(rowUsuario objeto) {
    this.nomes.add(objeto);
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
