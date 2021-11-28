package comp;

import java.util.ArrayList;
import java.util.List;

public class Folder extends  composant{
    private List<composant> childs= new ArrayList<>();
    public Folder(String name) {
        super(name);
    }
    public composant addComposant(composant c){
        c.level=this.level+1;
        childs.add(c);
        return c;
    }
    @Override
    public void show() {
        System.out.println(tab()+"File :"+name);
        for(composant c: childs){
            c.show();
        }
    }
}
