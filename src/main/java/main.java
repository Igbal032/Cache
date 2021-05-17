public class main {

    public static void main(String[] args) {
        Cashe<Integer> Cashe = new Cashe<>();
        Cashe.addElement(1);
        Cashe.addElement(2);
        Cashe.addElement(3);
        Cashe.addElement(4);
        Cashe.addElement(5);
        Cashe.addElement(5);
        Cashe.addElement(6);
        Cashe.addElement(7);
        Cashe.addElement(8);
        Cashe.addElement(9);
        Cashe.addElement(10);
        Cashe.addElement(11);
        Cashe.addElement(12);
        Cashe.addElement(13);
        Cashe.addElement(14);


        Cashe.print();

        System.out.println(Cashe.get(9)+" : get for index");
    }

}
