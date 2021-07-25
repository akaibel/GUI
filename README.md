# GUI
Die Klasse GUI.java gibt eine grafische Oberflaeche fuer eine beliebige Java-Klasse.

Man setzt sie z.B. so ein:

public class MyClass{
  private int a = 7;
  
  public int getA(){return a;}
  
  public static void main(String[] args){
    new GUI(new MyClass());
  }
}

Mit STRG + kann man die Schrift vergroessern,
mit STRG - verkleinern.
