package comp;

public class File extends composant{
    public File(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println(tab()+"File :"+name);
    }
}
