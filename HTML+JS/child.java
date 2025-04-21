public class child extends parent{
    public void beta(){
        System.out.println("Job, GF");
    }
    @Override
    public void property(){
        System.out.println("Car");
    }

    public static void main(String[] args) {
        child c = new child();

        c.setId(1);
        c.setName("Hero");

        c.display();
    }
}
