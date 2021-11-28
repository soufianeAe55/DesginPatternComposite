import comp.File;
import comp.Folder;

public class Test {
    public static void main(String[] args) {
        Folder root= new Folder("Desgin patterns");
        Folder d1=(Folder) root.addComposant(new Folder("Comportement"));
        Folder d2=(Folder) root.addComposant(new Folder("Structure"));
        Folder d3=(Folder) root.addComposant(new Folder("Creation"));
        d1.addComposant(new File("Strategy"));
        d1.addComposant(new File("Observer"));
        d2.addComposant(new File("Decorateur"));
        d2.addComposant(new File("Composite"));
        d3.addComposant(new File("Adapter"));
        d3.addComposant(new File("Singleton"));
        root.show();
    }
}
